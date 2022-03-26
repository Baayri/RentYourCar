package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.CarService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarManager implements CarService {
    @Override
    public Result add(Car car) {
        return null;
    }

    @Override
    public Result update(Car car) {
        return null;
    }

    @Override
    public Result delete(Car car) {
        return null;
    }

    @Override
    public DataResult<List<Car>> getAll() {
        return null;
    }
}
