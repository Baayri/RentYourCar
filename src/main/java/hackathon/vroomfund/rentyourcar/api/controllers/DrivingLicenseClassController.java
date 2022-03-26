package hackathon.vroomfund.rentyourcar.api.controllers;

import hackathon.vroomfund.rentyourcar.business.abstracts.DrivingLicenseClassService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.DrivingLicenseClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drivingLicenseClasses")
@CrossOrigin
public class DrivingLicenseClassController {

    private final DrivingLicenseClassService drivingLicenseClassService;

    @Autowired
    public DrivingLicenseClassController(DrivingLicenseClassService drivingLicenseClassService) {
        super();
        this.drivingLicenseClassService = drivingLicenseClassService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody DrivingLicenseClass drivingLicenseClass){
        return this.drivingLicenseClassService.add(drivingLicenseClass);
    }

    @PostMapping("/update")
    public Result update(@RequestBody DrivingLicenseClass drivingLicenseClass) {
        return this.drivingLicenseClassService.update(drivingLicenseClass);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody DrivingLicenseClass drivingLicenseClass){
        return this.drivingLicenseClassService.delete(drivingLicenseClass);
    }

    @GetMapping("/getAll")
    public DataResult<List<DrivingLicenseClass>> getAll(){
        return this.drivingLicenseClassService.getAll();
    }
}
