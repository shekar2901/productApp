package com.ojas.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.productentity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {

}
