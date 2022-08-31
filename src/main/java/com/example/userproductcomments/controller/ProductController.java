package com.example.userproductcomments.controller;

import com.example.userproductcomments.dto.request.ProductRequest;
import com.example.userproductcomments.dto.response.ProductResponse;
import com.example.userproductcomments.service.Impl.ProductServiceImpl;
import com.example.userproductcomments.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @PostMapping("/addProduct")
    public ProductResponse addUser(@RequestBody ProductRequest productRequest){
        return productService.save(productRequest);
    }

    @GetMapping("/getNotExpiredProduct")
    public List<ProductResponse> getNotExpiredProduct(){
        return productService.getNotExpiredProduct();
    }

    @GetMapping("/getExpiredProduct")
    public List<ProductResponse> getExpiredProduct(){
        return productService.getExpiredProduct();
    }
}
