package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.RentalService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.Rental;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentalManager implements RentalService {
    @Override
    public Result add(Rental rental) {
        return null;
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
        return null;
    }
}
