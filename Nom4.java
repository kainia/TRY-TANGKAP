/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nom4;

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

public class Nom4 {
  public static void main(String[] args) {
    try {
      Cat cat = new Cat("OYEN");
      cat.introduce(); // Calls the introduce() method from the Animal class
      cat.meow();
    } catch (Exception e) {
      System.out.println("An exception occurred: " + e.getMessage());
    }
  }
}

