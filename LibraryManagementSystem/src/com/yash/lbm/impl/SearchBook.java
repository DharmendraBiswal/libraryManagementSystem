package com.yash.lbm.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.yash.lbm.interfaces.IBook;
import com.yash.lbm.model.BookDetails;

public class SearchBook implements IBook{
	

	@Override
	public void searchBook(int bookID) {
		List<BookDetails> list=new ArrayList<BookDetails>();
		list.add(new BookDetails(1,"Physics",25));
		list.add(new BookDetails(2,"Chemistry",10));
		list.add(new BookDetails(10,"Mathmetics",22));
		
		
		ArrayList<BookDetails> bookStatus=(ArrayList<BookDetails>) list.stream().filter(x-> true==x.equals(bookID)).collect(Collectors.toList());
		if(bookStatus.isEmpty()){
			System.out.println("Searched Book is not available");
		}
		else{
			bookStatus.stream().forEach(x->System.out.println(x));
		}
		
	}

	public void searchBookByCategory(String category){
		if(category.equals("TextBook")){
			List<BookDetails> list=new ArrayList<BookDetails>();
			list.add(new BookDetails(1,"Physics",25));
			list.add(new BookDetails(2,"Chemistry",10));
			list.add(new BookDetails(10,"Mathmetics",22));
			
			list.stream().map(x->x).forEach(System.out::println);
		}
		
		
	}
	
	
	

}
