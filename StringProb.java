package mandi;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringProb {
	@Test
	  public void positiveRemoveCharacterByIteratingString() {
		  String newString = removeCharacterByIteratingString("How are you", 'o');
		  Assert.assertEquals(newString,"Hw are yu");
	  }

	  @Test
	  public void positiveRemoveCharacterByStringMethod() {
	    //throw new RuntimeException("Test not implemented");
		  String newString = removeCharacterByStringMethod("How are you", 'o');
		  Assert.assertEquals(newString,"Hw are yu");
	  }
	  @Test
	  public void negativeRemoveCharacterByIteratingString() {
		  String newString = removeCharacterByIteratingString("How are you", 'l');
		  Assert.assertEquals(newString,"How are you");
	  }

	  @Test
	  public void negativeRemoveCharacterByStringMethod() {
	    //throw new RuntimeException("Test not implemented");
		  String newString = removeCharacterByStringMethod("How are you", 'l');
		  Assert.assertEquals(newString,"How are you");
	  }
	  
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String oldString=sc.nextLine();
		System.out.println("enter the character to be removed");
		char ch = sc.next().charAt(0);
		StringProb.removeCharacterByIteratingString(oldString, ch);
		StringProb.removeCharacterByStringMethod(oldString, ch);
	}
	public static String removeCharacterByIteratingString(String s,char ch)
	{
		StringBuilder sb = new StringBuilder();
		char[] charArray = s.toCharArray();
		for(int i=0; i<charArray.length; i++)
		{
			if(charArray[i] == ch){

            } else {
                sb.append(charArray[i]);
            }
		}
		return sb.toString();		
	}
	public static String removeCharacterByStringMethod(String s,char ch)
	{
		String newString = s.replaceAll(Character.toString(ch), "");
		return newString;
	}

}
