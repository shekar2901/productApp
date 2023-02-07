package com.ojas.productserviceimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.exception.IdNotFoundException;
import com.ojas.exception.ResourceNotFoundException;
import com.ojas.productentity.ProductEntity;
import com.ojas.productrepository.ProductRepository;
import com.ojas.productservice.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
@Autowired
	private ProductRepository productRepository;

	@Override
	public List<ProductEntity> getAllProduct() {

		return productRepository.findAll();
	}


	@Override
	public ProductEntity saveProduct(ProductEntity p) {


		return productRepository.save(p);
	}


	@Override
	public Optional<ProductEntity> getById( int id) {
		
		ProductEntity getId=productRepository.findById(id).orElseThrow(()->new IdNotFoundException("Id Not available....Please try again with Valid Id ....Thanking You"));

		return productRepository.findById(id);
	}



	public ProductEntity updatedById(int id,ProductEntity p) {
		
		ProductEntity update=productRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("user is not available"));
		update.setProductName(p.getProductName());
		update.setProductPrice(p.getProductPrice());
		update.setProductQuantity(p.getProductQuantity());
		update.setUpdatedDate(p.getCreatedDate());
		
		ProductEntity update2=productRepository.save(update);		
		return productRepository.save(update2);
	}


	
	@Override
	public void delete(int id) {
		productRepository.deleteById(id);
	}


	@Override
	public ProductEntity updatedById(ProductEntity p) {
		// TODO Auto-generated method stub
		return null;
	}

}
