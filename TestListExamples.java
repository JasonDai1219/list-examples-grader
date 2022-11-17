import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class TestListExamples {
  // Write your grading tests here!
  @Test
  public void testOrder() {
    ArrayList<String> expected = new ArrayList<>();
    expected.add("a");
    expected.add("b");
    expected.add("c");

    List<String> result = ListExamples.filter(expected, sc);

    assertEquals(expected, result);
  }
}
