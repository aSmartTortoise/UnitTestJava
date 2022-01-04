package com.android.unittestjava.mockito;

import android.util.Log;

public class UserManager {
    private final String TAG = "UserManager";
    public void performLogin(String username, String password) {
        //perform login and post LoginResult event
        Log.d(TAG, "performLogin: wyj username:" + username + " password:" + password);
    }
}
