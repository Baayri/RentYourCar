package hackathon.vroomfund.rentyourcar.business.abstracts;

import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    Result add(Brand brand);
    Result update(Brand brand);
    Result delete(Brand brand);
    DataResult<List<Brand>> getAll();
}
