package com.file;

public class Shape {
    private String name;

    Shape(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public float calculateArea(){
        return 0.0f;
    }
    
    public static void main(String[] args) {
       
        Shape[] shape = new Shape[4];
        
        shape[0] = new Lingkaran("Lingkaran", 12);
        shape[1] = new Trapesium("Trapesium", 12, 32, 35);
        shape[2] = new Persegi("Persegi Panjang", 12, 32);
        shape[3] = new Segitiga("Segitiga", 32, 35);

        for (int i = 0; i < shape.length; i++) {
            System.out.println("--------------------");
            System.out.println("Nama : "+ shape[i].getName());
            System.out.println("Luas : "+ shape[i].calculateArea());
            System.out.println("--------------------\n");
        }
    
    }
}

class Lingkaran extends Shape{
    private float radius;

    Lingkaran (String name, float radius){
        super(name);
        this.radius = radius;
    }
    public float getRadius(){
        return radius;
    }
    
    public float calculateArea(){
        return (float) 3.14*radius*radius;
    }
}

class Trapesium extends Shape{
    private float alas1, alas2, tinggi;

    
    Trapesium(String name, float alas1, float alas2, float tinggi){
        super(name);
        this.alas1 = alas1;
        this.alas2 = alas2;
        this.tinggi = tinggi;
    }
    
    public float getAlas1() {
        return alas1;
    }

    public float getAlas2() {
        return alas2;
    }

    public float getTinggi() {
        return tinggi;
    }

    public float calculateArea(){
        return (float) (alas1 + alas2) / 2 * tinggi;
    }
}

class Persegi extends Shape{
    private float atas,tinggi;

    Persegi(String name, float atas, float tinggi){
        super(name);
        this.atas=atas;
        this.tinggi=tinggi;
    }

    public float getAtas(){
        return atas;
    }

    public float getTinggi(){
        return tinggi;
    }

    public float calculateArea(){
        return (float) atas*tinggi;
    }

}

class Segitiga extends Shape{
    private float alas,tinggi;

    Segitiga(String nama,float alas,float tinggi){
        super(nama);
        this.alas=alas;
        this.tinggi=tinggi;
    }

    public float getAlas(){
        return alas;
    }
    public float getTinggi(){
        return tinggi;
    }
    public float calculateArea(){
        return (float) alas*tinggi/2;
    }
}