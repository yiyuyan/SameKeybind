package cn.ksmcbrigade.sk;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(SameKeybind.MODID)
public class SameKeybind {

    public static final String MODID = "sk";

    public SameKeybind() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
