package amazonpage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class closing extends count {
  @AfterTest
  public void closing_window() {
	  d.close();
  }
}
