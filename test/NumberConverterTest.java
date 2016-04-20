import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NumberConverterTest {
    @Test
    /**
     * Given NumberConverter, when integer 0 is input, then "zero" is returned.
     */
    public void whenIntThenString(){
        //Arrange

        //Act
        String zero = NumberConverter.toText(6);
        //Assert
        /*assertThat(zero, is("zero"));

        String one = NumberConverter.toText(1);
        assertThat(one, is("one"));

        String two = NumberConverter.toText(2);
        assertThat(two, is("two"));

        String three = NumberConverter.toText(3);
        assertThat(three, is("three"));

        String four = NumberConverter.toText(4);
        assertThat(four, is("four"));

        String five = NumberConverter.toText(5);
        assertThat(five, is("five"));
*/
        String six = NumberConverter.toText(6);
        assertThat(six, is("six"));

/*
        String seven = NumberConverter.toText(7);
        assertThat(seven, is("seven"));

        String eight = NumberConverter.toText(8);
        assertThat(eight, is("eight"));

        String nine = NumberConverter.toText(9);
        assertThat(nine, is("nine"));

        String ten = NumberConverter.toText(10);
        //Assert
        assertThat(zero, is("zero"));

        String eleven = NumberConverter.toText(11);
        assertThat(one, is("eleven"));

        String twelve = NumberConverter.toText(12);
        assertThat(two, is("twelve"));

        String thirteen = NumberConverter.toText(13);
        assertThat(three, is("thirteen"));

        String fourteen = NumberConverter.toText(14);
        assertThat(four, is("fourteen"));

        String fifteen = NumberConverter.toText(15);
        assertThat(five, is("fifteen"));

        String sixteen = NumberConverter.toText(16);
        assertThat(six, is("sixteen"));

        String seventeen = NumberConverter.toText(17);
        assertThat(seven, is("seventeen"));

        String eighteen = NumberConverter.toText(18);
        assertThat(eight, is("eighteen"));

        String nineteen = NumberConverter.toText(19);
        assertThat(nine, is("nineteen"));
*/
    }
}
