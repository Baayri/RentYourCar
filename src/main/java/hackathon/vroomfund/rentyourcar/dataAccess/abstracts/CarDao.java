package hackathon.vroomfund.rentyourcar.dataAccess.abstracts;

import hackathon.vroomfund.rentyourcar.entities.concretes.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDao extends JpaRepository<Car,Integer> {
}
