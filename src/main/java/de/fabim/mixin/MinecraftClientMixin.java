package de.fabim.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
    @Shadow @Final public InGameHud inGameHud;

    @Inject(method = "enterReconfiguration(Lnet/minecraft/client/gui/screen/Screen;)V", at = @At(value = "INVOKE"))
    private void enterReconfiguration(Screen screen, CallbackInfo ci) {
        System.out.println("MinecraftClient.enterReconfiguration()");
        this.inGameHud.clear();
        this.inGameHud.getChatHud().clear(false);
    }
}
