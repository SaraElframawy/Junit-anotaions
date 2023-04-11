package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalTest {
    Cal cal;

@BeforeEach
public  void set(){
    Cal cal = new Cal();
    System.out.println("the before test");
}

    @Test
    public void addTest(){
        //Given
       Cal cal = new Cal (); //deklaring the class
        int term1 = Integer.MAX_VALUE;   //giving values to test upon them
        int term2 = Integer.MIN_VALUE;

         //When
       int sum = cal.add(term1,term2); //Test
        //Then
        assertEquals(-1,sum); //comparing the expected results with actual results


        }
        @Test
        public void add_withPositiveNumber_shouldReturnPositiveInteger(){
        //given
            Cal cal = new Cal();
            int x =3;
            int y = 7;


            //when
            int summa = cal.add(x,y);

            //then
      assertEquals(10,summa);
        }


        @DisplayName("Repeated Test")
        @RepeatedTest(3)
    public void toUpperCase_normalText_textToUpperClass(){
        //given
        String exampleString ="hello world";
        StringManipulator stringManipulator = new StringManipulator();
        //when

            String result =  StringManipulator.toUpperCase(exampleString);

            //then
            assertEquals("HELLO WORLD",result );

        }

        @Test
    public void divdTest(){
        //given
        Cal cal = new Cal();
        int x = 5;
        int y = 0;
        //when
           Throwable exception = assertThrows(ArithmeticException.class,()->{cal.divd(x,y);});
          assertThrows(ArithmeticException.class,()->{cal.divd(x,y);});
        //then
            assertEquals("can't divid by zero",exception.getMessage());



        }

        @ParameterizedTest
    @CsvSource(value = {"-4,16", "4,16", "3,9", "-4,16"})
    public void squarePositiveNumber(int startingValue, int expected){

//Given
        Cal cal = new Cal();
        //When
            int result = cal.squ(startingValue);

            assertEquals(expected,result);



        }
}
