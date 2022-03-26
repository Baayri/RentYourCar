package hackathon.vroomfund.rentyourcar.api.controllers;

import hackathon.vroomfund.rentyourcar.business.abstracts.InsuranceService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.Insurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/insurances")
@CrossOrigin
public class InsuranceController {

    private final InsuranceService insuranceService;

    @Autowired
    public InsuranceController(InsuranceService insuranceService) {
        super();
        this.insuranceService = insuranceService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Insurance insurance){
        return this.insuranceService.add(insurance);
    }

    @PostMapping("/update")
    public Result update(@RequestBody Insurance insurance){
        return this.insuranceService.update(insurance);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody Insurance insurance){
        return this.insuranceService.delete(insurance);
    }

    @GetMapping("/getAll")
    public DataResult<List<Insurance>> getAll(){
        return this.insuranceService.getAll();
    }
}
