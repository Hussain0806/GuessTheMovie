//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> movieNames = Movies.getMovieNames("D:/MovieList.txt");
        String randomMovie = Movies.getRandomMovie(movieNames);
        int movieLength = randomMovie.length();
        StringBuilder randomMovieSb = new StringBuilder(randomMovie);
        System.out.println("Get ready to play the game,your movie contains " + movieLength + " characters");
        StringBuilder mainName = DummyName.getDummyName(movieLength, randomMovieSb);
        //System.out.println(mainName);
        int guesses = 10;
        boolean gameOver = false;
        System.out.println(randomMovie);
        while (!gameOver) {
            boolean wrongGuess = true;
            System.out.println(mainName);
            System.out.println("Please Enter the character in the movie name");
            Scanner input = new Scanner(System.in);
            char inputChar = input.next().charAt(0);
            inputChar = Character.toLowerCase(inputChar);
            if (DummyName.validChar(inputChar)) {
                for (int i = 0; i < movieLength; i++) {

                    if (inputChar == randomMovieSb.charAt(i)) {
                        String addChar = "";
                        addChar += inputChar;
                        mainName.replace(i, i + 1, addChar);
                        wrongGuess = false;
                    }

                }
                if (wrongGuess) {
                    guesses--;
                }
            }
            if (!DummyName.validChar(inputChar)) {
                System.out.println("Invalid Character entered");
            }
            if (mainName.toString().contentEquals(randomMovieSb)) {
                System.out.println("Congratulations you have guessed the movie!");
                gameOver = true;
            }
            if (guesses <= 0) {
                System.out.println("Sorry you have lost the game ");
                System.out.println("The movie was " + randomMovie);
                gameOver = true;

            } else {
                System.out.println("Please enter valid character ");
            }
            System.out.println("You have " + guesses + " guesses left");
        }

    }
}
