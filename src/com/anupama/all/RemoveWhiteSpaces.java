package com.anupama.all;
class RemoveWhiteSpaces
{
    public static void main(String[] args)
    {
        String str1 = "Remove white    spaces ";
  
        //1. Using replaceAll() Method
  
        String str2 = str1.replaceAll("\\s", "");
  
        System.out.println(str2);
  
     }
}
