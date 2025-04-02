package fr.gui.panels;

import fr.domain.Comment;
import fr.domain.Tweets;
import fr.domain.User;

import javax.swing.*;
import java.awt.*;

public class CommentPanel extends JPanel {
    private final Tweets tweet;
    private final JPanel commentListPanel;
    private final JTextField commentField;

    public CommentPanel(Tweets tweet) {
        this.tweet = tweet;
        this.setLayout(new BorderLayout());

        commentListPanel = new JPanel();
        commentListPanel.setLayout(new BoxLayout(commentListPanel, BoxLayout.Y_AXIS));
        updateComments();

        commentField = new JTextField(20);
        JButton commentButton = new JButton("Commenter");
        commentButton.addActionListener(e -> addComment());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        inputPanel.add(commentField);
        inputPanel.add(commentButton);

        this.add(commentListPanel, BorderLayout.CENTER);
        this.add(inputPanel, BorderLayout.SOUTH);
    }

    private void updateComments() {
        commentListPanel.removeAll();
        for (Comment comment : tweet.getComments()) {
            JLabel commentLabel = new JLabel(comment.getUser().getUsername() + " : " + comment.getText());
            commentListPanel.add(commentLabel);
        }
        commentListPanel.revalidate();
        commentListPanel.repaint();
    }

    private void addComment() {
        String text = commentField.getText().trim();
        if (!text.isEmpty()) {
            tweet.addComment(new Comment(new User("Anonymous"), text));
            commentField.setText("");
            updateComments();
        }
    }
}