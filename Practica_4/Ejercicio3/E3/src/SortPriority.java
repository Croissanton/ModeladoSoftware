public class SortPriority implements SortStrategy {
    @Override
    public boolean sort(Email email1, Email email2) {
        return email1.getPriority();
    }
}
