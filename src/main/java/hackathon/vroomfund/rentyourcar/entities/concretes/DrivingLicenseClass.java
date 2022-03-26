package hackathon.vroomfund.rentyourcar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "driving_license_class")
public class DrivingLicenseClass {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "license_class_name")
    private String licenseClassName;

    @OneToMany(mappedBy = "drivingLicenseClass")
    private List<UserLicenseClass> userLicenseClasses;
}
