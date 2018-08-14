package com.yash.lbm.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.yash.lbm.impl.Novel;
import com.yash.lbm.impl.TextBook;
import com.yash.lbm.interfaces.ICategorize;


public class GetCategoryFactory {
	
	public static ICategorize getBookType(String bookCategory){
		List<String> bookCategorylist=new ArrayList<String>();
		bookCategorylist.add("TextBook");
		bookCategorylist.add("Novel");
		
		Optional<String> optional=Optional.ofNullable(bookCategory);
		if(optional.isPresent()){
			if(bookCategory.equalsIgnoreCase("TextBook"))
			{
			 return new TextBook();
			}
			else if(bookCategory.equalsIgnoreCase("Novel"))
			{
			 return new Novel();
			}
		}
		return null;
		
	}

}
