package com.serenitydojo;

import org.junit.Test;

public class JavaDataTypes {

    @Test
    public void numericalVariablesDeclaration(){

        int age = 10;
        age = age +1;
        System.out.println("Age is " + age);

        final Integer ageThisYear = 21;
        int ageNextYear = ageThisYear+1;
        System.out.println("Age this year is " + ageThisYear);
        System.out.println("Age next year is " + ageNextYear);
        System.out.println(ageThisYear.compareTo(ageNextYear));

        long starsInTheGalaxy = 100000000000000L;
        System.out.println("Stars in the galaxy are approximately " + starsInTheGalaxy);

        float height = 5.8F;
        System.out.println("Height is " + height);

        double weight = 10.01578;
        System.out.println("Weight is " + weight);
    }

    @Test
    public void stringVariablesDeclaration(){

        String name = "   Joe-Bloggs   ";
        System.out.println("Name is " + name);
        System.out.println("Length of Name variable is " + name.length());
        System.out.println("Name in upper case " + name.toUpperCase());
        System.out.println("Name in lower case " + name.toLowerCase());
        System.out.println("Trimmed name is " + name.trim());

        String newName = name.replace("Joe","Ray");
        System.out.println("New Name is " + newName);


    }

}
