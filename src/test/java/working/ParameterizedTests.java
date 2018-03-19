package working;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import testsupport.SampleStudents;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.Stream;


public class ParameterizedTests {

  @ParameterizedTest
  @CsvFileSource(resources = "/data/students_course.csv")
  void testWithCsvFileSource(String first, String second, String major, String credits, String courseName) {
      assertNotNull(first);
  } 
  
  @ParameterizedTest
  @CsvSource(value = {"Cooper, Sheldon", "Builder, Bob", "Blutarsky, John"})
  void csvSourceTest(String lastName, String firstName) {
    System.out.println(lastName + ", " + firstName);
  }
  
  @ParameterizedTest
  @ValueSource(strings = {"Cooper", "Sheldon", "Builder", "Bob", "Blutarsky", "John"})
  void valueSourceTest(String name) {
    System.out.println(name);
  }
  
  @ParameterizedTest
  @MethodSource("studentNameAgeData")
  void methodSourceTest(String firstName, String lastName, int age) {
    System.out.println(firstName + " " + lastName + ", " + age);
  }
  
  private static Stream<Arguments> studentNameAgeData(){
    return Stream.of(SampleStudents.getMaxedStudent(), SampleStudents.getNewFreshman())
        .map(s -> Arguments.of(s.getFirstName(), s.getLastName(), s.getStudentAge()));
  }
}
