package com.example.Shopping.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shopping.model.Item;
import com.example.Shopping.services.ItemSerrvices;

@RestController
public class ItemController {
	@Autowired
	ItemSerrvices is;
	
	@PostMapping("/additem")
	public Item addItem(@RequestBody Item it)
	{
		return is.addItem(it);
	}
	@GetMapping("/retrivaldata")
	public List<Item> getItem()
	{
		return is.getit();
	}
	// Update product by ID
    @PutMapping("/update/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item ItemDetails) {
        return is.updateItem(ItemDetails);
    }

	@DeleteMapping("/deletingrecord/{id}")
	public String deleteItem(@PathVariable Long id)
	{
		is.delit(id);
		return "item deleted successfully with ID:"+id;
	}

}
