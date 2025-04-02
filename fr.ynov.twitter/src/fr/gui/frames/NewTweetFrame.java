package fr.gui.frames;

import fr.domain.Tweets;
import fr.domain.User;

import javax.swing.*;
import java.awt.*;

/**
 * A frame that allows users to create and post a new tweet.
 */
public class NewTweetFrame extends JFrame {
    private final JTextField usernameField;
    private final JTextArea tweetTextArea;
    private final HomeFrame homeFrame;

    /**
     * Constructor for NewTweetFrame, allowing the user to enter a username and a tweet.
     */
    public NewTweetFrame(HomeFrame homeFrame) {
        super("What's up?");
        this.homeFrame = homeFrame;
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel userPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(15);
        userPanel.add(usernameLabel);
        userPanel.add(usernameField);
        mainPanel.add(userPanel, BorderLayout.NORTH);

        tweetTextArea = new JTextArea("What's up?", 5, 30);
        mainPanel.add(new JScrollPane(tweetTextArea), BorderLayout.CENTER);

        JButton sendTweetButton = new JButton("Send Tweet");
        sendTweetButton.addActionListener(e -> sendTweet());
        mainPanel.add(sendTweetButton, BorderLayout.SOUTH);

        this.add(mainPanel);
    }

    /**
     * Sending a tweet after validating the inputs.
     * Displays an error message if the username or tweet is empty.
     */
    public void sendTweet() {
        try {
            String username = usernameField.getText().trim();
            String message = tweetTextArea.getText().trim();

            if (username.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Username cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (message.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tweet cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Tweets newTweet = new Tweets(new User(username), message);
            homeFrame.addTweetToPanel(newTweet);
            dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred while posting the tweet.", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Error sending tweet: " + e.getMessage());
        }
    }
}
