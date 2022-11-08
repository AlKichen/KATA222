package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;

@Controller
public class CarsController {

    private final CarDaoImpl carDao;

    @Autowired
    public CarsController(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @GetMapping(value = "/cars")
    public String carsMethodGet(@RequestParam(value = "count", required = false) String count, Model model) {
        model.addAttribute("title", "Список автомобилей в виде таблицы:");
        model.addAttribute("cars", carDao.getListCars(count));

        return "cars";
    }
}
