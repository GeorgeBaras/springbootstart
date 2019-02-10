package demo.domain;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class DemoObject {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String demoProperty;

}
