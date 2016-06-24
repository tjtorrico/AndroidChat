package net.tjtorrico.androidchat.lib;

/**
 * Created by TJT on 13/06/2016.
 */
public interface EventBus {
    void register (Object subscriber);
    void unregister (Object subscriber);
    void post (Object event);
}
