package com.vermeg.product;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProductService implements Iproduct{

    ProductRepo produitRepository ;

    @Override
    public Product addproduit(Product pr) {
        return produitRepository.save(pr);
    }

    @Override
    public List<Product> retrieveallproduit() {
        return produitRepository.findAll();
    }
}
