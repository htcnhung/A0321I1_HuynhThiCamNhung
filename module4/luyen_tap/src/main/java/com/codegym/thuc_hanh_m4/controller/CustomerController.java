//package com.codegym.thuc_hanh_m4.controller;
//
//import com.codegym.case_study_4.model.*;
//import com.codegym.case_study_4.service.CustomerService;
//import com.codegym.case_study_4.service.CustomerTypeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.propertyeditors.CustomDateEditor;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//@Controller
//@RequestMapping("/customer")
//public class CustomerController {
//    @Autowired
//    CustomerService customerService;
//
//    @Autowired
//    CustomerTypeService customerTypeService;
//
//    @InitBinder
//    protected void initBinder(WebDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//    }
//
//    @ModelAttribute("customerTypes")
//    public Iterable<CustomerType> listCustomerType() {
//        return customerTypeService.findAll();
//    }
//
//    @ModelAttribute("customer")
//    public Customer customer() {
//        return new Customer();
//    }
//
//    @ModelAttribute("customers")
//    public Iterable<Customer> listCustomer(@PageableDefault(value = 5) Pageable pageable) {
//        return customerService.findAll(pageable);
//    }
//
//    @GetMapping(value = {"", "/list"})
//    public String showList(Model model) {
//        Iterable<CustomerType> customerTypes = customerTypeService.findAll();
//        model.addAttribute("customerTypes", customerTypes);
//        return "customer/list";
//    }
//
//
////    @GetMapping("/create-customer")
////    public String showFormCreate(Model model, @PageableDefault(size = 3) Pageable pageable) {
////        Iterable<CustomerType> customerTypes = customerTypeService.findAll();
////        model.addAttribute("customer", new Customer());
////        model.addAttribute("customerTypes", customerTypes);
////        return "/customer/create";
////    }
//
//    @PostMapping("/create-customer")
//    public String createCustomer(@Validated @ModelAttribute("customer") Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model, Pageable pageable) {
//        if (bindingResult.hasErrors()) {
//            Iterable<CustomerType> customerTypes = customerTypeService.findAll();
//            model.addAttribute("customerTypes", customerTypes);
//            model.addAttribute("customers", this.customerService.findAll(pageable));
//            model.addAttribute("check", false);
//            return "/customer/list";
//        } else {
////            employee.getUser().setPassword(new BCryptPasswordEncoder().encode("12345"));
////            customer.getUser().setEnabled(true);
//            customerService.save(customer);
//            redirectAttributes.addFlashAttribute("message", "Add new customer " + customer.getCustomerName() + " success");
//            return "redirect:/customer/list";
//        }
//    }
//
//
//    @GetMapping("/edit/{id}")
//    public String showFormEdit(@PathVariable String id, Model model) {
//        Customer customer = customerService.findById(id);
//        Iterable<CustomerType> customerTypes = customerTypeService.findAll();
//        model.addAttribute("customer", customer);
//        model.addAttribute("customerTypes", customerTypes);
//        return "/customer/edit";
//    }
//
//    @PostMapping("/edit")
//    public String editCustomer(@Validated @ModelAttribute Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
//        if (bindingResult.hasErrors()) {
//            Iterable<CustomerType> customerTypes = customerTypeService.findAll();
//            model.addAttribute("customer", customer);
//            model.addAttribute("customerTypes", customerTypes);
//            return "/customer/edit";
//        } else {
//            customerService.save(customer);
//            redirectAttributes.addFlashAttribute("message", "Đã edit " + customer.getCustomerName() + " thành công!");
//            return "redirect:/customer/list";
//        }
//    }
//
//
//    @GetMapping("/view/{id}")
//    public String viewCustomer(@PathVariable String id, Model model) {
//        Customer customer = customerService.findById(id);
//        model.addAttribute("customer", customer);
//        return "/customer/view";
//    }
//
//    @GetMapping("/delete-customer/{id}")
//    public String showDelete(@PathVariable String id) {
//        customerService.remove(id);
//        return "redirect:/customer/list";
//    }
//
//    @GetMapping("/search-customer")
//    public ModelAndView searchByText(@RequestParam String inputSearch, @PageableDefault(value = 5) Pageable pageable) {
//        return new ModelAndView("customer/list", "customers", customerService.findByInputText(inputSearch, pageable));
//    }
//
//}
