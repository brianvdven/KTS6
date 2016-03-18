package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author pc
 */
@Entity(name = "Tweet")
public class Tweet implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private String postname;
    
    @Temporal(TemporalType.DATE)
    private Date postdate;
    private String content;

    public Tweet() {
    }

    public Tweet(int id, User user, Date postdate, String content) {
        this.id = id;
        this.postname = user.getName();
        this.postdate = postdate;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    public Date getDate() {
        return postdate;
    }

    public void setDate(Date postdate) {
        this.postdate = postdate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
