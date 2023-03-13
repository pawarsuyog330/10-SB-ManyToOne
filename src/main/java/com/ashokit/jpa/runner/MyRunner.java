package com.ashokit.jpa.runner;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ashokit.jpa.entities.ProductEntity;
import com.ashokit.jpa.entities.VendorEntity;
import com.ashokit.jpa.repository.ProductEntityRepository;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	ProductEntityRepository productRepo;

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		/*
		VendorEntity entity = new VendorEntity(); entity.setVendorId(1002);
		  entity.setVendorName("Samsung");
		  
		  ProductEntity pEntity1 = new ProductEntity(); pEntity1.setProductId(2002);
		  pEntity1.setProductName("Fridge");
		  
		  ProductEntity pEntity2 = new ProductEntity(); pEntity2.setProductId(3002);
		  pEntity2.setProductName("TV");
		  
		  ProductEntity pEntity3 = new ProductEntity(); pEntity3.setProductId(4002);
		  pEntity3.setProductName("AC");
		  
		  pEntity1.setVendorEntity(entity);
		  pEntity2.setVendorEntity(entity);
		  pEntity3.setVendorEntity(entity);
		  
		  productRepo.save(pEntity1);
		  productRepo.save(pEntity2);
		  productRepo.save(pEntity3);
	
	
		
		Optional<ProductEntity> opt=productRepo.findById(2002);
		if(opt.isPresent())
		{
			ProductEntity pE=opt.get();
			System.out.println(pE.getProductId()+" : "+pE.getProductName());
		}
		*/
		
		productRepo.deleteById(3002);
	}
}
