package Test;

import controller.Carcontroller;
import model.Car;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookCarTesting {
    Car car;
    Carcontroller  carcontroller ;
    @Before
    public void init(){
        car = new Car();
        carcontroller = new Carcontroller();
    }
    @Test
    public void testRegisterTourist(){
        car = new Car("55","chitwan","pokhara","02/02/2002","02/07/2002");
        int actualResult = carcontroller.registercar(car);
        int expectedResult =1;
        Assert.assertEquals(actualResult,expectedResult);
    }
    @After
    public void tearDown(){
        car = null;
        carcontroller = null;
    }


}