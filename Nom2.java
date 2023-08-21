/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nom2;

/**
 *
 * @author User
 */

class Animal {
  String name;

  public Animal(String name) {
    this.name = name;
  }

  public void speak() {
    System.out.println("AKU KUCING.");
  }

  public void introduce() {
    System.out.println("WASSSUP AKU " + name + ".");
  }
}

class Cat extends Animal {

  public Cat(String name) {
    super(name);
  }

  public void meow() {
    System.out.println("RAWRRRRRRRS!");
  }
}

public class Nom2 {
  public static void main(String[] args) {
    Cat cat = new Cat("OYEN");
    cat.introduce(); // Calls the introduce() method from the Animal class
    cat.meow();
  }
}
