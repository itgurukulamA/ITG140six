package com.example.demo.Item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController -To define a class as a Controller and start the creation of the API's
@RestController

public class ItemController {
	
//Creating the object for the ItemService class to call the methods which are present in ItemService
@Autowired ItemService iservice;

@PostMapping("addItem")
public String addItem(@RequestBody Item it)
{
	int i=iservice.addItem(it);
	if(i>0)
		return "item added successfully";
	else
		return "item not added! try again";
}
@GetMapping("/getItem")
public List getItem()
{
	System.out.println("list of all items:"+System.lineSeparator());
    return iservice.getItem();
}
@PostMapping("update")
public String updateItem(@RequestBody Item it)
{
	int i=iservice.updatation(it);
	if(i>0)
		return "item updated succesfully";
	else
		return "item not updated! try again";
}
}
