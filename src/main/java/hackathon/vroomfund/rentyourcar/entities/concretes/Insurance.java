package hackathon.vroomfund.rentyourcar.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "insurances")
public class Insurance {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "insurance_company")
    private String insuranceCompany;

    @JsonIgnore
    @OneToMany(mappedBy = "insurance")
    private List<Car> cars;
}
