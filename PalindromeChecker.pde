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

