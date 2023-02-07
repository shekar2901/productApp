package com.ojas.controller;

import java.util.List;
import java.util.Optional;

import com.ojas.productentity.ProductEntity;
import com.ojas.productserviceimpl.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private ProductServiceImpl productServiceImpl;

	@GetMapping("/getAllProducts")
	public List<ProductEntity> getAllProducts(){
		List<ProductEntity> allProduct = productServiceImpl.getAllProduct();
		return allProduct;

	}

	@GetMapping("/getdata")
	public String getAllProduc(){
	return "hello";
	}

	@PostMapping("/saveProduct")
	public ProductEntity saveProduct(@RequestBody ProductEntity p) {
		ProductEntity saveProduct = productServiceImpl.saveProduct(p);
		return saveProduct;
	}

	@GetMapping("/getById/{id}")
	public Optional<ProductEntity> getByProductId(@PathVariable int id) {
		Optional<ProductEntity> byId = productServiceImpl.getById(id);
		return byId;
	}

	@PutMapping("/updated/{id}")
	public ProductEntity updatedProduct(@PathVariable int id,@RequestBody ProductEntity p) {
		ProductEntity updatedById = productServiceImpl.updatedById(id,p);
				
		return updatedById;
	}

	@DeleteMapping("/delete")
	public void deletedProduct(int id) {
		productServiceImpl.delete(id);
	}


}
