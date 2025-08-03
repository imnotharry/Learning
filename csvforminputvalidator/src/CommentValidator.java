public class CommentValidator implements Validator<String> {
    @Override
    public boolean isValid(String comment) {
        return comment != null && comment.matches("^[a-zA-Z0-9 _\\-!?.$]*$");
    }
}
