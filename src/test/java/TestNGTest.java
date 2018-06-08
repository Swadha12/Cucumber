import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestNGTest {

  @Test
  public void test() {
    //throw new RuntimeException("Test not implemented");
	  System.out.println("running test from TestNGTest class: ");
   String act="ABC";
   String exp="ABC";
   assertEquals("Abc", "abc");
  }
}
