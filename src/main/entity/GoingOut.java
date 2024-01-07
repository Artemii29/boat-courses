import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class GoingOut {
    @ManyToOne
    private Boat boat;
    private Date dateOut;
    private Date dateReturn;
    @OneToMany
    private List<Fish> fish;

}
