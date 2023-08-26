package com.example.myproject.services;

import com.example.myproject.model.Category;
import com.example.myproject.model.Company;
import com.example.myproject.repository.CategoryRepository;
import com.example.myproject.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public Category save(Category category){
        return categoryRepository.save(category);
    }

    public void deleteById(int id){
        categoryRepository.deleteById(id);

    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category getById(int id) {
        return categoryRepository.getById(id);
    }
}
