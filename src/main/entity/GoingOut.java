import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class GoingOut {
    @ManyToOne
    @JoinColumn(name = "boat_id")
    private Boat boat;
    private Date dateOut;
    private Date dateReturn;
    @OneToMany
    @JoinColumn(name="fish_id")
    private List<Fish> fish;

}
