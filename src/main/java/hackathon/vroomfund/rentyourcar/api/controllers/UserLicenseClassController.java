package hackathon.vroomfund.rentyourcar.api.controllers;

import hackathon.vroomfund.rentyourcar.business.abstracts.UserLicenseClassService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.UserLicenseClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userLicenseClasses")
@CrossOrigin
public class UserLicenseClassController {

    private final UserLicenseClassService userLicenseClassService;

    @Autowired
    public UserLicenseClassController(UserLicenseClassService userLicenseClassService) {
        super();
        this.userLicenseClassService = userLicenseClassService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody UserLicenseClass userLicenseClass){
        return this.userLicenseClassService.add(userLicenseClass);
    }

    @PostMapping("/update")
    public Result update(@RequestBody UserLicenseClass userLicenseClass){
        return this.userLicenseClassService.update(userLicenseClass);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody UserLicenseClass userLicenseClass ){
        return this.userLicenseClassService.delete(userLicenseClass);
    }

    @GetMapping("/getAll")
    public DataResult<List<UserLicenseClass>> getAll(){
        return this.userLicenseClassService.getAll();
    }
}
