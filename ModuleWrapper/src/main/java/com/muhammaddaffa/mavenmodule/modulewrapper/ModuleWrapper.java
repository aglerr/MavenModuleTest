package com.muhammaddaffa.mavenmodule.modulewrapper;

import java.util.concurrent.ThreadLocalRandom;

public class ModuleWrapper {

    public static void random(){
        if(ThreadLocalRandom.current().nextBoolean()){
            System.out.println("Using module one!");
            com.muhammaddaffa.mavenmodule.moduleone.Cosmetic.announce();
        } else {
            System.out.println("Using module two!");
            com.muhammaddaffa.mavenmodule.moduletwo.Cosmetic.announce();
        }
    }

}
