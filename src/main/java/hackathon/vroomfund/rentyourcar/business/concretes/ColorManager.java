package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.ColorService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.Color;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ColorManager implements ColorService {
    @Override
    public Result add(Color color) {
        return null;
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
        return null;
    }
}
