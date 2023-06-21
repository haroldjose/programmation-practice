package haroldsanchez.unittest;

import org.haroldsanchez.Exercises;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Exercises")
@Tag("Unittest")
public class ExerciseTest {
    Exercises exercises=new Exercises();
  @Test
  @DisplayName("Counter the number of times the character appears in the string")
  public void testSomething() {

      String text1="fizzbuzz";
      String text2="FIZZBUZZ";
      char valor='z';
      int expectedResult=4;
      int actualResult= exercises.charCount(text1,valor);

      System.out.println("expectedResult: ".concat(String.valueOf(expectedResult)));
      System.out.println("actualResult: ".concat(String.valueOf(actualResult)));
      assertEquals(expectedResult, actualResult);

  }
  @Test
    @DisplayName("find the smallest integer")
    public void testNumberShort(){
      //int[] number1={34, 15, 88, 2};
      int[] number1={34, -345, -1, 100};

      int expectedResult=-345;
      int actualResult= exercises.numberShort(number1);

      System.out.println("expectedResult: ".concat(String.valueOf(expectedResult)));
      System.out.println("actualResult: ".concat(String.valueOf(actualResult)));
      assertEquals(expectedResult,actualResult);
  }
  @Test
    @DisplayName("Returns a string in the form of  phone number")
    public void testCreatePhoneNumber(){
      int[] number={1,2,3,4,5,6,7,8,9,0};

      String expectedResult="(123)456-7890";
      String actualResult= exercises.createPhoneNumber(number);

      System.out.println("expectedResult: ".concat(expectedResult));
      System.out.println("actualResult: ".concat(actualResult));
      assertEquals(expectedResult,actualResult);
  }

}
