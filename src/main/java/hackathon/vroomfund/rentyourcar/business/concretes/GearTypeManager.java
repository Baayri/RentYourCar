package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.GearTypeService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessDataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessResult;
import hackathon.vroomfund.rentyourcar.dataAccess.abstracts.GearTypeDao;
import hackathon.vroomfund.rentyourcar.entities.concretes.GearType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GearTypeManager implements GearTypeService {

    private final GearTypeDao gearTypeDao;

    @Autowired
    public GearTypeManager(GearTypeDao gearTypeDao) {
        super();
        this.gearTypeDao = gearTypeDao;
    }

    @Override
    public Result add(GearType gearType) {
        this.gearTypeDao.save(gearType);
        return new SuccessResult();
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
        return new SuccessDataResult<>(this.gearTypeDao.findAll());
    }
}
