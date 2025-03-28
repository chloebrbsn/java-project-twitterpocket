package fr.gui.frames;

import fr.domain.Tweets;
import fr.domain.User;

import javax.swing.*;
import java.awt.*;

public class NewTweetFrame extends JFrame {
    private final JTextField preTweet;
    private final HomeFrame homeFrame;

    public NewTweetFrame(HomeFrame homeFrame) {
        super("What's up ?");
        this.homeFrame = homeFrame;
        this.setSize(400, 300);
        //this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        preTweet = new JTextField("What's up?");
        mainPanel.add(preTweet, BorderLayout.CENTER);

        JButton sendTweetButton = new JButton("Send Tweet");
        sendTweetButton.addActionListener(e -> sendTweet());

        mainPanel.add(sendTweetButton, BorderLayout.SOUTH);
        this.add(mainPanel);
    }

    public void sendTweet() {
        String message = preTweet.getText();
        if (!message.isEmpty()) {
            Tweets newTweet = new Tweets(new User("New Profile"), message);
            homeFrame.addTweetToPanel(newTweet);
            dispose();
        }
    }
}

