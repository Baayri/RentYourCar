package hackathon.vroomfund.rentyourcar.dataAccess.abstracts;

import hackathon.vroomfund.rentyourcar.entities.concretes.DrivingLicenseClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrivingLicenseClassDao extends JpaRepository<DrivingLicenseClass,Integer> {
}
