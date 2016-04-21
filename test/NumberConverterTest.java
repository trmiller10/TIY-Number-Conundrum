import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NumberConverterTest {
     @Test

    /**
     * Given NumberConverter, when integer 0 is input, then "zero" is returned.
     */
    public void whenInteger0ThenZero() {
        //Arrange

        //Act
        String zero = NumberConverter.toText(0);
        //Assert
        assertThat(zero, is("zero"));
    }

    @Test
    /**
     * Given: NumberConverter
     * When: Integer 5 is input
     * Then: "Five" is returned
     */
    public void whenInteger5ThenFive() {
        //Arrange

        //Act
        String five = NumberConverter.toText(5);
        //Assert
        assertThat(five, is("five "));
    }

    @Test
    /**
     * Given: NumberConverter
     * When: Integer 10 is input
     * Then: "ten" is returned
     */
    public void whenInteger10ThenTen() {
        //Arrange

        //Act
        String ten = NumberConverter.toText(10);
        //Assert
        assertThat(ten, is("ten "));
    }

    @Test
    /**
     * Given: NumberConverter
     * When: Integer 11 is input
     * Then: "eleven" is returned
     */
    public void whenInteger11ThenEleven() {
        //Arrange

        //Act
        String eleven = NumberConverter.toText(11);
        //Assert
        assertThat(eleven, is("eleven "));
    }

    @Test
    /**
     * Given: NumberConverter
     * When: Integer 20 is input
     * Then: "twenty" is returned
     */
    public void whenInteger20ThenTwenty() {
        //Arrange

        //Act
        String twenty = NumberConverter.toText(20);
        //Assert
        assertThat(twenty, is("twenty "));
    }

    @Test
    /**
     * Given: NumberConverter
     * When: Integer 25 is input
     * Then: "twenty five" is returned
     */
    public void whenInteger25ThenTwentyFive() {
        //Arrange

        //Act
        String twentyFive = NumberConverter.toText(25);
        //Assert
        assertThat(twentyFive, is("twenty five "));
    }

    @Test
    /**
     * Given: NumberConverter
     * When: Integer 50 is input
     * Then: "fifty" is returned
     */
    public void whenInteger50ThenFifty() {
        //Arrange

        //Act
        String fifty = NumberConverter.toText(50);
        //Assert
        assertThat(fifty, is("fifty "));
    }

    @Test
    /**
     * Given: NumberConverter
     * When: Integer 99 is input
     * Then: "ninety nine" is returned
     */
    public void whenInteger99ThenNinetyNine() {
        //Arrange

        //Act
        String ninetyNine = NumberConverter.toText(99);
        //Assert
        assertThat(ninetyNine, is("ninety nine "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 100 is input
     * Then: "one hundred" is returned
     */
    public void whenInteger100ThenOneHundred() {
        //Arrange

        //Act
        String oneHundred = NumberConverter.toText(100);
        //Assert
        assertThat(oneHundred, is("one hundred "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 101 is input
     * Then: "one hundred" is returned
     */
    public void whenInteger101ThenOneHundredAndOne() {
        //Arrange

        //Act
        String oneHundredAndOne = NumberConverter.toText(101);
        //Assert
        assertThat(oneHundredAndOne, is("one hundred and one "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 110 is input
     * Then: "one hundred and ten" is returned
     */
    public void whenInteger110ThenOneHundredAndTen() {
        //Arrange

        //Act
        String oneHundredAndTen = NumberConverter.toText(110);
        //Assert
        assertThat(oneHundredAndTen, is("one hundred and ten "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 111 is input
     * Then: "one hundred and eleven" is returned
     */
    public void whenInteger111ThenOneHundredAndEleven() {
        //Arrange

        //Act
        String oneHundredAndEleven = NumberConverter.toText(111);
        //Assert
        assertThat(oneHundredAndEleven, is("one hundred and eleven "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 120 is input
     * Then: "one hundred and twenty" is returned
     */
    public void whenInteger120ThenOneHundredAndTwenty() {
        //Arrange

        //Act
        String oneHundredAndTwenty = NumberConverter.toText(120);
        //Assert
        assertThat(oneHundredAndTwenty, is("one hundred and twenty "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 125 is input
     * Then: "one hundred and twenty five" is returned
     */
    public void whenInteger100ThenOneHundredAndTwentyFive() {
        //Arrange

        //Act
        String oneHundredAndTwentyFive = NumberConverter.toText(125);
        //Assert
        assertThat(oneHundredAndTwentyFive, is("one hundred and twenty five "));
    }
}




