package DAY1_METHODS;

import org.testng.annotations.Test;

public class prog1 {
  @Test(priority=1)
  public void opening_browser() {
	  System.out.println("Application Successfully opened");
  }
  @Test(priority=2)
  public void productdetails()
  {
	  System.out.println("Product is successfully updated");
  }
  @Test(priority=4)
  public void paymentprocess()
  {
	  System.out.println("payment is done through credit card");
  }
  @Test(priority=3)
  public void deliveryprocess()
  {
	  System.out.println("delivered to right adress");
  }
  @Test(enabled=false)
  public void feedbackprocess()
  {
	  System.out.println("feedback is taken successfully from customer");
  }
  @Test(priority=6)
  public void logoff()
  {
	  System.out.println("application closed");
  }
}
