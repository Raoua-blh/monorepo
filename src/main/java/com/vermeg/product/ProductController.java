package com.vermeg.product;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    ProductService productService ;
    ProductRepo pr ;


    @PostMapping("/add")
    public Product add(@RequestBody Product pr){
        return productService.addproduit(pr);
    }
    @GetMapping("/getAll")
    public List<Product> GetAll(){
        return productService.retrieveallproduit();

    }
}
