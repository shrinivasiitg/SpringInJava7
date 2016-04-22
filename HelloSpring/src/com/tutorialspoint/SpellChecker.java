package com.tutorialspoint;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class SpellChecker {
   
	public int count;
	
	public SpellChecker(){
      System.out.println("Inside SpellChecker constructor." );
      count = 0;
   }
	public void plus(){
		count++;
	}

   public void checkSpelling(){
      System.out.println("Inside checkSpelling." );
      System.out.println(count);
   }
   
}