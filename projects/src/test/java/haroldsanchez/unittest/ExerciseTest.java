package haroldsanchez.unittest;

import org.haroldsanchez.Exercises;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Exercises")
@Tag("Unittest")
public class ExerciseTest {
  @Test
  @DisplayName("Counter the number of times the character appears in the string")
  public void testSomething() {

      Exercises exercises=new Exercises();
      String text1="fizzbuzz";
      String text2="FIZZBUZZ";
      char valor='z';
      int expectedResult=4;
      int actualResult1= exercises.charCount(text1,valor);

      System.out.println("expectedResult: ".concat(String.valueOf(expectedResult)));
      System.out.println("actualResult: ".concat(String.valueOf(actualResult1)));
      assertEquals(expectedResult, actualResult1);

  }

}
