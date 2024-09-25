package com.zwigato.zwigato.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zwigato.zwigato.Entity.Restaurent;
import com.zwigato.zwigato.Service.RestaurentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class ZwigatoController {

    private RestaurentService restaurentService;

    public ZwigatoController(RestaurentService restaurentService)
    {
        super();
        this.restaurentService = restaurentService;
    }
    @RequestMapping("/home")
    @ResponseBody
    public String home()
    {
        System.out.println("Zwigato Application");
        return "Zwigato Application";
    }

    @GetMapping("/restaurents")
    public List<Restaurent> listRestaurents(Model model)
    {
        List<Restaurent> restaurents = restaurentService.getAllRestaurents();
        model.addAttribute("restaurents", restaurents);
        return restaurents;
    }

    @GetMapping("/restaurent/new")
    
    public String addRestaurents(Model model)
    {
        Restaurent restaurent = new Restaurent();
        model.addAttribute("restaurent", restaurent);
        return "addRestaurent";
    }

    @PostMapping("/restaurent")
    
    public String saveRestaurent(@ModelAttribute("restaurent") Restaurent restaurent)
    {
        restaurentService.saveRestaurent(restaurent);
        return "redirect:/restaurents";
    }
}
