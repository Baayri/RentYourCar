package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.InsuranceService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.Insurance;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InsuranceManager implements InsuranceService {
    @Override
    public Result add(Insurance insurance) {
        return null;
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
        return null;
    }
}
