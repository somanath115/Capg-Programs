package com.capg.demos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class CollectionLab{
	public static List<Integer> getValues(HashMap<Integer,Integer> m){
		List<Integer> l=new ArrayList<>();
		for(Integer p:m.values()) {
			l.add(p);
		}
		Collections.sort(l);
		return l;
	} 
	
	public static void main(String[] args){
		HashMap<Integer,Integer> num=new HashMap<Integer,Integer>();
			num.put(1,45);
			num.put(2,67);
			num.put(3,90);
			num.put(4,34);
		
		System.out.println(getValues(num));

	}	
}
