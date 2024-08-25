package modtutorial.modtutorial.sounds;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.stream.IntStream;

public class ModSoundEvents {

//    public static final SoundEvent MICROFONO_BREAK = register("entity.goat.horn_break");
//    public static final SoundEvent MICROFONO_PLAY = register("item.goat_horn.play");

    //public static final SoundEvent MICROFONO_BREAK = register("entity.microfono");
    public static final SoundEvent MICROFONO_PLAY = register("item.sounds.microfono.play");

    public static final int MICROFONO_VARIANT_COUNT = 8;
    public static final ImmutableList<Holder.Reference<SoundEvent>> MICROFONO_SOUND_VARIANTS = registerMicrofonoSoundVariants();

    private static Holder<SoundEvent> register(ResourceLocation p_263323_, ResourceLocation p_263411_, float p_263385_) {
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, p_263323_, SoundEvent.createFixedRangeEvent(p_263411_, p_263385_));
    }

    private static SoundEvent register(String p_12657_) {
        return register(new ResourceLocation(p_12657_));
    }

    private static SoundEvent register(ResourceLocation p_263332_) {
        return register(p_263332_, p_263332_);
    }

    private static Holder.Reference<SoundEvent> registerForHolder(String p_263391_) {
        return registerForHolder(new ResourceLocation(p_263391_));
    }

    private static Holder.Reference<SoundEvent> registerForHolder(ResourceLocation p_263361_) {
        return registerForHolder(p_263361_, p_263361_);
    }

    private static SoundEvent register(ResourceLocation p_263388_, ResourceLocation p_263340_) {
        return (SoundEvent)Registry.register(BuiltInRegistries.SOUND_EVENT, p_263388_, SoundEvent.createVariableRangeEvent(p_263340_));
    }

    private static Holder.Reference<SoundEvent> registerForHolder(ResourceLocation p_263362_, ResourceLocation p_263424_) {
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, p_263362_, SoundEvent.createVariableRangeEvent(p_263424_));
    }

    private static ImmutableList<Holder.Reference<SoundEvent>> registerMicrofonoSoundVariants() {
        return (ImmutableList) IntStream.range(0, 8).mapToObj((p_215784_) -> {
            return registerForHolder("item.microfono.sound." + p_215784_); }).collect(ImmutableList.toImmutableList());
    }
}
