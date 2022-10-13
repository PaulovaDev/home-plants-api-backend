package homeplantsapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "pictures")
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String path;
    private Date uploadDate;

    
}