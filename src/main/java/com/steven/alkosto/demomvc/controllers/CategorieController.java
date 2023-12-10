package com.steven.alkosto.demomvc.controllers;

import com.steven.alkosto.demomvc.models.Categorie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/categorias")
public class CategorieController {

    @Value("${id.categoriacontroller.categoria}")
    private int id;

    @Value("${nombre.categoriacontroller.categoria}")
    private String nombre;
    @GetMapping("/mostrar")
    public String verCategorias(Model model){

        Categorie categorie1 = new Categorie();
        categorie1.setId(id);
        categorie1.setNombre(nombre);

        Categorie categorie2 = new Categorie();
        categorie2.setId(2);
        categorie2.setNombre("Carnes rojas");

        Categorie categorie3 = new Categorie();
        categorie3.setId(3);
        categorie3.setNombre("Lacteos");

        List<Categorie> categorias = new ArrayList<>();
        categorias.add(categorie1);
        categorias.add(categorie2);
        categorias.add(categorie3);
        model.addAttribute("categorias", categorias);
        return "categories/index";
    }

    @GetMapping("/consultar/{id}")
    public String consultarCategoria(@PathVariable Integer id, Model model){
        Categorie categoria = new Categorie();
        categoria.setId(id);
        categoria.setNombre("Calzado");
        model.addAttribute("categoria", categoria);
        return "categories/consultar";
    }

}
