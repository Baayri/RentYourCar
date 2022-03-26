package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.UserService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserManager implements UserService {
    @Override
    public Result add(User user) {
        return null;
    }

    @Override
    public Result update(User user) {
        return null;
    }

    @Override
    public Result delete(User user) {
        return null;
    }

    @Override
    public DataResult<List<User>> getAll() {
        return null;
    }
}
