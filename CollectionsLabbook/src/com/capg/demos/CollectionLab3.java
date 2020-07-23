package com.capg.demos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionLab3 {
	
	public static Map getSquares(List<Integer> n) {
		Map m=new HashMap<Integer,Integer>();
		for(Integer i:n) {
			m.put(i, i*i);
		}
		return m;	
	}

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(5,4,3,2,1,9);
		System.out.println(getSquares(l));

	}

}
