package com.naga.service;

import java.util.List;

import com.naga.entity.Category;

public interface CategoryService {
	
	public Boolean saveCategory(Category category);
	public List<Category> getAllCategory();

}
