package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.DrivingLicenseClassService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.DrivingLicenseClass;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DrivingLicenseClassManager implements DrivingLicenseClassService {
    @Override
    public Result add(DrivingLicenseClass drivingLicenseClass) {
        return null;
    }

    @Override
    public Result update(DrivingLicenseClass drivingLicenseClass) {
        return null;
    }

    @Override
    public Result delete(DrivingLicenseClass drivingLicenseClass) {
        return null;
    }

    @Override
    public DataResult<List<DrivingLicenseClass>> getAll() {
        return null;
    }
}
