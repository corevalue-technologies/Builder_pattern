package main;

public class BuilderDemo {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CDBuilder cdBuilder=new CDBuilder();
        CDType cdType1=cdBuilder.buildSonyCD();
        cdType1.showItems();

        CDType cdType2=cdBuilder.buildSamsungCD();
        cdType2.showItems();

    }
}