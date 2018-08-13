package com.yash.lbm.impl;

import java.util.ArrayList;
import java.util.List;

import com.yash.lbm.interfaces.ICategorize;
import com.yash.lbm.model.BookDetails;

public class Novel extends BookDetails implements ICategorize {

	@Override
	public void getBookByCategory() {
		List<BookDetails> list=new ArrayList<BookDetails>();
		list.add(new BookDetails(10,"Wings of Fire",25));
		list.add(new BookDetails(22,"Who will Cry, when you Die",19));
		list.add(new BookDetails(11,"Million Dollar Begger",29));
		
		list.stream().map(x->x).forEach(System.out::println);
		
	}
	
	

}
