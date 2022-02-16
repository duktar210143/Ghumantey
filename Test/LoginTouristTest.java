package Test;

import org.junit.Assert;
import org.junit.Test;

import controller.TouristController;
import model.Tourist;
import view.Login;

public class LoginTouristTest {
    // private static final String UserName = null;
    // private static final String Password = null;
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