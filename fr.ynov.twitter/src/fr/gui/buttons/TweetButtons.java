package fr.gui.buttons;

import javax.swing.*;
import java.awt.*;

public class TweetButtons extends JPanel {
    private final JButton commentButton;
    private final JButton rtButton;

    public TweetButtons() {
        Color twtBlue = new Color(0, 172, 237);
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.setBackground(Color.WHITE);

        commentButton = new JButton("💬 Comment");
        rtButton = new JButton("\uD83D\uDD01 RT");

        commentButton.setBackground(twtBlue);
        commentButton.setForeground(Color.WHITE);

        rtButton.setBackground(twtBlue);
        rtButton.setForeground(Color.WHITE);

        this.add(commentButton);
        this.add(rtButton);
    }
}
