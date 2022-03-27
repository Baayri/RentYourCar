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
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "identity_number")
    private String identityNumber;
    @Column(name = "authenticated_user")
    private Boolean authenticatedUser;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Car> cars;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Rental> rentals;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<UserLicenseClass> userLicenseClasses;
}
