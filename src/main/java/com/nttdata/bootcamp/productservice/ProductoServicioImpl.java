package com.nttdata.bootcamp.productservice;

import org.springframework.beans.factory.annotation.Value;

import com.nttdata.bootcamp.dto.Producto;

public class ProductoServicioImpl implements ProductoServicioI{

	@Value("${server.port}")
	private String port;
	
	@Value("${server.product-name}")
	private String productName;
	
	
	@Override
	public Producto getProducto(Integer id) {
		Producto producto = new Producto();
		producto.setProductId(id);
		producto.setChannel("GET");
		return producto;
	}

	@Override
	public Producto postProducto(Integer id) {
		Producto producto = new Producto();
		producto.setProductId(id);
		producto.setChannel("POST");
		return producto;
	}

}
