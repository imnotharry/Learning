import java.io.*;

public class UserCommentParser {

    private final Validator<String> emailValidator = new EmailValidator();
    private final Validator<String> usernameValidator = new UsernameValidator();
    private final Validator<String> commentValidator = new CommentValidator();

    public void parseCSV(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            boolean headerSkipped = false;

            while ((line = reader.readLine()) != null) {
                if (!headerSkipped) {
                    headerSkipped = true;
                    continue;
                }

                String[] parts = line.split(",", 3);

                if (parts.length != 3) {
                    System.err.println("Invalid row format: " + line);
                    continue;
                }

                String username = Sanitizer.sanitize(parts[0].trim());
                String email = Sanitizer.sanitize(parts[1].trim());
                String comment = Sanitizer.sanitize(parts[2].trim());

                boolean validUsername = usernameValidator.isValid(username);
                boolean validEmail = emailValidator.isValid(email);
                boolean validComment = commentValidator.isValid(comment);

                if (validUsername && validEmail && validComment) {
                    UserComment uc = new UserComment(username, email, comment);
                    System.out.println(uc);
                } else {
                    System.err.println("Invalid data: " + line);
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
