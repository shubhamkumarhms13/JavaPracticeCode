package com;

//Eager Initialisation
class SingletonClass1 {
    private static SingletonClass1 singletonClass1 = new SingletonClass1();
    private SingletonClass1(){
    }
    public static SingletonClass1 getInstance(){
        return singletonClass1;
    }
}

//Lazy Initialisation
class SingletonClass2{
    private static SingletonClass2 singletonClass2;
    private SingletonClass2(){
    }
    public static SingletonClass2 getInstance(){
        if(singletonClass2 == null){
            singletonClass2 = new SingletonClass2();
        }return singletonClass2;
    }
}

//Synchronised Keyword
class SingletonClass3 {
    private static SingletonClass3 singletonClass3;
    private SingletonClass3(){
    }
    synchronized public static SingletonClass3 getInstance(){
        if(singletonClass3 == null){
            singletonClass3 = new SingletonClass3();
        }return singletonClass3;
    }
}

//Double-Check Locking System
class SingletonClass4 {
    private static SingletonClass4 singletonClass4;
    private SingletonClass4(){
    }
    public static SingletonClass4 getInstance(){
        if(singletonClass4 == null){
            synchronized (SingletonClass4.class){
                if(singletonClass4 == null){
                    singletonClass4 = new SingletonClass4();
                }
            }
        }
        return singletonClass4;
    }
}

//Bill-Pugh Solution
class SingletonClass5 {
    private SingletonClass5(){
    }
    private static class SingletonHelper{
        private static final SingletonClass5 instance = new SingletonClass5();
    }
    public static SingletonClass5 getInstance(){
        return SingletonHelper.instance;
    }
}

public class SingletonClass{
    public static void main(String[] args) {
        SingletonClass1 instance1 = SingletonClass1.getInstance();
        System.out.println(instance1);
        SingletonClass2 instance2 = SingletonClass2.getInstance();
        System.out.println(instance2);
        SingletonClass3 instance3 = SingletonClass3.getInstance();
        System.out.println(instance3);
        SingletonClass4 instance4 = SingletonClass4.getInstance();
        System.out.println(instance4);
    }
}
