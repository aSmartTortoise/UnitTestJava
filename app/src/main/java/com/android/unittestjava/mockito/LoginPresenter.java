package com.android.unittestjava.mockito;

public class LoginPresenter {
    private UserManager mUserManager = new UserManager();
    private PasswordValidator mPasswordValidator = new PasswordValidator();

    public void login(String username, String password) {
        if (username == null || username.length() == 0) return;
        if (mPasswordValidator.verifyPassword(password)) return;
        mUserManager.performLogin(username, password);
    }

    public void setUserManager(UserManager userManager) {
        this.mUserManager = userManager;
    }
}
