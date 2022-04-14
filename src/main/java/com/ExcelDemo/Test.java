package com.ExcelDemo;

public class Test {

	public static void main(String[] args) {
		System.out.println("hello");
            String s="sahitya";
            
            String s1="";
            
            for(int i=s.length()-1;i>=0;i--)
            {
            	s1+=s.charAt(i);
            }
            System.out.println(s1);
	}

}
