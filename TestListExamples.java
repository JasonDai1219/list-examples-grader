import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.contains("A") || s.contains("a");
  }
}

class AChecker implements StringChecker {
  public boolean checkString(String s) {

    if(s.contains("A") || s.contains("a")) {
      return true;
    }
    else {
      return false;
    }
  }
}
public class TestListExamples {
  // Write your grading tests here!
  @Test
  public void testFilter() {
    ArrayList<String> testing = new ArrayList<>();
    testing.add("a");
    testing.add("b");
    testing.add("c");
    testing.add("A");
    testing.add("AAAAA");
    AChecker sc = new AChecker();
    List<String> result = ListExamples.filter(testing, sc);
    List<String> expected = new ArrayList<>();
    expected.add("a");
    expected.add("A");
    expected.add("AAAAA");
    assertEquals(expected, result);
  }
}
