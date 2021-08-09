package com.anupama.all;
import java.io.IOException;
class Testthrows1{
	
	
  void m()throws IOException{
    throw new IOException("device error");//checked exception
  }
  void n()throws IOException{
	  System.out.println("----  before exception ");
    m();
    System.out.println("----  After exception ");
  }
  void p(){
   try{
    n();
   }catch(IOException e){ 
	   System.out.println("exception handled");
   }
  }
  public static void main(String args[]){
   Testthrows1 obj=new Testthrows1();
   obj.p();
   System.out.println("normal flow...");
  }
}
