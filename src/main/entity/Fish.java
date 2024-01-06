import jakarta.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_fish")
public class Fish {
    @Id
    private Integer weihgt;
    enum Type {SUPER,GOOD,BAD};
}
