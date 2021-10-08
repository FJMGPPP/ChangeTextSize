package com.fjmg.changetextsize;

import android.app.Application;

import com.fjmg.changetextsize.data.User;

public class ChangeSizeApplication extends Application
{
    private User user;

    /**
     * Para controlar cuando se crea la aplicacion
     */
    @Override
    public void onCreate()
    {
        super.onCreate();
        user = new User("Francisco","fjmgppp@gmail.com");
    }

    public User getUser() {
        return user;
    }
}
