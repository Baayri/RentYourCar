package hackathon.vroomfund.rentyourcar.business.abstracts;

import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.User;

import java.util.List;

public interface UserService {
    Result add(User user);
    Result update(User user);
    Result delete(User user);
    DataResult<List<User>> getAll();
}
