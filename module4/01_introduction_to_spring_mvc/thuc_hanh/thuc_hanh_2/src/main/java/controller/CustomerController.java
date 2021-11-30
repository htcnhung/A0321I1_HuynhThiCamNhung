package controller;

import controller.model.Customer;
import controller.service.CustomerService;
import controller.service.CustomerServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/customers/detail/{id}")
    public ModelAndView showInfo() {
        ModelAndView modelAndView = new ModelAndView("info");
        return modelAndView;
    }

//    public String updateCustomer(@RequestParam String name, String mail, Model model){
//        model.addAttribute("name", name);
//        return "info";

    @PostMapping("/customers/update")
    public String updateCustomer(
            @RequestParam Long id,
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String address) {
        Customer customer = new Customer(id,name,email,address);
        customerService.save(customer);

        return "redirect:/customers";
    }

}
