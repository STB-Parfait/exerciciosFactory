package biblioteca;

public class Magazine extends LibraryItem{

    public int issueNumber;

    public Magazine(String title, String author, int publicationYear, int issueNumber){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.issueNumber = issueNumber;
    }

    public void flipPages(){
        System.out.println("You flip the magazine's pages");
    }

    @Override
    public void borrow(){
        System.out.println("The magazine " + title + " has been borrowed.");
    }

    @Override
    public void returnItem(){
        System.out.println(title + "has been returned.");
    }
}
