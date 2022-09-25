package net.candycupdev.mccibutfunny;

import net.fabricmc.api.ModInitializer;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Mccibutfunny implements ModInitializer {

    public static final Identifier MCC_DEATH_SOUND = new Identifier("mccibutfunny:mcc_death");
    public static SoundEvent MCC_DEATH = new SoundEvent(MCC_DEATH_SOUND);

    @Override
    public void onInitialize() {
        Registry.register(Registry.SOUND_EVENT, Mccibutfunny.MCC_DEATH_SOUND, MCC_DEATH);

    }
}
