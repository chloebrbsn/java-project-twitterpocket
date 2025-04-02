package fr.gui.panels;

import fr.domain.Tweets;
import fr.gui.buttons.TweetButtons;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * A panel that displays a list of tweets in a scrollable container.
 */
public class TweetsPanel extends JPanel {
    private final List<Tweets> tweets;
    private final JPanel tweetsContainer;

    /**
     * Constructs a TweetsPanel with a scrollable list of tweets.
     */
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

    /**
     * Adds a tweet to the panel and updates the display.
     */
    public void addTweet(Tweets tweet) {
        this.tweets.add(tweet);

        try {
            if (tweet == null) {
                throw new IllegalArgumentException("You must provide a Tweet !");
            }

            JPanel tweetBox = new JPanel();
            tweetBox.setLayout(new BorderLayout());
            tweetBox.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            tweetBox.setBackground(Color.WHITE);
            tweetBox.setMaximumSize(new Dimension(500, 180));

            JPanel textPanel = new JPanel();
            textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
            textPanel.setBackground(Color.WHITE);

            JLabel usernameLabel = new JLabel(tweet.getUser().getUsername());
            JLabel messageLabel = new JLabel(tweet.getMessage());

            textPanel.add(usernameLabel);
            textPanel.add(messageLabel);

            TweetButtons tweetButtons = new TweetButtons();

            JPanel bottomPanel = new JPanel();
            bottomPanel.setLayout(new BorderLayout());

            bottomPanel.add(tweetButtons, BorderLayout.NORTH);

            CommentPanel commentPanel = new CommentPanel(tweet);
            bottomPanel.add(commentPanel, BorderLayout.CENTER);

            tweetBox.add(textPanel, BorderLayout.CENTER);
            tweetBox.add(bottomPanel, BorderLayout.SOUTH);

            tweetsContainer.add(tweetBox);
            tweetsContainer.revalidate();
            tweetsContainer.repaint();
        } catch (Exception e) {
            System.err.println("Cannot add the tweet to the list : " + e.getMessage());
        }
    }
}