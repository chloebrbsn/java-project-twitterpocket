package fr.domain;

public class Tweets {
    private final User user;
    private final String message;

    public Tweets(User user, String message) {
        this.user = user;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }
}
