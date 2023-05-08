package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

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

    public static Publication fromResulSet (ResultSet rs) throws SQLException {
        //obtengo los datos del resultado
        String bookTitle = rs.getString("book_title");
        String publishDate = rs.getString("publish_date");
        String publishCo = rs.getString("publish_co");
        Integer id = rs.getInt("id");

        //Lo asigno a un objeto Publication
        Publication p = new Publication(
            id , bookTitle, publishDate,
            publishCo
        );

        return p;
    }
}
