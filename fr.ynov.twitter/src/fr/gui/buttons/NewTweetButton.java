package fr.gui.buttons;

import fr.gui.frames.NewTweetFrame;
import fr.gui.frames.HomeFrame;
import javax.swing.*;
import java.awt.*;

/**
 * Panel containing the "new tweet" button, allowing users to create a new tweet.
 * When clicked, it opens a new frame where the user can create and post a tweet.
 */
public class NewTweetButton extends JPanel {

    public NewTweetButton(HomeFrame homeFrame) {
        Color twtBlue = new Color(0, 172, 237);
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JButton newTweetButton = new JButton("New Tweet");
        newTweetButton.setBackground(twtBlue);
        newTweetButton.setForeground(Color.WHITE);

        newTweetButton.addActionListener(e -> {
            NewTweetFrame newTweetFrame = new NewTweetFrame(homeFrame);
            newTweetFrame.setVisible(true);
        });
        this.add(newTweetButton);
    }
}

