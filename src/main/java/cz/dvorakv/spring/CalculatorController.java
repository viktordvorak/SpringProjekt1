package cz.dvorakv.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorController {

    @GetMapping
    public String getCalculator(Model model) {

    model.addAttribute("calculator", new CalculatorForm());
    return "calulator";
    }

}
