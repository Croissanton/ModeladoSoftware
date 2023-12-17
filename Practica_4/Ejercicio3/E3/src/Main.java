public class Main {
    public static void main(String[] args) {
        Mailbox mailbox = new Mailbox();
        mailbox.addEmail(new Email("a", "b", "01/12/23", false, "e"));
        mailbox.addEmail(new Email("b", "c", "02/12/23", true, "f"));
        mailbox.addEmail(new Email("c", "d", "01/01/24", false, "g"));
        mailbox.addEmail(new Email("d", "e", "24/05/25", true, "h"));
        mailbox.addEmail(new Email("e", "f", "01/12/23", false, "i"));
        mailbox.addEmail(new Email("f", "g", "02/12/23", true, "j"));
        mailbox.addEmail(new Email("g", "h", "01/01/24", false, "k"));
        mailbox.addEmail(new Email("h", "i", "24/05/25", true, "l"));
        mailbox.addEmail(new Email("i", "j", "01/12/23", false, "m"));




        mailbox.setSortStrategy(new SortDate());
        System.out.println("//////////////Sort by date /////////////////".toUpperCase());
        mailbox.show();

        mailbox.setSortStrategy(new SortFrom());
        System.out.println("////////////// Sort by from //////////////".toUpperCase());
        mailbox.show();


        mailbox.setSortStrategy(new SortPriority());
        System.out.println("////////////// Sort by priority //////////////".toUpperCase());
        mailbox.show();

        mailbox.setSortStrategy(new SortSubject());
        System.out.println("////////////// Sort by subject //////////////".toUpperCase());
        mailbox.show();

    }
}