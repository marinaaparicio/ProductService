package com.nttdata.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nttdata.bootcamp.dto.Producto;
import com.nttdata.bootcamp.productservice.ProductoServicioI;


@Controller
public class ProductoController {
	
	private ProductoServicioI productoServicio;
	
	public ProductoController(ProductoServicioI productoServicio) {
		
		this.productoServicio = productoServicio;
		
	}
	
	@GetMapping("{id}")
	public Producto getProducto(@PathVariable Integer id) {
		
		return productoServicio.getProducto(id);
	}
	
	@PostMapping("{id}")
	private Producto postProducto(@PathVariable Integer id) {
		
		return productoServicio.postProducto(id);
	}
	

	
	

}
