package fr.gui.frames;

import fr.domain.Tweets;
import fr.domain.User;
import fr.gui.buttons.TweetButtons;
import fr.gui.panels.TweetsPanel;

import javax.swing.*;
import java.awt.*;

public class HomeFrame extends FrameBase {

    public HomeFrame(String title) {
        super();
        JFrame frame = new JFrame("Home");

        TweetsPanel tweetsPanel = new TweetsPanel();
        add(tweetsPanel, BorderLayout.CENTER);

        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));
        tweetsPanel.addTweet(new Tweets(new User("New Profile"), "Hello world!"));

        setVisible(true);
    }
}
