package hackathon.vroomfund.rentyourcar.business.abstracts;

import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.UserLicenseClass;

import java.util.List;

public interface UserLicenseClassService {
    Result add(UserLicenseClass userLicenseClass);
    Result update(UserLicenseClass userLicenseClass);
    Result delete(UserLicenseClass userLicenseClass);
    DataResult<List<UserLicenseClass>> getAll();
}
