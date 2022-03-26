package hackathon.vroomfund.rentyourcar.business.abstracts;

import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.Rental;

import java.util.List;

public interface RentalService {
    Result add(Rental rental);
    Result update(Rental rental);
    Result delete(Rental rental);
    DataResult<List<Rental>> getAll();
}
