package com.anupama.all.hard;
class A3
{
    static int i = 1111;
 
    static
    {
        i = i-- - --i;
    }
 
    {
        i = i++ + ++i;
    }
}
 
class B3 extends A3
{
    static
    {
        i = --i - i--;
    }
 
    {
        i = ++i + i++;
    }
}
 
public class IncrementDecrement
{
    public static void main(String[] args)
    {
        B3 b = new B3();
 
        System.out.println(b.i);
    }
}