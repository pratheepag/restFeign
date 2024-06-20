package com.example.restFeign.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restFeign.model.Product;

@RestController
public class RestServiceResource {
	@GetMapping("/products")
	public List<Product> index() {
		return List.of(new Product(10, "P1"), new Product(20, "P2"));
	}
}
