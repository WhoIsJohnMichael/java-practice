package oop.src;

public class Humans {

    private String name, address;
    private int age;

    public Humans (String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void sayGreetings(){
        System.out.println("Hello I am " + getName() + " and I am " + getAge() + "years old. I live in " + getAddress()); 
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;
    }

}