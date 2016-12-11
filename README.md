# EXAM: Java Basics Retake

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
 - You can use any resource online, but **please work individually**
 - Instead of copy-pasting your answers and solutions, write them in your own words.

# Tasks
## 1. Setup a new project (~5 mins) [1p]
- Create a new project inside your cloned repository
- Setup `.gitignore` file to exclude the IDE's generated files
   - Just the src directory should be committed
- Create a package called `com.greenfox.exams.java.retake` and work under that


## 2. Aircraft Carrier Application (~100 mins) [25p]
The task is to create an application where you can add aircrafts to the aircraft carrier.

### Aircrafts
Create a class that represents an aircraft

There are 2 types of aircrafts: F16 and F35

Both aircraft should track how many ammo it has

#### F16
 - Max ammo: 8
 - Base damage: 30

#### F35
 - Max ammo: 12
 - Base damage: 50

All the aircrafts should be created with empty ammo store
All aircrafts should be displayed as string like this: `Type F35, Ammo: 10, Base Damage: 50, All Damage: 500`

Methods:

#### fight
- It should use all the ammos (set it to 0) and it should return the damage it took
- The damage is the multiplication of the base damage and the ammos

#### refill
- It should take an number as parameter and substract as much ammo as possibe,
- It can't have more ammo than the number or the max ammo.
- It should return the substracted ammo amount

### Carrier
Create a class that represents an aircraft-carrier

- The carrier should be able to store aircrafts
- Each carrier should have a store of ammo represented as number
- The inital ammo should be give by a parameter in it's constructor
- It should store a health point as a number

All aircraft carriers should be displayed as string like this:
```
Aircraft count: 4, Ammo Storage: 2300, Total damage: 2280
Aircrafts:
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
```
If the health points are 0 than like this: `It's dead Jim :(`

Methods:

#### addAircraft
- It should take a string as the type of the aircraft and add a new aircraft to its store

#### fill
- It should fill the aircraft with ammo and substract the needed ammo from the ammo_storage.
- If there is not enough ammo than it should fill the F35 types first
- If there is no ammo when this method is called it should throw an exception.

#### fight
- It should take another carrier as a parameter and fire all the ammo
from all of its aircrafts to it than substract all the damage from it's health points

## Understanding (15 mins) [4p]
Take a look at the following code!
```java
public class B {
    String s;

    public B(String s) {
        this.s = s;
    }

    public static String p(String z) {
        System.out.println(s);
        s += z;
        return z;
    }
}

public class Main {
  public static void main(String[] args) {
    B b = new B("alma");
    System.out.println(b.p(b.p(b.p(b.p("korte")))));
  }
}
```
What's get printed out? [2p] What is wrong with the code currently and why? [2p]

#### Your answer:
