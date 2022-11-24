package multipleclasses;

import org.testng.annotations.Test;

public class prog3 extends prog2 {
  @Test(priority=6)
  public void feedbackprocess() {
	  System.out.println("feedback is successfully processed");
  }
  @Test(priority=6)
  public void logoff() {
	  System.out.println("Application is closed");
  }
}
