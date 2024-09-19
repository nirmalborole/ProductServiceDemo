package com.example.apidemo.Controller;

import com.example.apidemo.Services.ProductService;
import com.example.apidemo.component.AuthUtils;
import com.example.apidemo.dtos.CreateProductRequestDto;
import com.example.apidemo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;
    private AuthUtils authUtils;

    @Autowired
    public ProductController(@Qualifier("fakeStore") ProductService productService,AuthUtils authUtils) {
        this.productService = productService;
        this.authUtils = authUtils;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") long id){
        return productService.getProductById(id);
    }

    public List<Product> getProducts(){
        return new ArrayList<Product>();
    }


    @PostMapping("/")
    public ResponseEntity<Product> createProduct(@RequestBody CreateProductRequestDto requestDto, @RequestHeader("Auth") String tokenValue){
//        if(!authUtils.validateToken(tokenValue)){
//            return new ResponseEntity<>(null,HttpStatus.UNAUTHORIZED);
//        }
        Product product= productService.createProduct(requestDto.getTitle(), requestDto.getPrice(), requestDto.getDescription(), requestDto.getImage(), requestDto.getCategoryName());
        return new ResponseEntity<>(product, HttpStatus.CREATED);

    }

    @GetMapping("/")
    public ResponseEntity<Page<Product>> getAllProducts(@RequestParam(value = "pageSize",defaultValue = "20") int pageSize,@RequestParam(value = "pageNumber",defaultValue = "1") int pageNumber){
        Page<Product> products = productService.getAllProducts(pageSize,pageNumber);
        return new ResponseEntity<>(products,HttpStatus.OK);
    }
}
