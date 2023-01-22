package com.hollingsworth.ars_caelum.lib;

public class RitualLang {
    public static String COBBLE = prependRitual("cobble");
    public static String FORESTATION = prependRitual("forestation");
    public static String MANA_REGEN = prependRitual("mana_regen");
    public static String PLATFORM = prependRitual("conjure_plains");

    public static String prependRitual(String ritual) {
        return "ritual_" + ritual;
    }
}