package com.nttdata.bootcamp.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

import com.nttdata.bootcamp.dto.Producto;

public class ProductoServicioImpl implements ProductoServicioI{

	
	@Autowired
	Environment environment;
	
	@Value("${server.port}")
	private String port;
	
	@Value("${server.product-name}")
	private String productName;
	
	Producto producto = new Producto();
	
	@Override
	public Producto getProducto(Integer id) {
		producto.setProductId(id);
		producto.setChannel("GET");
		producto.setPort(environment.getProperty("local.server.port"));
		return producto;
	}

	@Override
	public Producto postProducto(Integer id) {
		producto.setProductId(id);
		producto.setChannel("POST");
		producto.setPort(environment.getProperty("local.server.port"));
		return producto;
	}

}
