# Adis Catalogue
|    Movies    |      Series     |    Artist   |
|--------------|-----------------|-------------|
| Harry Potter | Stranger things | The Weekend |
|    Thor      |    Friends      |   Labrynth  |
|  iron man    |     suits       | Osher Cohen |
|   Avengers   |    Lucifer      |    Rihana   |
|    Moana     |   Outer Banks   |     Raye    |


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       What is your favourite movie
        String answer = input.nextLine();   // reads a line of text

        System.out.println("You entered: " + answer);
    }
}


