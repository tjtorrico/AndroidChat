package net.tjtorrico.androidchat.entities;

import java.util.Map;

/**
 * Created by TJT on 13/06/2016.
 */
public class User {
    String email;
    boolean onLine;
    Map<String, Boolean> contacts;
    public final static boolean ONLINE = true;
    public final static boolean OFFLINE = false;

    public User(){ }

    public User(String email, boolean online, Map<String, Boolean> contacts){
        this.email = email;
        this.onLine = online;
        this.contacts = contacts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isOnLine() {
        return onLine;
    }

    public void setOnLine(boolean onLine) {
        this.onLine = onLine;
    }

    public Map<String, Boolean> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, Boolean> contacts) {
        this.contacts = contacts;
    }
}