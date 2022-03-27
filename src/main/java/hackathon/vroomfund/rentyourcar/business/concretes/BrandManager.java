package hackathon.vroomfund.rentyourcar.business.concretes;

import hackathon.vroomfund.rentyourcar.business.abstracts.BrandService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessDataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.SuccessResult;
import hackathon.vroomfund.rentyourcar.dataAccess.abstracts.BrandDao;
import hackathon.vroomfund.rentyourcar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private final BrandDao brandDao;

    @Autowired
    public BrandManager(BrandDao brandDao) {
        super();
        this.brandDao=brandDao;
    }

    @Override
    public Result add(Brand brand) {
        this.brandDao.save(brand);
        return new SuccessResult();
    }

    @Override
    public Result update(int id,String brandName) {
        Brand updateBrand = this.brandDao.getById(id);
        updateBrand.setBrandName(brandName);
        this.brandDao.save(updateBrand);
        return new SuccessResult();
    }

    @Override
    public Result delete(int id) {
        Brand deleteBrand = this.brandDao.getById(id);
        this.brandDao.delete(deleteBrand);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<Brand>> getAll() {
        return new SuccessDataResult<>(this.brandDao.findAll());
    }

    @Override
    public DataResult<Brand> getById(int id) {
        return new SuccessDataResult<>(this.brandDao.getById(id));
    }
}
