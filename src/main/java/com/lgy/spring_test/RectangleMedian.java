package com.lgy.spring_test;

public class RectangleMedian {
	public static void main(String[] args) {
		Rectangle rec= new Rectangle();
		Median mid = new Median();
		
		rec.setX(150);
		rec.setY(150);
		mid.setX(20);
		mid.setY(33);
		mid.setZ(100);
		
		rec.rec();
		mid.mid();
		
	}
}
