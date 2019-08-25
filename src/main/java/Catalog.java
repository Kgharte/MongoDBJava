import com.mongodb.BasicDBObject;

import java.io.Serializable;

public class Catalog extends BasicDBObject implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String catalogId;
    private String journal;
    private String publisher;
    private String edition;
    private String title;
    private String author;
    public Catalog() {
        super();
    }
    public Catalog(String catalogId, String journal, String publisher,
                   String edition, String title, String author) {
        this.catalogId = catalogId;
        this.journal = journal;
        this.publisher = publisher;
        this.edition = edition;
        this.title = title;
        this.author = author;
    }
}
