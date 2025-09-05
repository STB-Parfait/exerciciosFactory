package biblioteca;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book primeiro = new Book(
                "LOTR",
                "J.R.R Tolkien",
                1960,
                "Fantasy");
        Magazine segundo = new Magazine(
                "Times",
                "idk",
                1980,
                15);
        DigitalMedia terceiro = new DigitalMedia("Crabbuckit",
                "Good Lovelies",
                2011,
                ".mp3");

        primeiro.borrow();
        segundo.borrow();
        terceiro.borrow();

        System.out.print("\n");

        primeiro.readSample();
        segundo.flipPages();
        terceiro.play();
    }
}
