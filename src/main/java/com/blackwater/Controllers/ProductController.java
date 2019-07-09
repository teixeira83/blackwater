package com.blackwater.Controllers;

import com.blackwater.Models.Product;
import com.blackwater.Repositorys.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/products")
public class ProductController {

    @Autowired
    private ProductRepository pr;

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> showProducts() {
        List<Product> products = pr.findAll();
        return products;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product p){
        return pr.save(p);
    }
}
