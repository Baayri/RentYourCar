package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.InsuranceService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessDataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessResult;
import hackathon.vroomfund.rentyourcar.dataAccess.abstracts.InsuranceDao;
import hackathon.vroomfund.rentyourcar.entities.concretes.Insurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InsuranceManager implements InsuranceService {

    private final InsuranceDao insuranceDao;

    @Autowired
    public InsuranceManager(InsuranceDao insuranceDao) {
        super();
        this.insuranceDao = insuranceDao;
    }

    @Override
    public Result add(Insurance insurance) {
        this.insuranceDao.save(insurance);
        return new SuccessResult();
    }

    @Override
    public Result update(Insurance insurance) {
        return null;
    }

    @Override
    public Result delete(Insurance insurance) {
        return null;
    }

    @Override
    public DataResult<List<Insurance>> getAll() {
        return new SuccessDataResult<>(this.insuranceDao.findAll());
    }
}
