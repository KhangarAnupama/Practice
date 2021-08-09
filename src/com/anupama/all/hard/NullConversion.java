package com.anupama.all.hard;
class NullConversion
{
    int methodOfA()
    {
        return (true ? null : 0);
    }
    
    public static void main(String[] args) {
		NullConversion flag = new NullConversion();
		flag.methodOfA();
	}
}