package fr.domain;

import java.util.ArrayList;
import java.util.List;

public class Tweets {
    private final User user;
    private final String message;
    private final List<Comment> comments;

    public Tweets(User user, String message) {
        this.user = user;
        this.message = message;
        this.comments = new ArrayList<>();
    }

    public User getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }
}
