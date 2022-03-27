package hackathon.vroomfund.rentyourcar.api.controllers;

import hackathon.vroomfund.rentyourcar.business.abstracts.BrandService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
@CrossOrigin
public class BrandController {
    private final BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        super();
        this.brandService = brandService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Brand brand){
        return this.brandService.add(brand);
    }

    @PostMapping("/update")
    public Result update(@RequestParam int id,@RequestParam String brandName){
        return this.brandService.update(id,brandName);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam int id){
        return this.brandService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<Brand>> getAll(){
        return this.brandService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<Brand> getById(@RequestParam int id){
        return this.brandService.getById(id);
    }
}
