package com.hollingsworth.ars_caelum;

import com.hollingsworth.ars_caelum.ritual.*;
import com.hollingsworth.arsnouveau.api.ArsNouveauAPI;
import com.hollingsworth.arsnouveau.api.spell.AbstractSpellPart;

import java.util.ArrayList;
import java.util.List;

public class ArsNouveauRegistry {

    public static List<AbstractSpellPart> registeredSpells = new ArrayList<>();

    public static void registerGlyphs(){
        ArsNouveauAPI api = ArsNouveauAPI.getInstance();;
        api.registerRitual(new ManaRegenRitual());
        api.registerRitual(new ConjurePlainsRitual());
        api.registerRitual(new CobbleRitual());
        api.registerRitual(new ForestationRitual());
        api.registerRitual(new BlazingIslandRitual());
    }

    public static void register(AbstractSpellPart spellPart){
        ArsNouveauAPI.getInstance().registerSpell(spellPart);
        registeredSpells.add(spellPart);
    }

}
