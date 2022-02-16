package test;

import controller.StaysController;
import controller.TouristController;
import database.Dbconnection;
import model.Stays;
import model.Tourist;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegisterStaysTesting {
    Stays stays;
    StaysController staysController;
    @Before
    public void init(){
        stays = new Stays(0, null, null, 0, null, 0, 0, null, null, 0);
        staysController = new StaysController();
    }
    @Test
    public void testRegisterTourist(){
        stays = new Stays("Hami","hami@gmail.com","098","m",2,2,"Jan1");
        int actualResult = staysController.registerStays(stays);
        int expectedResult =0;
        Assert.assertEquals(actualResult,expectedResult);
    }
    @After
    public void tearDown(){
        stays = null;
        staysController = null;
    }
}