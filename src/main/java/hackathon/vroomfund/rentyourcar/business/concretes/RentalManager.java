package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.RentalService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessDataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessResult;
import hackathon.vroomfund.rentyourcar.dataAccess.abstracts.RentalDao;
import hackathon.vroomfund.rentyourcar.entities.concretes.Rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentalManager implements RentalService {

    private final RentalDao rentalDao;

    @Autowired
    public RentalManager(RentalDao rentalDao) {
        super();
        this.rentalDao = rentalDao;
    }

    @Override
    public Result add(Rental rental) {
        this.rentalDao.save(rental);
        return new SuccessResult();
    }

    @Override
    public Result update(Rental rental) {
        return null;
    }

    @Override
    public Result delete(Rental rental) {
        return null;
    }

    @Override
    public DataResult<List<Rental>> getAll() {
        return new SuccessDataResult<>(this.rentalDao.findAll());
    }
}
