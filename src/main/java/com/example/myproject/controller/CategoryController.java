package com.example.myproject.controller;

import com.example.myproject.model.Category;
import com.example.myproject.repository.CategoryRepository;
import com.example.myproject.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/categories")
    public String companiesPage(ModelMap map) {
        //List<Company> companis = companyService.findAll();
        map.addAttribute("categories", categoryService.findAll());
        return "categories";
    }



    @GetMapping("/deleteCategories/{id}")
    public String delete(@PathVariable("id") int id) {
        categoryService.deleteById(id);
        return "redirect:/categories";

    }

    @GetMapping("/addCategories")
    public String addCompaniesPage() {
        return "saveCategories";
    }


    @PostMapping("/addCategories")
    public String addCompanies(@ModelAttribute Category category){
        categoryService.save(category);
        return "redirect:/categories";
    }
}
