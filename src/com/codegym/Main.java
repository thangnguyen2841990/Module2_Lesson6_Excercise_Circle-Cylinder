package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Test lớp hình tròn
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println(circle.getArea());

        // Test lớp hình trụ
        Cylinder cylinder =  new Cylinder();
        System.out.println(cylinder);
        cylinder =  new Cylinder(10);
        System.out.println(cylinder);
        cylinder =  new Cylinder(10,"red",20);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}
