package hackathon.vroomfund.rentyourcar.dataAccess.abstracts;

import hackathon.vroomfund.rentyourcar.entities.concretes.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceDao extends JpaRepository<Insurance,Integer> {
}
