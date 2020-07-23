package com.capg.demos;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionLab2 {
	
	public static Map countCharacter(char[] a){
		
		Map m=new HashMap<Character,Integer>();
		for(char c:a) {
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]==c) {
					count++;
				}
			}
			m.put(c, count);
		}
		return m;
	}

	public static void main(String[] args) {
	
		char c[]={'a','b','a','c','d','c','l','a','b'};
		System.out.println(countCharacter(c));
	}

}
