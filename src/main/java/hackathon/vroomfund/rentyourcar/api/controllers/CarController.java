package hackathon.vroomfund.rentyourcar.api.controllers;

import hackathon.vroomfund.rentyourcar.business.abstracts.CarService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@CrossOrigin
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        super();
        this.carService = carService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Car car){
        return this.carService.add(car);
    }

    @PostMapping("/update")
    public Result update(@RequestBody Car car){
        return this.carService.update(car);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody Car car){
        return this.carService.delete(car);
    }

    @GetMapping("/getAll")
    public DataResult<List<Car>> getAll(){
        return this.carService.getAll();
    }

}
