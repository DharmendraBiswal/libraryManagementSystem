package com.yash.lbm.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.yash.lbm.impl.Novel;
import com.yash.lbm.impl.TextBook;
import com.yash.lbm.interfaces.ICategorize;


public class GetCategoryFactory {
	
	public static ICategorize getBookType(String category){
		List<String> list=new ArrayList<String>();
		list.add("TextBook");
		list.add("Novel");
		
		Optional<String> optional=Optional.ofNullable(category);
		if(optional.isPresent()){
		if(category.equals("TextBook")){
			return new TextBook();
		}
		else if(category.equals("Novel")){
			return new Novel();
		}
		else {
			return null;
		}}
		return null;
		
	}

}
