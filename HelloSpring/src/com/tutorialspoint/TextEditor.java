package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class TextEditor {
   
	private SpellChecker spellChecker;
//	public TextEditor(){
//		
//	}
//	public TextEditor(SpellChecker spellChecker){
//		System.out.println(spellChecker.count);
//	}
   
   public void setSpellChecker( SpellChecker spellChecker ){
      this.spellChecker = spellChecker;
   }
   public SpellChecker getSpellChecker( ) {
      return spellChecker;
   }
   public void spellCheck() {
	   spellChecker.plus();
      spellChecker.checkSpelling();
   }
}