package com.example.demo.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
//To define the below ItemService class as Service provider to the Controller class.
@Service
public class ItemService{
	
//creating object for JdbcTemplate using @Autowired annotation.
@Autowired JdbcTemplate jt;

//adding loggers on ItemService class to keep a track on every action in the class.
public static Logger log=LoggerFactory.getLogger(ItemService.class); 

//addItem() method which provides service to the addItem() method in Controller class.
//To Insert new Item details into Item Table
public int addItem(Item it)
{
	String sql="insert into item values(?,?)"; //query to insert the item details 
	int item_id=it.getItem_id();
   	String item_name=it.getItem_name();
    return jt.update(sql,item_id,item_name);  //executing the query using update() method in JdbcTemplate
}
//getItem() method which provides service to the getItem() method in Controller class
//To get the list of all the items present in item table
public List getItem()
{
	Map<String,Object> map=null;  
	List list=new ArrayList();
	List<Map<String,Object>> obj=new ArrayList<Map<String,Object>>();
	String sql="select * from item";
	obj=jt.queryForList(sql);
	for(Map<String,Object> r1:obj)
	{
		map=new HashMap<String,Object>();
		map.put("item_id",r1.get("item_id"));
		map.put("item_name",r1.get("item_name"));
		list.add(map);
	}
	return list;
}
public int updatation(Item it)
{
	String sql="update item set item_name=? where item_id=?";
	
	 String item_name=it.getItem_name();
	 int item_id=it.getItem_id();
    return jt.update(sql,item_name,item_id);
}
}
