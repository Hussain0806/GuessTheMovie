import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Movies {
    public static ArrayList<String> getMovieNames(String path) {
            File file = new File(path);
            ArrayList<String> MovieNames = new ArrayList<>();

            try {
                Scanner scan = new Scanner(file);
                while (scan.hasNextLine()) {
                    String st = scan.nextLine();
                    MovieNames.add(st);
                }
                scan.close();
            } catch (FileNotFoundException e) {
                System.err.println("File not found " + e.getMessage());
            }
            return MovieNames;
        }
        public static String getRandomMovie(ArrayList<String>movieList){
            Random r = new Random();
            int randomNumber = r.nextInt(movieList.size());
            return movieList.get(randomNumber);
        }

    }

