package hackathon.vroomfund.rentyourcar.api.controllers;

import hackathon.vroomfund.rentyourcar.business.abstracts.RentalService;
import hackathon.vroomfund.rentyourcar.core.utilities.results.DataResult;
import hackathon.vroomfund.rentyourcar.core.utilities.results.Result;
import hackathon.vroomfund.rentyourcar.entities.concretes.Rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rentals")
@CrossOrigin
public class RentalController {

    private final RentalService rentalService;

    @Autowired
    public RentalController(RentalService rentalService) {
        super();
        this.rentalService = rentalService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Rental rental){
        return this.rentalService.add(rental);
    }

    @PostMapping("/update")
    public Result update(@RequestBody Rental rental){
        return this.rentalService.update(rental);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody Rental rental){
        return this.rentalService.delete(rental);
    }

    @GetMapping("/getAll")
    public DataResult<List<Rental>> getAll(){
        return this.rentalService.getAll();
    }
}
