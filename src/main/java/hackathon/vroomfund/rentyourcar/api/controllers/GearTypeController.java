package hackathon.vroomfund.rentyourcar.api.controllers;

import hackathon.vroomfund.rentyourcar.business.abstracts.GearTypeService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.GearType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gearTypes")
@CrossOrigin
public class GearTypeController {

    private final GearTypeService gearTypeService;

    @Autowired
    public GearTypeController(GearTypeService gearTypeService) {
        super();
        this.gearTypeService = gearTypeService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody GearType gearType){
        return this.gearTypeService.add(gearType);
    }

    @PostMapping("/update")
    public Result update(@RequestBody GearType gearType){
        return this.gearTypeService.update(gearType);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody GearType gearType){
        return this.gearTypeService.delete(gearType);
    }

    @GetMapping("/getAll")
    public DataResult<List<GearType>> getAll(){
        return this.gearTypeService.getAll();
    }
}
