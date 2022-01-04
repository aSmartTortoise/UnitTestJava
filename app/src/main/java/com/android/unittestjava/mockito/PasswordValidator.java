package com.android.unittestjava.mockito;

public class PasswordValidator {
    public boolean verifyPassword(String password) {
        //假设这个方法需要联网
        return "xiaochuang_is_handsome".equals(password);
    }
}
