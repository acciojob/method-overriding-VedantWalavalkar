package com.driver;
class A{
    public String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    @Override
    public String meth(){
//        System.out.println(super.meth());
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.meth();

        B obj1 = new B();
        obj.meth();
    }
}