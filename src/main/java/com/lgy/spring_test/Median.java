package com.lgy.spring_test;

public class Median {
	int x,y,z;
	
	public void mid() {
		if (x>y && x<z || x>z&& x<z) {
			System.out.println("입력된 정수가"+x+"와"+y+"와"+z+"의 중간값은"+x);
		} else if (y>x && y<z || y>z&& y<x){
			System.out.println("입력된 정수가"+x+"와"+y+"와"+z+"의 중간값은"+y);
		} else {
			System.out.println("입력된 정수가"+x+"와"+y+"와"+z+"의 중간값은"+z);
			
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}
