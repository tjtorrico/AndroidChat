package net.tjtorrico.androidchat.login;

import net.tjtorrico.androidchat.login.events.LoginEvent;

/**
 * Created by TJT on 13/06/2016.
 */
public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void checkForAuthenticatedUser();
    void onEventMainThread(LoginEvent event);
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
}
