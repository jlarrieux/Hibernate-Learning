import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



/**
 * Created by jlarrieux on 5/15/2017.
 */
public class HelloWorldJPA {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HelloWorldPU");

    }


}
