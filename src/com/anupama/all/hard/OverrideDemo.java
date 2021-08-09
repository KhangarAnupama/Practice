package com.anupama.all.hard;
class OverrideDemo
{
    void method(int i)
    {
        //method(int)
    }
}
 
class B extends OverrideDemo
{
    @Override
    void method(Integer i)
    {
        //method(Integer)
    }
}