package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.UserLicenseClassService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessDataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessResult;
import hackathon.vroomfund.rentyourcar.dataAccess.abstracts.UserLicenseClassDao;
import hackathon.vroomfund.rentyourcar.entities.concretes.UserLicenseClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserLicenseClassManager implements UserLicenseClassService {

    private final UserLicenseClassDao userLicenseClassDao;

    @Autowired
    public UserLicenseClassManager(UserLicenseClassDao userLicenseClassDao) {
        super();
        this.userLicenseClassDao = userLicenseClassDao;
    }

    @Override
    public Result add(UserLicenseClass userLicenseClass) {
        this.userLicenseClassDao.save(userLicenseClass);
        return new SuccessResult();
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
        return new SuccessDataResult<>(this.userLicenseClassDao.findAll());
    }
}
