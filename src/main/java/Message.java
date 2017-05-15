import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



/**
 * Created by jlarrieux on 5/15/2017.
 */
@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    private String text;

    public String getText(){
        return text;
    }


    public void setText(String text){
        this.text = text;
    }


}
