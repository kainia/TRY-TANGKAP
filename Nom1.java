/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nom1;

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
    System.out.println("I am an animal.");
  }
}

class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  public void bark() {
    System.out.println("Woof!");
  }
}
