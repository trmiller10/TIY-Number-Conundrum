//creates new class NumberConverter containing static method for turning integers into text
public class NumberConverter {


    //creates a static method toText()that works with integer variable 'number' and returns the result as a string
    public static String toText(int number) {

        if (number < 10) {
            return handleSingles(number);
        } else if (number <= 20 && number > 10){
            return handleTeens(number);
        }else if (number >= 20 && number < 100) {
            return handleTens(number);
        } else if (number >= 100 && number < 1000){
            return handleHundreds(number);
        } else if (number >= 1000 & number < 10000){
            return handleThousands(number);
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
        }
        return singleString;
    }//public static String handleSingles(int number){


    public static String handleTeens(int number){

        String teenString = "default";

        switch(number) {
            case 10:
                teenString = "ten";
                break;
            case 11:
                teenString = "eleven";
                break;
            case 12:
                teenString = "twelve";
                break;
            case 13:
                teenString = "thirteen";
                break;
            case 14:
                teenString = "fourteen";
                break;
            case 15:
                teenString = "fifteen";
                break;
            case 16:
                teenString = "sixteen";
                break;
            case 17:
                teenString = "seventeen";
                break;
            case 18:
                teenString = "eighteen";
                break;
            case 19:
                teenString = "nineteen";
                break;
        }
        return teenString;
    }

    public static String handleTens(int number) {
        //if pulled from handleHundreds() and is followed by a zero
        if(number > 1 && number < 10){
            number = number * 10;
        }

        int tens = number / 10;
        int singles = number % 10;

        String tenString = "default";

        //if tens is followed by a zero
        if (singles == 0){
            switch (tens){
                case 1: tenString = "ten ";
                    break;
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
        //if followed by non-zero single
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
        if(hundreds == 0){
            return handleTens(number);
        }
        int tensSeparateDigit = number / 10 % 10;
        int singles = number % 10;
        if(tensSeparateDigit == 1){
            number = 10 + singles;
        }
        String teenString = handleTeens(number);


        String hundredString = "default";

        //if hundreds followed by two zeroes
        if (tensSeparateDigit == 0 && singles == 0){
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
        //if hundreds followed by tens=0 and singles=nonzero
        } else if (tensSeparateDigit == 0 && singles != 0){
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
            //if hundreds is followed by tens=nonzero and singles=0
        } else if (tensSeparateDigit == 1){
            switch(hundreds){
                case 1: hundredString = "one hundred and " + teenString;
                    break;
                case 2: hundredString = "two hundred and " + teenString;
                    break;
                case 3: hundredString = "three hundred and " + teenString;
                    break;
                case 4: hundredString = "four hundred and " + teenString;
                    break;
                case 5: hundredString = "five hundred and " + teenString;
                    break;
                case 6: hundredString = "six hundred and " + teenString;
                    break;
                case 7: hundredString = "seven hundred and " + teenString;
                    break;
                case 8: hundredString = "eight hundred and " + teenString;
                    break;
                case 9: hundredString = "nine hundred and " + teenString;
                    break;
            } return hundredString;
        }

        else if (tensSeparateDigit != 0 && singles == 0){
            switch(hundreds){
                case 1: hundredString = "one hundred and " + handleTens(tensSeparateDigit);
                    break;
                case 2: hundredString = "two hundred and " + handleTens(tensSeparateDigit);
                    break;
                case 3: hundredString = "three hundred and " + handleTens(tensSeparateDigit);
                    break;
                case 4: hundredString = "four hundred and " + handleTens(tensSeparateDigit);
                    break;
                case 5: hundredString = "five hundred and " + handleTens(tensSeparateDigit);
                    break;
                case 6: hundredString = "six hundred and " + handleTens(tensSeparateDigit);
                    break;
                case 7: hundredString = "seven hundred and " + handleTens(tensSeparateDigit);
                    break;
                case 8: hundredString = "eight hundred and " + handleTens(tensSeparateDigit);
                    break;
                case 9: hundredString = "nine hundred and " + handleTens(tensSeparateDigit);
                    break;

            } return hundredString;
        }
        //if hundreds is followed by nonzero, nonteen tens and singles
        switch(hundreds){
            case 1: hundredString = "one hundred and "  + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 2: hundredString = "two hundred and "  + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 3: hundredString = "three hundred and " + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 4: hundredString = "four hundred and " + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 5: hundredString = "five hundred and " + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 6: hundredString = "six hundred and "  + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 7: hundredString = "seven hundred and " + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 8: hundredString = "eight hundred and " + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 9: hundredString = "nine hundred and " + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;

        }
        return hundredString;

    } //public static String handleHundreds(int number){

   public static String handleThousands(int number){

       int thousands = number / 1000;
       int hundreds = number % 1000;

       String thousandString = "default";

       switch(thousands){
           case 1: thousandString = handleSingles(thousands) + " thousand "
 + handleHundreds(hundreds);
       } return thousandString;




       /*  int thousands = number / 1000;
       int hundredsSeparateDigit = number / 100 % 10;
       int tensSeparateDigit = number / 10 % 10;
       int singles = number % 10;

       if(tensSeparateDigit == 1){
           number = 10 + singles;
       }
       String teenString = handleTeens(number);


       //if thousands is followed by zero hundreds and tens and nonzero singles
       if (hundredsSeparateDigit == 0 && tensSeparateDigit == 0){
           switch(thousands){
               case 1: thousandString = "one thousand and " + handleSingles(singles);
                   break;
           }
       }
       //if thousands is followed by zero hundreds and nonzero tens and singles
       else if (hundredsSeparateDigit == 0 && tensSeparateDigit != 0 && tensSeparateDigit != 1){
           switch (thousands){
               case 1: thousandString = "one thousand " + handleTens(tensSeparateDigit) + handleSingles(singles);
                   break;
           }
       }
       //if thousands is followed by zero hundreds and teens
       else if (hundredsSeparateDigit == 0 && tensSeparateDigit == 1){
           switch (thousands){
               case 1: thousandString = "one thousand " + teenString;
                   break;
           }
       }
        return thousandString;
*/
    }

  /*  public static String handleSecondDigit(int number){

        String tensSecondDigit = "default";

        switch (number){
            case 5: tensSecondDigit = "Fifty-";
                break;
        } return tensSecondDigit;

    }*/

} //public class NumberConverter {
