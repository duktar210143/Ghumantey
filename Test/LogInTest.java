package Test;

import controller.TouristController;
import database.Dbconnection;
import model.Tourist;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LogInTest {
    Tourist tourist;
    TouristController touristController;
    @Before
    public void init(){
        tourist = new Tourist();
        touristController = new TouristController();
    }
    @Test
    public void testLogInTourist(){
        tourist = new Tourist();
        int actualResult = touristController.registerTourist(tourist);
        int expectedResult =1;
        Assert.assertEquals(actualResult,expectedResult);
    }
    @After
    public void tearDown(){
        tourist = null;
        touristController = null;
    }
}