package test;

import java.beans.Transient;

import org.junit.Assert;
import org.junit.Test;

import controller.TouristController;
import view.Login;

public class LoginTouristTest {
    Login login;
    TouristController touristController = new TouristController();
    @Test
    
    public void LoginTouristtest(){
        Login l =new Login();
        l.UserName("james10");
        l.Password("james");
        int expectedValue=1;
        int actualValue=touristController.loginTourist(login);;

        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void LoginTouristtest1(){
        Login l =new Login();
        l.UserName("james10");
        l.Password("james");
        int expectedValue=0;
        int actualValue=touristController.loginTourist(login);;

        Assert.assertEquals(expectedValue, actualValue);
    }


}