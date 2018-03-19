package working;

import org.junit.jupiter.api.extension.ExtendWith;
import testannotation.other.UseridTest;
import testsupport.UseridParameterResolver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(UseridParameterResolver.class)
public class UseridCaseTests {
  
  @UseridTest
  public void testUseridsAreLowercase(String userid, boolean success) {
    String expected = userid.toLowerCase();
    assertEquals(expected.equals(userid), success);
  }

}