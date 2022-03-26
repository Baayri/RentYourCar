package hackathon.vroomfund.rentyourcar.business.abstracts;

import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.GearType;

import java.util.List;

public interface GearTypeService {
    Result add(GearType gearType);
    Result update(GearType gearType);
    Result delete(GearType gearType);
    DataResult<List<GearType>> getAll();
}
