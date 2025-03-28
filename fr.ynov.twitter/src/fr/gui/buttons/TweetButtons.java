package fr.gui.buttons;

import javax.swing.*;
import java.awt.*;

public class TweetButtons extends JPanel {
    private final JButton likeButton;
    private final JButton commentButton;
    private final JButton rtButton;

    public TweetButtons() {
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.setBackground(Color.WHITE);

        likeButton = new JButton("❤️ Like");
        commentButton = new JButton("💬 Comment");
        rtButton = new JButton("\uD83D\uDD01 RT");

        this.add(likeButton);
        this.add(commentButton);
        this.add(rtButton);
    }
}
