public class SortSubject implements  SortStrategy{
    @Override
    public boolean sort(Email email1, Email email2) {
        String subject1 = email1.getSubject();
        String subject2 = email2.getSubject();
        int comparisonResult = subject1.compareTo(subject2); //should be earlier (a.b) < 0, should be after (b.a) > 0 (so should be swapped)
        return comparisonResult > 0;
    }
}
