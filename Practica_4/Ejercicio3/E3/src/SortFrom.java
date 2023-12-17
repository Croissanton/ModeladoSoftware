public class SortFrom implements SortStrategy{
    @Override
    public boolean sort(Email email1, Email email2) {
        String from1 = email1.getFrom();
        String from2 = email2.getFrom();
        int comparisonResult = from1.compareTo(from2); //should be earlier (a.b) < 0, should be after (b.a) > 0 (so should be swapped)
        return comparisonResult > 0;
    }
}
