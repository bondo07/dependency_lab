package org.example;

public class Alien implements Attacker{
    //Instance Variables (Has A)
    public String name;
    public Ability ability;

    public Alien(String name, Ability ability) {
        this.name = name;
        this.ability = ability;
    }





    //Methods (Can Do)
    public void Attack() {
        System.out.print(this.name + " attacks with their " + this.ability.name + " for " + this.ability.power + " damage!");
    }

}
