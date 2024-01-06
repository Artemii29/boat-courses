import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class GoingOut {
    @ManyToOne
    private Boat boat;
}
