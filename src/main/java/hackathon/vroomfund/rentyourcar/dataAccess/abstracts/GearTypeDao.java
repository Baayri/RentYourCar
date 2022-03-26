package hackathon.vroomfund.rentyourcar.dataAccess.abstracts;

import hackathon.vroomfund.rentyourcar.entities.concretes.GearType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GearTypeDao extends JpaRepository<GearType,Integer> {
}
