package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;
import java.util.Optional;

@Controller
public class CarController {
    private CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count") Optional<Integer> count, ModelMap model) {
        model.addAttribute("car", carService.getCar(count.orElse(0)));
        return "cars";
    }
}
