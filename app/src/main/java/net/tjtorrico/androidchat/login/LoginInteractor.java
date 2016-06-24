package net.tjtorrico.androidchat.login;

/**
 * Created by TJT on 13/06/2016.
 */
public interface LoginInteractor {
    void checkAlreadyAuthenticated();
    void doSignUp(String email, String password);
    void doSignIn(String email, String password);
}
