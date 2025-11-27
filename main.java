import java.util.Scanner;

public class FavoriteMovies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many favourite movies do you want to enter?");
        int count = scanner.nextInt();
        scanner.nextLine();  // Clear the newline

        String[] movies = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter movie #" + (i + 1) + ": ");
            movies[i] = scanner.nextLine();
        }

        System.out.println("\nYour favourite movies are:");
        for (String movie : movies) {
            System.out.println("- " + movie);
        }

        scanner.close();
    }
}

