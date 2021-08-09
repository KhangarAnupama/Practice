package com.anupma.program;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Shape {
    public Shape makeCopy() {
		return null;
        // code to make a copy of this Shape
    }
}

class Circle extends Shape {
    @Override
    public Circle makeCopy() {
		return null;
        // code to make a copy of a Circle
    }
}

public class Unbox {
    public static void main(String[] args) {
    	
    	Map<String,List<Integer>> x = new TreeMap<> ();
        Shape s = new Circle();
     //   Circle c = s.makeCopy();
    }
}