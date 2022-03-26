package hackathon.vroomfund.rentyourcar.business.abstracts;

import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.Car;

import java.util.List;

public interface CarService {
    Result add(Car car);
    Result update(Car car);
    Result delete(Car car);
    DataResult<List<Car>> getAll();
}
