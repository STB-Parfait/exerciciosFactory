package biblioteca;

public class DigitalMedia extends LibraryItem{

    public String fileFormat;

    public DigitalMedia(String title, String author, int publicationYear, String fileFormat){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.fileFormat = fileFormat;
    }

    public void play(){
        System.out.println(title + "has been played.");
    }

    @Override
    public void borrow(){
        System.out.println(title + fileFormat + " has been borrowed.");
    }

    @Override
    public void returnItem(){
        System.out.println(title + fileFormat + " is playing");
    }

}
