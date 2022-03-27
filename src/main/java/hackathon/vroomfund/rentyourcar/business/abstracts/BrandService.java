package hackathon.vroomfund.rentyourcar.business.abstracts;

import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    Result add(Brand brand);
    Result update(int id,String brandName);
    Result delete(int id);
    DataResult<List<Brand>> getAll();
    DataResult<Brand> getById(int id);
}
