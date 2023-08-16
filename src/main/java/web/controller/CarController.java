package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.CarEntity;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCars(@RequestParam(value ="count") Optional<Integer> count, ModelMap modelMap){
        CarServiceImpl carService= new CarServiceImpl();
        List<CarEntity> cars = carService.getCars(count.orElse(0));
        modelMap.addAttribute("cars", cars);

        return "cars";
    }
}
