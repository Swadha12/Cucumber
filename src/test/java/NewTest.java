import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
@Test
public class NewTest {
 
  public void f1() {
String	act="ABC1";
String  exp="ABC1";
	 assertEquals(act, exp);
  }
 
  public void f2() {
String	act="ABC2";
String  exp="ABC2";
	 assertEquals(act, exp);
  }

  public void f3() {
String	act="ABC3";
String  exp="ABC3";
	 assertEquals(act, exp);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("running test from NewTest class: ");
  }

}
