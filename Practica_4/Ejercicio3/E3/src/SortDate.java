public class SortDate implements SortStrategy  {
    @Override
    public boolean sort(Email email1, Email email2) {
        return email1.getDate()-email2.getDate() > 0;
    }
}
