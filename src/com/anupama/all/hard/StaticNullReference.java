package com.anupama.all.hard;
class StaticReference
{
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
}
 
public class StaticNullReference
{
    public static void main(String[] args)
    {
    	StaticReference a = null;
 
        a.staticMethod();
    }
}