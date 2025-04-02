package fr.gui.buttons;

import javax.swing.*;
import java.awt.*;


/**
 * This class represents a "like" button (with the JLabel likeLabel).
 * It's used to display the likes numbers,
 * and to increment the number (+1, with likeCount) when you click on it.
 */
public class LikeButton extends JButton {
    private int likeCount;
    private final JLabel likeLabel;

    public LikeButton() {

        super("❤️ Like");
        this.likeCount = 0;
        Color twtBlue = new Color(0, 172, 237);

        likeLabel = new JLabel(" " + likeCount);
        likeLabel.setFont(new Font("Arial", Font.BOLD, 14));
        this.setBackground(twtBlue);
        this.setForeground(Color.WHITE);

        this.addActionListener(e -> {
            likeCount++;
            likeLabel.setText(" " + likeCount);
        });
    }

    /**
     * Creates and returns a panel with the like button, and its count.
     */
    public JPanel getLikeButtonPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.setBackground(Color.WHITE);

        panel.add(this);
        panel.add(likeLabel);

        return panel;
    }
}
