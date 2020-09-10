package Book;

public class Book {
    private String author;
    private String title;
    private String date;
    public Book(String author, String title, String date){
        this.author = author;
        this.title = title;
        this.date = date;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public String getDate(){
        return date;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
