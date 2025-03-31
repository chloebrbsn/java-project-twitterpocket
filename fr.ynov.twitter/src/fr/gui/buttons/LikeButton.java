package fr.gui.buttons;

import javax.swing.*;
import java.awt.*;

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

    public JPanel getLikeButtonPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.setBackground(Color.WHITE);

        panel.add(this);
        panel.add(likeLabel);

        return panel;
    }
}
