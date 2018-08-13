package com.yash.lbm.launcher;

import java.util.Optional;
import java.util.Scanner;


import com.yash.lbm.interfaces.ICategorize;
import com.yash.lbm.utilities.GetCategoryFactory;

public class Library {

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
		
	    System.out.println("Enter Book Category:");
	    ICategorize category=GetCategoryFactory.getBookType(sc.next());
	    Optional<ICategorize> o = Optional.ofNullable(category);
	    if(o.isPresent()){
	    	category.getBookByCategory();
	    }
	    else
	    	System.out.println("Book not available");  
		
		

	}

}
