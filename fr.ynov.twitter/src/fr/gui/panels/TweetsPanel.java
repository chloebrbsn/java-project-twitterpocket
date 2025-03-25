package fr.gui.panels;

import fr.domain.Tweets;
import fr.gui.buttons.TweetButtons;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TweetsPanel extends JPanel {
    private final List<Tweets> tweets;
    private final JPanel tweetsContainer;

    public TweetsPanel() {
        this.tweets = new ArrayList<>();
        this.setLayout(new BorderLayout());

        this.tweetsContainer = new JPanel();
        tweetsContainer.setLayout(new BoxLayout(tweetsContainer, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(tweetsContainer);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        this.add(scrollPane, BorderLayout.CENTER);
    }

    public void addTweet(Tweets tweets) {
        this.tweets.add(tweets);

        JPanel tweetBox = new JPanel();
        tweetBox.setLayout(new BorderLayout());
        tweetBox.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        tweetBox.setBackground(Color.WHITE);
        tweetBox.setMaximumSize(new Dimension(500, 100));

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textPanel.setBackground(Color.WHITE);

        JLabel usernameLabel = new JLabel(tweets.getUser().getUsername());

        JLabel messageLabel = new JLabel(tweets.getMessage());

        textPanel.add(usernameLabel);
        textPanel.add(messageLabel);

        tweetBox.add(textPanel, BorderLayout.CENTER);
        tweetBox.add(new TweetButtons(), BorderLayout.SOUTH);


        tweetsContainer.add(tweetBox);
        tweetsContainer.revalidate();
        tweetsContainer.repaint();
    }
}
