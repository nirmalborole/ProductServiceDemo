package com.example.apidemo.Services;

import com.example.apidemo.models.Category;
import com.example.apidemo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceIMPL implements CategoryService{
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceIMPL(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category createCategory(String name) {
        Category category = new Category();
        category.setName(name);
        Category save = categoryRepository.save(category);
        return save;
    }
}
