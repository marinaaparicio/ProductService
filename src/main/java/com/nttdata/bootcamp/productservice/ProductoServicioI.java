package com.nttdata.bootcamp.productservice;

import com.nttdata.bootcamp.dto.Producto;

public interface ProductoServicioI {
	
	Producto getProducto(Integer id);
	
	Producto postProducto(Integer id);

}
