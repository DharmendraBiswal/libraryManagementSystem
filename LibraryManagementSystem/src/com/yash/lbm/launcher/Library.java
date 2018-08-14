package com.yash.lbm.launcher;

import java.util.Optional;
import java.util.Scanner;


import com.yash.lbm.interfaces.ICategorize;
import com.yash.lbm.utilities.GetCategoryFactory;

public class Library {

	public static void main(String[] args) {
		
	    
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("Enter Book Category:");
	    ICategorize bookCategory=GetCategoryFactory.getBookType(sc.next());
	    Optional<ICategorize> checkCategoryOptional = Optional.ofNullable(bookCategory);
	    if(checkCategoryOptional.isPresent())
	    {
	    	bookCategory.getBookByCategory();
	    }
	    else
	    	System.out.println("Book Category is not available");  		
		

	}

}
