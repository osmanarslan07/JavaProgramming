package day47_Polymoprhism;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishedDate;

    public EncapsulationReview(String bookTitle, String publishedDate) {
        //this.bookTitle=bookTitle;
        setBookTitle(bookTitle);
        this.publishedDate = publishedDate;
    }

    public String getBookTitle() {
        if (bookTitle==null){
            return "";
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle==null|| bookTitle==""){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    


}
