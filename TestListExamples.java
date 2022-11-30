import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.contains("A") || s.contains("a");
  }
}

public class TestListExamples {
  @Test
  public void testAoracontainer() {
    List<String> test = Arrays.asList("a", "AAAAA", "");
    List<String result = new ArrayList<>();
    for (String i: test) {
      if(this.checkString(i) == true) {
          result.add(i);
      }
    }
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, result);
  }
}
