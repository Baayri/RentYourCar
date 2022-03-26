package hackathon.vroomfund.rentyourcar.business.abstracts;

import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.DrivingLicenseClass;

import java.util.List;

public interface DrivingLicenseClassService {
    Result add(DrivingLicenseClass drivingLicenseClass);
    Result update(DrivingLicenseClass drivingLicenseClass);
    Result delete(DrivingLicenseClass drivingLicenseClass);
    DataResult<List<DrivingLicenseClass>> getAll();
}
