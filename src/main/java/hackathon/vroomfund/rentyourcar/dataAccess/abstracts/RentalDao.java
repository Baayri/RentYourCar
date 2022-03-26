package hackathon.vroomfund.rentyourcar.dataAccess.abstracts;

import hackathon.vroomfund.rentyourcar.entities.concretes.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalDao extends JpaRepository<Rental,Integer> {
}
