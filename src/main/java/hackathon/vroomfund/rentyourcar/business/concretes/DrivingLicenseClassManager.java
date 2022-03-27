package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.DrivingLicenseClassService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessDataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessResult;
import hackathon.vroomfund.rentyourcar.dataAccess.abstracts.DrivingLicenseClassDao;
import hackathon.vroomfund.rentyourcar.entities.concretes.DrivingLicenseClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DrivingLicenseClassManager implements DrivingLicenseClassService {

    private final DrivingLicenseClassDao drivingLicenseClassDao;

    @Autowired
    public DrivingLicenseClassManager(DrivingLicenseClassDao drivingLicenseClassDao) {
        super();
        this.drivingLicenseClassDao = drivingLicenseClassDao;
    }

    @Override
    public Result add(DrivingLicenseClass drivingLicenseClass) {
        this.drivingLicenseClassDao.save(drivingLicenseClass);
        return new SuccessResult();
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
        return new SuccessDataResult<>(this.drivingLicenseClassDao.findAll());
    }
}
