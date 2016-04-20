//creates new class NumberConverter containing static method for turning integers into text
public class NumberConverter {


    //creates a static method toText()that works with integer variable 'number' and returns the result as a string
    public static String toText(int number) {

        if (number < 20) {
            return handleSingles(number);
        } else if (number >= 20 && number < 100) {
            return handleTens(number);
        } else if (number >= 100 && number < 1000){
            return handleHundreds(number);
        }

        return "sdfgh";
    }

    public static String handleSingles(int number) {


        String singleString = "default";

        switch (number) {
            case 0:
                singleString = "zero";
                //ends case program flow
                break;
            case 1:
                singleString = "one";
                break;
            case 2:
                singleString = "two";
                break;
            case 3:
                singleString = "three";
                break;
            case 4:
                singleString = "four";
                break;
            case 5:
                singleString = "five";
                break;
            case 6:
                singleString = "six";
                break;
            case 7:
                singleString = "seven";
                break;
            case 8:
                singleString = "eight";
                break;
            case 9:
                singleString = "nine";
                break;
            case 10:
                singleString = "ten";
                break;
            case 11:
                singleString = "eleven";
                break;
            case 12:
                singleString = "twelve";
                break;
            case 13:
                singleString = "thirteen";
                break;
            case 14:
                singleString = "fourteen";
                break;
            case 15:
                singleString = "fifteen";
                break;
            case 16:
                singleString = "sixteen";
                break;
            case 17:
                singleString = "seventeen";
                break;
            case 18:
                singleString = "eighteen";
                break;
            case 19:
                singleString = "nineteen";
                break;
        }
        return singleString;


    }//public static String handleSingles(int number){


    public static String handleTens(int number) {

        if(number < 10){
            number = number * 10;
        }

        int tens = number / 10;
        int singles = number % 10;

        String tenString = "default";

        if (singles == 0){
            switch (tens){
                case 2: tenString = "twenty ";
                    break;
                case 3: tenString = "thirty ";
                    break;
                case 4: tenString = "forty ";
                    break;
                case 5: tenString = "fifty ";
                    break;
                case 6: tenString = "sixty ";
                    break;
                case 7: tenString = "seventy ";
                    break;
                case 8: tenString = "eighty ";
                    break;
                case 9: tenString = "ninety ";
                    break;
            } return tenString;
        }//if (singles == 0){

        switch (tens) {

            case 0:
                tenString = "";
                break;
            case 2:
                tenString = "twenty " + handleSingles(singles);
                break;
            case 3:
                tenString = "thirty " + handleSingles(singles);
                break;
            case 4:
                tenString = "forty " + handleSingles(singles);
                break;
            case 5:
                tenString = "fifty " + handleSingles(singles);
                break;
            case 6:
                tenString = "sixty " + handleSingles(singles);
                break;
            case 7:
                tenString = "seventy " + handleSingles(singles);
                break;
            case 8:
                tenString = "eighty " + handleSingles(singles);
                break;
            case 9:
                tenString = "ninety " + handleSingles(singles);
                break;
        } //switch (tens)
        return tenString;

    } //public static String handleTens(int number) {



    public static String handleHundreds(int number){
        int hundreds = number / 100;
        int tensSeperateDigit = number / 10 % 10;
        int singles = number % 10;

        String hundredString = "default";

        if (tensSeperateDigit == 0 && singles == 0){
            switch(hundreds){
                case 1: hundredString = "one hundred";
                    break;
                case 2: hundredString = "two hundred";
                    break;
                case 3: hundredString = "three hundred";
                    break;
                case 4: hundredString = "four hundred";
                    break;
                case 5: hundredString = "five hundred";
                    break;
                case 6: hundredString = "six hundred";
                    break;
                case 7: hundredString = "seven hundred";
                    break;
                case 8: hundredString = "eight hundred";
                    break;
                case 9: hundredString = "nine hundred";
                    break;

            } return hundredString;

        } else if (tensSeperateDigit == 0 && singles != 0){
            switch(hundreds){
                case 1: hundredString = "one hundred and " + handleSingles(singles);
                    break;
                case 2: hundredString = "two hundred and " + handleSingles(singles);
                    break;
                case 3: hundredString = "three hundred and " + handleSingles(singles);
                    break;
                case 4: hundredString = "four hundred and " + handleSingles(singles);
                    break;
                case 5: hundredString = "five hundred and " + handleSingles(singles);
                    break;
                case 6: hundredString = "six hundred and " + handleSingles(singles);
                    break;
                case 7: hundredString = "seven hundred and " + handleSingles(singles);
                    break;
                case 8: hundredString = "eight hundred and " + handleSingles(singles);
                    break;
                case 9: hundredString = "nine hundred and " + handleSingles(singles);
                    break;

            } return hundredString;
        } else if (tensSeperateDigit != 0 && singles == 0){
            switch(hundreds){
                case 1: hundredString = "one hundred and " + handleTens(tensSeperateDigit);
                    break;
                case 2: hundredString = "two hundred and " + handleTens(tensSeperateDigit);
                    break;
                case 3: hundredString = "three hundred and " + handleTens(tensSeperateDigit);
                    break;
                case 4: hundredString = "four hundred and " + handleTens(tensSeperateDigit);
                    break;
                case 5: hundredString = "five hundred and " + handleTens(tensSeperateDigit);
                    break;
                case 6: hundredString = "six hundred and " + handleTens(tensSeperateDigit);
                    break;
                case 7: hundredString = "seven hundred and " + handleTens(tensSeperateDigit);
                    break;
                case 8: hundredString = "eight hundred and " + handleTens(tensSeperateDigit);
                    break;
                case 9: hundredString = "nine hundred and " + handleTens(tensSeperateDigit);
                    break;

            } return hundredString;
        }

        switch(hundreds){
            case 1: hundredString = "one hundred and "  + handleTens(tensSeperateDigit) + handleSingles(singles);
                break;
            case 2: hundredString = "two hundred and "  + handleTens(tensSeperateDigit) + handleSingles(singles);
                break;
            case 3: hundredString = "three hundred and " + handleTens(tensSeperateDigit) + handleSingles(singles);
                break;
            case 4: hundredString = "four hundred and " + handleTens(tensSeperateDigit) + handleSingles(singles);
                break;
            case 5: hundredString = "five hundred and " + handleTens(tensSeperateDigit) + handleSingles(singles);
                break;
            case 6: hundredString = "six hundred and "  + handleTens(tensSeperateDigit) + handleSingles(singles);
                break;
            case 7: hundredString = "seven hundred and " + handleTens(tensSeperateDigit) + handleSingles(singles);
                break;
            case 8: hundredString = "eight hundred and " + handleTens(tensSeperateDigit) + handleSingles(singles);
                break;
            case 9: hundredString = "nine hundred and " + handleTens(tensSeperateDigit) + handleSingles(singles);
                break;

        }
        return hundredString;

    } //public static String handleHundreds(number){

  /*  public static String handleSecondDigit(int number){

        String tensSecondDigit = "default";

        switch (number){
            case 5: tensSecondDigit = "Fifty-";
                break;
        } return tensSecondDigit;

    }*/

} //public class NumberConverter {
