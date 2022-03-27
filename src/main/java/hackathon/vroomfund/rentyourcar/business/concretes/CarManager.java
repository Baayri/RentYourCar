package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.CarService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessDataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessResult;
import hackathon.vroomfund.rentyourcar.dataAccess.abstracts.CarDao;
import hackathon.vroomfund.rentyourcar.entities.concretes.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarManager implements CarService {

    private final CarDao carDao;

    @Autowired
    public CarManager(CarDao carDao) {
        super();
        this.carDao = carDao;
    }

    @Override
    public Result add(Car car) {
        this.carDao.save(car);
        return new SuccessResult();
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
        return new SuccessDataResult<>(this.carDao.findAll());
    }
}
