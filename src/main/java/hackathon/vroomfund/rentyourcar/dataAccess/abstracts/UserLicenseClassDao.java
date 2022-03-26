package hackathon.vroomfund.rentyourcar.dataAccess.abstracts;

import hackathon.vroomfund.rentyourcar.entities.concretes.UserLicenseClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLicenseClassDao extends JpaRepository<UserLicenseClass,Integer> {
}
