package de.fabim.mixin;

import net.minecraft.client.gui.hud.ChatHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChatHud.class)
public class ChatHudMixin {

    @Inject(method = "clear(Z)V", at = @At(value = "HEAD"), cancellable = true)
    private void onClear(CallbackInfo ci) {
        System.out.println("ChatHud.clear()");
        ci.cancel();
    }
}
