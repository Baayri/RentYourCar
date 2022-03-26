package hackathon.vroomfund.rentyourcar.dataAccess.abstracts;

import hackathon.vroomfund.rentyourcar.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
