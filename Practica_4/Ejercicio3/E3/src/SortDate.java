public class SortDate implements SortStrategy  {
    public boolean sort(Email email1, Email email2) {
        return email1.getDate()-email2.getDate() > 0;
    }
}
