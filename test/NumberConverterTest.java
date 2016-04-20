import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NumberConverterTest {
    @Test
    /**
     * Given NumberConverter, when integer 0 is input, then "zero" is returned.
     */
 /*   public void whenInteger0ThenZero(){
        //Arrange

        //Act
        String zero = NumberConverter.toText(0);
        //Assert
        assertThat(zero, is("zero"));
    }*/


    /**
     * Given: NumberConverter
     * When: Integer 5 is input
     * Then: "Five" is returned
     */
    public void whenInteger5ThenFive(){
        //Arrange

        //Act
        String five = NumberConverter.toText(5);
        //Assert
        assertThat(five, is("five"));
    }
}
