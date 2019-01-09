/**
 * This Treatwell program implements an application that
 * simply create a box based on a given length and width, and outputs it to the screen.
 *
 * @author Filippo Piggici
 * @since 2019-01-09
 */


class Treatwell {

    public static void main(String[] args) {
        char[] ch = createArray();
        /*
         *  Function calls; the width, the length of the box
         *  and the array of characters are passed as arguments.
         */
        createBox(10, 10, ch);  //Test 1.
        createBox(5, 8, ch);    //Test 2.
        createBox(1, 8, ch);    //Test 3.
        System.exit(0);
    }

    // This method create the box based on the width, the length and the characters given.
    private static void createBox(int width, int length, char[] array) {
        // Checks if both the width and the length given are greater than 1
        if (width > 1 && length > 1) {
            for (int y = 1; y <= length; y++) { //Loops through the length.
                if (y == 1) printSequence(array[0], array[1], array[2], width);
                else if (y == length) printSequence(array[3], array[4], array[2], width);
                else printSequence(array[5], array[5], ' ', width);
            }
        } else System.out.println("I can't draw this box, it is a dot or a line.. not a box! Increase the width and/or the length please.");
    }

    private static char [] createArray(){
        //Array of characters, to store the 6 different characters that build the box.
        char[] ch = new char[6];
        //Array of integers, UNICODE codes.
        int[] values = {
                761,    // ˹
                762,    // ˺
                727,    // ˗
                763,    // ˻
                764,    // ˼
                124     // |
        };

        // Conversion from UNICODE code to char for each element of the 'ch' array.
        for (int i = 0; i < values.length; i++)
            ch[i] = (char) values[i];
        return ch;
    }

    // This method prints the entire row sequence.
    private static void printSequence(char ch1, char ch2, char ch3, int width) {
        char fill;
        for (int x = 1; x <= width; x++) {  //Loops through the width.
            if (x == 1)          //Most left position.
                fill = ch1;
            else if (x == width) //Most right.
                fill = ch2;
            else                 //In between.
                fill = ch3;
            //Formats to give a more coherent proportion to the box.
            System.out.print(String.format("%2c", fill));
        }
        System.out.println();    //New line.
    }

}//End of class Treatwell

