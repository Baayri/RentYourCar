package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.GearTypeService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.GearType;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GearTypeManager implements GearTypeService {
    @Override
    public Result add(GearType gearType) {
        return null;
    }

    @Override
    public Result update(GearType gearType) {
        return null;
    }

    @Override
    public Result delete(GearType gearType) {
        return null;
    }

    @Override
    public DataResult<List<GearType>> getAll() {
        return null;
    }
}
