package com.example.apidemo.Services;

import com.example.apidemo.Configs.RedisTemplateConfig;
import com.example.apidemo.dtos.FakeProductServiceDto;
import com.example.apidemo.models.Category;
import com.example.apidemo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service("fakeStore")
public class FakeStoreProductSrrviceImpl implements ProductService{
    private RestTemplate restTemplate;
    private RedisTemplate<String,Object> redisTemplate;
    @Autowired
    public FakeStoreProductSrrviceImpl(RestTemplate restTemplate, RedisTemplate<String, Object> redisTemplate) {
        this.restTemplate = restTemplate;
        this.redisTemplate = redisTemplate;
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
//        product.setCategory(category);
        return product;
    }
    @Override
    public Product getProductById(long id) {
        Product products =(Product) this.redisTemplate.opsForHash().get("PRODUCTS", "products" + id);
        if(products!=null){
            return products;
        }
        FakeProductServiceDto fakeproduct = this.restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeProductServiceDto.class);
        Product p= convertDtoToProduct(fakeproduct);
        this.redisTemplate.opsForHash().put("PRODUCTS", "products" + id, p);
        return p;
    }

    @Override
    public Page<Product> getAllProducts(int pageSize, int pageNumber) {
        return null;
    }

    @Override
    public Product createProduct(String title, double price, String description, String image, String categoryName) {
        return null;
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
