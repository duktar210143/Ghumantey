package Test;

import controller.TouristController;
import database.Dbconnection;
import model.Tourist;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegisterTouristTest {
    Tourist tourist;
    TouristController touristController;
    @Before
    public void init(){
        tourist = new Tourist();
        touristController = new TouristController();
    }
    @Test
    public void testRegisterTourist(){
        tourist = new Tourist("James","9090123456",'M',"01/01/2002","KTM","james","james");
        int actualResult = touristController.registerTourist(tourist);
        int expectedResult =1;
        Assert.assertEquals(actualResult,expectedResult);
    }
    @After
    public void tearDown(){
        tourist = null;
        touristController = null;
    }

    @Before
    public void init1(){
        tourist = new Tourist();
        touristController = new TouristController();
    }
    @Test
    public void testRegisterTourist1(){
        tourist = new Tourist("James","9090123456",'M',"01/01/2002","KTM","james","james");
        int actualResult = touristController.registerTourist(tourist);
        int expectedResult =0;
        Assert.assertEquals(actualResult,expectedResult);
    }
    @After
    public void tearDown1(){
        tourist = null;
        touristController = null;
    }
}