package com.example.apidemo.Services;

import com.example.apidemo.models.Category;
import com.example.apidemo.models.Product;
import com.example.apidemo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("selfProduct")
public class SelfProductService implements ProductService{
    private ProductRepository productRepository;
    private CategoryService categoryService;

    @Autowired
    public SelfProductService(ProductRepository productRepository, CategoryService categoryService) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
    }

    @Override
    public Product getProductById(long id) {
        return null;
    }

    @Override
    public Page<Product> getAllProducts(int pageSize, int pageNumber) {

        return productRepository.findAll(PageRequest.of(pageNumber,pageSize,
                Sort.by("price").ascending().and(Sort.by("title").descending())));
    }

    @Override
    public Product createProduct(String title, double price, String description, String image, String categoryName) {
        Category category = categoryService.createCategory(categoryName);
        Product product=new Product();
        product.setCategory(category);
        product.setDescription(description);
        product.setTitle(title);
        product.setPrice(price);
        product.setImage(image);
        Product save = productRepository.save(product);
        return save;
    }

    @Override
    public Product updatePrice(long productId, double updatePrice) {
        return null;
    }

    @Override
    public Product updateImage(long productId, String updatedImage) {
        return null;
    }

    @Override
    public boolean deleteProduct() {
        return false;
    }
}
