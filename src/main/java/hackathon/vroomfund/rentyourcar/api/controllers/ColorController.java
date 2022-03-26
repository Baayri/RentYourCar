package hackathon.vroomfund.rentyourcar.api.controllers;

import hackathon.vroomfund.rentyourcar.business.abstracts.ColorService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colors")
@CrossOrigin
public class ColorController {

    private final ColorService colorService;

    @Autowired
    public ColorController(ColorService colorService) {
        super();
        this.colorService = colorService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Color color){
        return this.colorService.add(color);
    }

    @PostMapping("/update")
    public Result update(@RequestBody Color color){
        return this.colorService.update(color);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody Color color){
        return this.colorService.delete(color);
    }

    @GetMapping("/getAll")
    public DataResult<List<Color>> getAll(){
        return this.colorService.getAll();
    }
}
