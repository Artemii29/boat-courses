import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Boat {
    private String name;
    private Enum type;
    private Integer displacement;
    private Date buildDate;

}
