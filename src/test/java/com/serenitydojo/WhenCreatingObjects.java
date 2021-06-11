package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.Cat.usualFood;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat(){
        String name = "Felix";
        String favoriteFood = "Tuna";
        int age = 4;
        /*
        Cat felix = new Cat();
        //felix.name = "Felix";
        felix.setName("Felix");
        System.out.println("Cat name is " + felix.getName());
        //felix.favoriteFood = "Tuna";
        felix.setFavoriteFood("Tuna");
        System.out.println(felix.getName() + " favorite food is " + felix.getFavoriteFood());
        felix.age = 5;

        Cat fino = new Cat();
        fino.name = "Fino";
        fino.age = 3;
        */

        Cat felix = new Cat("Felix", "Tuna",5);
        System.out.println("Cat name is " + felix.getName());
        System.out.println(felix.getName() + " favorite food is " + felix.getFavoriteFood());
        System.out.println(felix.getName() + " age is " + felix.getAge());

        //felix.age = 10;

    }

    @Test
    public void creating_a_dog(){
        Dog dog = new Dog ("Fido", "Bone", 5);
        Assert.assertEquals(dog.getName(), "Fido");
        Assert.assertEquals(dog.getfavoriteFood(), "Bone");
        Assert.assertEquals(dog.getAge(), 5);


    }

    @Test
    public void cat_makes_noise(){
        Cat felix = new Cat ("Felix", "Tuna", 5);
        Cat felix1 = new Cat("Felix-1",10);
        Cat spot = new Cat ("Spot", "Salmon", 3);

        System.out.println("Cats usually like " + usualFood());
        System.out.println(felix1.getName() + " likes " + felix1.getFavoriteFood());
        System.out.println("Usual food = " + usualFood());
        felix.makeNoise();
        felix.feed("Tuna");
        felix.groom();

        spot.feed("Salmon");
        spot.makeNoise();
    }





}
