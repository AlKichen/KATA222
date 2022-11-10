package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.service.CarService;

@Controller
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String carsMethodGet(@RequestParam(value = "count", required = false) String count, Model model) {
        model.addAttribute("title", "Список автомобилей в виде таблицы:");
        model.addAttribute("cars", carService.getListCars(count));

        return "cars";
    }
}
