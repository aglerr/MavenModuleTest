package com.muhammaddaffa.mavenmodule.moduletwo;

import com.muhammaddaffa.mavenmodule.api.PlayerCosmetic;

public class Cosmetic {

    public static void announce(){
        new PlayerCosmetic(
                "ZiwoxYT",
                16,
                "He's from a modern city"
        ).info();
    }

}
