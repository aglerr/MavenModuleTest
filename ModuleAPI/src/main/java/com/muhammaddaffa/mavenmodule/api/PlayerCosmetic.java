package com.muhammaddaffa.mavenmodule.api;

public class PlayerCosmetic {

    private final String userName;
    private final int age;
    private final String lore;

    public PlayerCosmetic(String userName, int age, String lore){
        this.userName = userName;
        this.age = age;
        this.lore = lore;
    }

    public void info(){
        System.out.println("Name: " + this.userName);
        System.out.println("Age: " + this.age);
        System.out.println("Lore: " + this.lore);
    }

}
