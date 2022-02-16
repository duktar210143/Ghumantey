package Test;

import controller.Buscontroller;
import model.Bus;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookBusTesting {
    Bus  bus ;
    Buscontroller buscontroller;
    @Before
    public void init(){
        bus = new Bus();
        buscontroller = new Buscontroller();
    }
    @Test
    public void testRegisterTourist(){
        bus = new Bus("66","pokhara","Ktm","01/01/2002","01/05/2002");
        int actualResult = buscontroller.registerbus(bus);
        int expectedResult =1;
        Assert.assertEquals(actualResult,expectedResult);
    }
    @After
    public void tearDown(){
        bus = null;
        buscontroller = null;
    }


}