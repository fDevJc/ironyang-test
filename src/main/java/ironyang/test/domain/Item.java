package ironyang.test.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {
    @Id @GeneratedValue
    private Long id;
    private String name;

    public Item(String name) {
        this.name = name;
    }
}
