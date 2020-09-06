package org.t;

import java.util.Arrays;

public class Sample {
	public static void main(String[] args) {
		int i=10;
		 i=20;
		String s="maathanghi";
		String ss="maathu 2";
		System.out.println(s);
		String s1="silent";
		String s2="listen";
		
		if(s1.length()==s2.length()){
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2)) {
				System.out.println("it is anagram");
			}
			else {
				System.out.println("not anagram");
			}
		}
		
		
	}

}


