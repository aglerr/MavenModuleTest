package com.muhammaddaffa.mavenmodule.moduleone;

import com.muhammaddaffa.mavenmodule.api.PlayerCosmetic;

public class Cosmetic {

    public static void announce(){
        new PlayerCosmetic(
                "aglerr",
                14,
                "He's a caveman"
        ).info();
    }

}
