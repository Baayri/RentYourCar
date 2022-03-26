package hackathon.vroomfund.rentyourcar.business.abstracts;

import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.Color;

import java.util.List;

public interface ColorService {
    Result add(Color color);
    Result update(Color color);
    Result delete(Color color);
    DataResult<List<Color>> getAll();
}
