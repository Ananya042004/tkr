package com.example.Shopping.services;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Shopping.model.Item;
import com.example.Shopping.repo.ItemRepo;

@Service
public class ItemSerrvices {
	
	
	@Autowired
	ItemRepo ir;
	
	//insert
	public Item addItem(Item it)
	{
		return ir.save(it);
	}
	//select
		public List<Item> getit()
		{
			return ir.findAll();
		}
	//update
		public Item updateItem (Item ItemDetails) {
	        // Assuming your Item entity has a long id
	        Long id=ItemDetails.getId();
	        Item it1=ir.findById(id).orElse(null);
	        it1.setName(ItemDetails.getName());
	        it1.setCategory(ItemDetails.getCategory());
	        it1.setPrice(ItemDetails.getPrice());
	        it1.setManufacturing(ItemDetails.getManufacturing());
	        it1.setExpiry(ItemDetails.getExpiry());

	        return ir.save(it1);
	    }
	//delete
		public void delit(Long id)
		{
			ir.deleteById(id);
		}
	
	
	
	

}
