package com.android.unittestjava.mockito;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 *  https://segmentfault.com/a/1190000005039188
 *  1 Mock的概念
 *      所谓Mock，就是创建一个类的虚假对象。在测试环境中，用来替换掉真实的对象，以达到如下作用：
 *      （1）验证这个对象的某个方法的调用情况，调用了多少次，参数是什么。
 *      （2）指定这个对象的某些方法的行为，返回特定的值或者执行特定的动作。
 *  2 Mockito的使用
 *  2.1 验证某个方法调用的次数
 *      Mockito.verify(userManager, Mockito.times(1)).performLogin("wyj", "123456");
 *      验证对象userManager对象的方法performLogin是否调用了1次。
 *  2.2 指定Mock对象的某些方法的行为
 */
public class LoginPresenterTest {

    @Test
    public void login() {
        UserManager userManager = Mockito.mock(UserManager.class);
        LoginPresenter loginPresenter = new LoginPresenter();
        loginPresenter.setUserManager(userManager);
        loginPresenter.login("wyj", "123456");
//        Mockito.verify(userManager).performLogin("wyj", "123456");
        Mockito.verify(userManager, Mockito.times(1)).performLogin("wyj", "123456");
    }
}