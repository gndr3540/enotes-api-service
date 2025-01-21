package com.naga.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.naga.entity.Category;
import com.naga.repository.CategoryRepository;
import com.naga.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Boolean saveCategory(Category category) {
		category.setIsDeleted(false);
		category.setCreatedBy(1);
		category.setCreatedOn(new Date());
		category.setUpdatedBy(1);
		category.setUpdatedOn(new Date());
		Category saveCategory = categoryRepository.save(category);
		if(ObjectUtils.isEmpty(saveCategory)) {
			return false;
		}
		return true;
	}

	@Override
	public List<Category> getAllCategory() {
		List<Category> categories = categoryRepository.findAll();
		return categories;
	}

}
