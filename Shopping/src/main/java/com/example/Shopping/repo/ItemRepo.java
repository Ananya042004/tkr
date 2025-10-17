package com.example.Shopping.repo;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Shopping.model.Item;

//Marker interface
public interface ItemRepo extends JpaRepository<Item,Long>{

}
