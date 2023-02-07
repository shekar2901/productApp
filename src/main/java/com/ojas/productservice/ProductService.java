package com.ojas.productservice;

import java.util.List;
import java.util.Optional;

import com.ojas.productentity.ProductEntity;

public interface ProductService {

	public List<ProductEntity> getAllProduct();
	public ProductEntity saveProduct(ProductEntity p);
	public Optional<ProductEntity> getById(int id);
	public ProductEntity updatedById(ProductEntity p);
	public void delete(int id);


}
