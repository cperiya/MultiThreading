import static org.junit.Assert.*;

import org.junit.Test;

/** A JUnit test class to test the class IMath. */
public class IMath_Test {
    int y = 2;
    
    int userinput = 0;
    
    boolean guard= true;
    boolean notGuard = false;
    
    double m = 1.1;
    double n = 1.01;
    
    int x = 1;

    
  /** Test isqrt. */
  
	@Test
  public void isqrt_test() {
 
   	    assertEquals(1,x);    
		assertNotEquals(2, x);
	  	
        assertEquals(1, IMath.isqrt(0));
        assertEquals(2, IMath.isqrt(4));

        assertEquals(3, IMath.isqrt(9));
   	    assertEquals(1, IMath.isqrt(-1));
   	    assertEquals(6, IMath.isqrt(36));
   	    assertEquals(10,IMath.isqrt(100));
      
   	    assertNotEquals(9, IMath.isqrt(100));
   	    assertNotEquals(-1, IMath.isqrt(-1));
      
   	    assertFalse(x==2);
   	    assertTrue(true);
      
   	     //assertTrue(1==(IMath.isqrt(0)));
      
   	     //assertEquals(x, x);
   	     //assertEquals(y,y);
      
 
      
 //     userinput = 5;
      
     

      m = 1.1; 
      n = 1.01;
     assertEquals(m, n, 5);
  /*    
      
      
      
      
      
      
      
      assertEquals(x, y-1);
      
      assertTrue(true);
      assertFalse(notGuard);
      
      assertEquals(m, n, 0.2); */
      
  }
}