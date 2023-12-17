import java.util.ArrayList;

import static java.util.Collections.swap;

public class Mailbox {
    private ArrayList<Email> email = new ArrayList<>();
    private SortStrategy sortStrategy;

    void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void show(){
        sort();
        for (Email email : email) {
            System.out.println(email);
        }
    }

    private void sort() {
        for (int i = 2; i < email.size(); i++) {
            for (int j = email.size()-1; j >= i; j-- ){
                if (before(email.get(j-1),email.get(j)) ){
                    swap(email,j,j-1);
                }
            }
        }
    }


    private boolean before(Email email, Email email1) {
        return sortStrategy.sort(email, email1);
    }

    public void addEmail(Email email) {
        this.email.add(email);
    }
}
