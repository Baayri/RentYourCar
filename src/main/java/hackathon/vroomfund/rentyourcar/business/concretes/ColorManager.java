package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.ColorService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessDataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessResult;
import hackathon.vroomfund.rentyourcar.dataAccess.abstracts.ColorDao;
import hackathon.vroomfund.rentyourcar.entities.concretes.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ColorManager implements ColorService {

    private final ColorDao colorDao;

    @Autowired
    public ColorManager(ColorDao colorDao) {
        super();
        this.colorDao = colorDao;
    }

    @Override
    public Result add(Color color) {
        this.colorDao.save(color);
        return new SuccessResult();
    }

    @Override
    public Result update(Color color) {
        return null;
    }

    @Override
    public Result delete(Color color) {
        return null;
    }

    @Override
    public DataResult<List<Color>> getAll() {
        return new SuccessDataResult<>(this.colorDao.findAll());
    }
}
