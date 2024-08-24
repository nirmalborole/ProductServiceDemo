package com.example.apidemo.Services;

import com.example.apidemo.dtos.FakeProductServiceDto;
import com.example.apidemo.models.Category;
import com.example.apidemo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class FakeStoreProductSrrviceImpl implements ProductService{
    private RestTemplate restTemplate;

    @Autowired
    public FakeStoreProductSrrviceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Product convertDtoToProduct(FakeProductServiceDto dto){
        Product product = new Product();
        product.setId(dto.getId());
        product.setDescription(dto.getDescription());
        product.setTitle(dto.getTitle());
        product.setImage(dto.getImage());
        product.setPrice(dto.getPrice());
        Category category=new Category();
        category.setName(dto.getCategory());
        product.setCategory(category);
        return product;
    }
    @Override
    public Product getProductById(long id) {

        FakeProductServiceDto product = this.restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeProductServiceDto.class);
        return convertDtoToProduct(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
