package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String carsMethodGet(@RequestParam(value = "count", required = false) int count, Model model) {

        return "cars";
    }
}
