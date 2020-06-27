package net.kzn.shoppingbackend.daoimlp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO {


	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		
		category.setId(1);
		category.setName("television");
		category.setDescription("descripcion random");
		category.setImageURL("CAT_1.png");
		
		
		categories.add(category);
		
		
category = new Category();
		
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("descripcion random2");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
category = new Category();
		
		category.setId(3);
		category.setName("Notebooks");
		category.setDescription("descripcion random3");
		category.setImageURL("CAT_3.png");
		
		
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category: categories) {
		if(category.getId()== id) return category;	
		}
		return null;
	}


	}
	
	
