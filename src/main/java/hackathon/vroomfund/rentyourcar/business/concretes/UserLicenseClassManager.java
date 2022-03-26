package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.UserLicenseClassService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.UserLicenseClass;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserLicenseClassManager implements UserLicenseClassService {
    @Override
    public Result add(UserLicenseClass userLicenseClass) {
        return null;
    }

    @Override
    public Result update(UserLicenseClass userLicenseClass) {
        return null;
    }

    @Override
    public Result delete(UserLicenseClass userLicenseClass) {
        return null;
    }

    @Override
    public DataResult<List<UserLicenseClass>> getAll() {
        return null;
    }
}
