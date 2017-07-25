import car.Car;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Education Unlimited
 */
public class cartest {
    Car c = new Car("toyota", "camry", 1999, "Bob", "blue", 1555555, 1119192847123.1234);
    public cartest() {
    }
    
    @Test
    public void makeGetterTest() {
    assertEquals(c.getMake(), "Toyota");
    }
    
    @Test
    public void makeSetterTest() {
        c.setMake("toyota");
        assertEquals(c.getMake(),"toyota");
    }   
    @Test
    public void modelGetterTest() {
    assertEquals(c.getMake(), "Camry");
    }
    
    @Test
    public void modelSetterTest() {
        c.setMake("Camry");
        assertEquals(c.getMake(),"Camry");
        
    }
    
    @Test
    public void yearGetterTest() {
    assertEquals(c.getMake(), 1999);
    }
    
    @Test
    public void yearSetterTest() {
        c.setMake(1999);
        assertEquals(c.getMake(),1999);
        
    }
    
    @Test
    public void isOnGetterTest() {
    assertEquals(c.getMake(), false);
    }
    
    @Test
    public void isOnSetterTest() {
        c.setMake(false);
        assertEquals(c.getMake(),false);
        
    }
    
}
