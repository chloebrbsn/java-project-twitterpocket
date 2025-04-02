package fr.gui.frames;

import fr.domain.Tweets;
import fr.gui.buttons.NewTweetButton;
import fr.gui.panels.TweetsPanel;

import java.awt.*;

/**
 * The main application's frame that serves as the homepage.
 * It displays tweets and buttons and allows users to create new tweets.
 */
public class HomeFrame extends FrameBase {

    private final TweetsPanel tweetsPanel;

    public HomeFrame() {
        super("Twitter pocket");

        tweetsPanel = new TweetsPanel();
        add(tweetsPanel, BorderLayout.CENTER);

        NewTweetButton newTweetButton = new NewTweetButton(HomeFrame.this);
        add(newTweetButton, BorderLayout.SOUTH);
        setVisible(true);
    }

    public void addTweetToPanel (Tweets tweet) {
        tweetsPanel.addTweet(tweet);
    }
}

