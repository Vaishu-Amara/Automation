package multipleclasses;

import org.testng.annotations.Test;

public class prog2 extends prog1 {
  @Test(priority=4)
  public void paymentdetails() {
	  System.out.println("payment is done through credit card");
  }
  @Test(priority=5)
  public void deliveryprocess() {
	  System.out.println("Delivered to right adress");
  }
}
