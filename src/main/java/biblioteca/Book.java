package biblioteca;

public class Book extends LibraryItem{

    public String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
    }

    public void readSample(){
        System.out.println("You read the sample in the back of the book");
    }

    @Override
    public void borrow(){
        System.out.println("The book " + title + " has been borrowed.");
    }

    @Override
    public void returnItem(){
        System.out.println(title + " has been returned.");
    }

}
