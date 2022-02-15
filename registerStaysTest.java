package Test;

import controller.StaysController;
import controller.TouristController;
import database.Dbconnection;
import model.Stays;
import model.Tourist;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class registerStaysTest {
    Stays stay;
    StaysController staysController;
    @Before
    public void init(){
        stay = new Stays();
        staysController = new StaysController();
    }
    @Test
    public void testregisterStays(){
        stay = new Stays("Simon","simon6@gmail.com", 'm',"7",
                2,4,"3 FEB","7JAN");
        int actualResult = staysController.registerStays(stay);
        int expectedResult =1;
        Assert.assertEquals(actualResult,expectedResult);
    }
    @After
    public void tearDown(){
        stay = null;
        staysController = null;
    }
}