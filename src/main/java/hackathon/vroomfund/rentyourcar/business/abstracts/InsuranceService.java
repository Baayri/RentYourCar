package hackathon.vroomfund.rentyourcar.business.abstracts;

import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.Insurance;

import java.util.List;

public interface InsuranceService {
    Result add(Insurance insurance);
    Result update(Insurance insurance);
    Result delete(Insurance insurance);
    DataResult<List<Insurance>> getAll();
}
