package net.tjtorrico.androidchat;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

import net.tjtorrico.androidchat.lib.GlideImageLoader;
import net.tjtorrico.androidchat.lib.ImageLoader;

/**
 * Created by TJT on 10/06/2016.
 */
public class AndroidChatApplication extends Application {
    private ImageLoader imageLoader;

    @Override
    public void onCreate() {
        super.onCreate();
        setupFirebase();
        setupImageLoader();
    }

    private void setupImageLoader() {
        imageLoader = new GlideImageLoader(this);
    }

    public ImageLoader getImageLoader() {
        return imageLoader;
    }

    private void setupFirebase(){
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
