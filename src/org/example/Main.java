package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Weapon laserGun = new LaserGun();
        Attacker robot_one = new Robot("Bizmodo", laserGun);
        robot_one.Attack();

        Ability mindBlast = new MindBlast();
        Attacker alien_one = new Alien("Martian", mindBlast);
        alien_one.Attack();

        Weapon sword = new Sword();
        Attacker robot_two = new Robot("Chip", sword);
        robot_two.Attack();

        Ability psiDrain = new PsiDrain();
        Attacker alien_two = new Alien("E.T.", psiDrain);
        alien_two.Attack();

        Weapon lightsaber = new Lightsaber();
        Attacker robot_three = new Robot("Replicant", lightsaber);
        robot_three.Attack();

        Ability levitateSlam = new LevitateSlam();
        Attacker alien_three = new Alien("Yoda", levitateSlam);
        alien_three.Attack();




    }
}