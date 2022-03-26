package hackathon.vroomfund.rentyourcar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import hackathon.vroomfund.rentyourcar.entities.concretes.Color;
public interface ColorDao extends JpaRepository<Color,Integer> {
}
