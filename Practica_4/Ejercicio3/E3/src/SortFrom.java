import java.util.ArrayList;

public class SortFrom implements SortStrategy{
    public boolean sort(Email email1, Email email2) {
        String from1 = email1.getFrom();
        String from2 = email2.getFrom();
        int comparisonResult = from1.compareTo(from2);
        return 
    }
}
