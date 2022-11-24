package multipleclasses;

import org.testng.annotations.Test;

public class prog1 {
  @Test(priority=1)
  public void login() {
	  System.out.println("Welcome to new tours");
  }
  @Test(priority=2)
  public void customerdetails() {
	  System.out.println("customer details are successfully updated");
  }
  @Test(priority=3)
  public void productdetails() {
	  System.out.println("product details are successfully updated");
  }
}
