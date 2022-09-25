package net.candycupdev.mccibutfunny.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;
import java.util.Random;

import static net.candycupdev.mccibutfunny.Mccibutfunny.goofyAssDeathMessages;

@Mixin(InGameHud.class)
public abstract class MessageReplacerMixin {
    @Inject(at = @At("RETURN"), method = "setTitle")
    public void onChatMessage(Text title, CallbackInfo ci) {
        System.out.println(title.getString());
        if(Objects.equals(title.getString(), "Eliminated")) {
            Random r = new Random();

            int randomitem = r.nextInt(goofyAssDeathMessages.size());
            String randomElement = goofyAssDeathMessages.get(randomitem);

            MinecraftClient.getInstance().inGameHud.setTitle(Text.of(randomElement));
        }
    }
}

