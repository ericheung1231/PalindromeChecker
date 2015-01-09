import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PalindromeChecker extends PApplet {

public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      println(lines[i] + " IS a palidrome.");
    }
    else
    {
      println(lines[i] + " is NOT a palidrome.");
    }
  }
}
public boolean palindrome(String word)
{
String noCaps = new String(word.toLowerCase());
//println(noCaps);
String noSpace = new String();
String reversed = new String();
  for(int i= 0; i<noCaps.length(); i++)
  {
    if (Character.isLetter(noCaps.charAt(i))== true)
    {
      noSpace += noCaps.charAt(i);
    }   
  }
  //println(noSpace);
  for(int i= noSpace.length()-1; i>-1; i--)
  {
      reversed += noSpace.substring(i,i+1);  
  }
  //println(reversed);
  if (reversed.equals(noSpace))
    {
      return true;
    }
  else
  {
    return false;
  }
  
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PalindromeChecker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
