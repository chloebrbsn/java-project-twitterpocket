package fr.domain;

public class Tweets {

    private final String message;
    private final User user;
    private static final int MAX_LENGTH = 280;

    public Tweets(User user, String message) {
        this.user = user;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }

    public static int getMaxLength() {
        return MAX_LENGTH;
    }
}
