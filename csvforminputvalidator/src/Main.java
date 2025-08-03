import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CSV file path: ");
        String path = scanner.nextLine();

        UserCommentParser parser = new UserCommentParser();
        parser.parseCSV(path);
    }
}