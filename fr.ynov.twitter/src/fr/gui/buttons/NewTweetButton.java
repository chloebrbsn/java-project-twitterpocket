package fr.gui.buttons;

import fr.gui.frames.NewTweetFrame;
import fr.gui.frames.HomeFrame;
import javax.swing.*;
import java.awt.*;

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

