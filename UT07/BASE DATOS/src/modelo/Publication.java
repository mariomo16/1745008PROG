package modelo;

public class Publication {
    private final Integer id;
    private String bookTitle;
    private String publishDate;
    private String publishCo;

    
    public Publication(Integer id) {
        this.id = id;
    }    

    public Publication(Integer id, String bookTitle, String publishDate, String publishCo) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.publishDate = publishDate;
        this.publishCo = publishCo;
    }

    public Integer getId() {
        return id;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
    public String getPublishCo() {
        return publishCo;
    }
    public void setPublishCo(String publishCo) {
        this.publishCo = publishCo;
    }

    @Override
    public String toString() {
        return "Publication [id=" + id + 
        ", Título=" + bookTitle + 
        ", fechaPublicación=" + publishDate + 
        ", Editorial=" + publishCo + "]";
    }
    
}
