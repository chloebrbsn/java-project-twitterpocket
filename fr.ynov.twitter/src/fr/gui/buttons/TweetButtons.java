package fr.gui.buttons;

import javax.swing.*;
import java.awt.*;

/**
 *  This class contains everything needed to initialize the tweet buttons.
 */

public class TweetButtons extends JPanel {
    private final LikeButton likeButton;
    private final JButton commentButton;
    private final JButton rtButton;

    /**
     * TweetButtons is the constructor for the interaction buttons of the tweets.
     * It sets a style and a position to the buttons, and make sure to create them.
     */
    public TweetButtons() {
        Color twtBlue = new Color(0, 172, 237);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setBackground(Color.WHITE);

        likeButton = new LikeButton();
        commentButton = new JButton("💬 Comment");
        rtButton = new JButton("\uD83D\uDD01 RT");

        likeButton.setBackground(twtBlue);
        likeButton.setForeground(Color.WHITE);

        commentButton.setBackground(twtBlue);
        commentButton.setForeground(Color.WHITE);

        rtButton.setBackground(twtBlue);
        rtButton.setForeground(Color.WHITE);

        this.add(likeButton.getLikeButtonPanel());
        this.add(commentButton);
        this.add(rtButton);
    }
}
