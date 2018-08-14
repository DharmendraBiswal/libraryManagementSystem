package com.yash.lbm.impl;

import java.util.ArrayList;
import java.util.List;

import com.yash.lbm.interfaces.ICategorize;
import com.yash.lbm.model.BookDetails;

public class TextBook extends BookDetails implements ICategorize{

	@Override
	public void getBookByCategory() {
		List<BookDetails> textBookList=new ArrayList<BookDetails>();
		textBookList.add(new BookDetails(1,"Physics",25));
		textBookList.add(new BookDetails(2,"Chemistry",10));
		textBookList.add(new BookDetails(10,"Mathmetics",22));
		
		System.out.println("BookID  "+"BookName  "+"Available");
		System.out.println("===================================");		
		textBookList.stream().map(x->x).forEach(System.out::println);
		
	}
	

}
