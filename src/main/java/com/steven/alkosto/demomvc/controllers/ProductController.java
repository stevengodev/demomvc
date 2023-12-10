package com.steven.alkosto.demomvc.controllers;

import com.steven.alkosto.demomvc.models.Categorie;
import com.steven.alkosto.demomvc.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/productos")
public class ProductController {

    @GetMapping("/ver")
    public String verProductos(Model model){

        Product product1 = new Product();
        Categorie categorie1 = new Categorie();

        categorie1.setId(1);
        categorie1.setNombre("Carnes rojas");

        product1.setId(171212);
        product1.setNombre("Carne de Cerdo");
        product1.setPrecio(9000.50);
        product1.setStock(31);
        product1.setCategorie(categorie1);

        Product product2 = new Product();
        Categorie categorie2 = new Categorie();

        categorie2.setId(2);
        categorie2.setNombre("Lacteos");

        product2.setId(162176);
        product2.setNombre("Yogurt");
        product2.setPrecio(4000.99);
        product2.setStock(20);
        product2.setCategorie(categorie2);

        List<Product> productos = new ArrayList<>();
        productos.add(product1);
        productos.add(product2);
        model.addAttribute("productos", productos);
        return "products/index";
    }

    @GetMapping("/consultar")
    public String consultar(@RequestParam int id, Model model){
        Categorie categoria = new Categorie();
        categoria.setId(5);
        categoria.setNombre("Higiene y salud");

        Product producto = new Product();
        producto.setId(id);
        producto.setNombre("Cepillo de dientes");
        producto.setStock(3);
        producto.setPrecio(1600000.50);
        producto.setCategorie(categoria);

        model.addAttribute("producto", producto);
        return "products/consultar";
    }


}
