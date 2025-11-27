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

        import java.util.Scanner;

public class FavoriteBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many favourite books do you want to enter?");
        int count = scanner.nextInt();
        scanner.nextLine(); // Clear leftover newline

        String[] books = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter book #" + (i + 1) + ": ");
            books[i] = scanner.nextLine();
        }

        System.out.println("\nYour favourite books are:");
        for (String book : books) {
            System.out.println("- " + book);
        }

        scanner.close();
    }
}


        scanner.close();
    }
}
import java.util.Scanner;

public class FavoriteArtists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many favourite artists do you want to enter?");
        int count = scanner.nextInt();
        scanner.nextLine(); // Clear leftover newline

        String[] artists = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter artist #" + (i + 1) + ": ");
            artists[i] = scanner.nextLine();
        }

        System.out.println("\nYour favourite artists are:");
        for (String artist : artists) {
            System.out.println("- " + art

