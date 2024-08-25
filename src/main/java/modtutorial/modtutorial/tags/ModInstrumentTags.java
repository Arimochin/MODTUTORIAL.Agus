package modtutorial.modtutorial.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Instrument;

public interface ModInstrumentTags {
    TagKey<Instrument> REGULAR_MICROFONO = create("regular_microfono");
    TagKey<Instrument> SCREAMING_GOAT_HORNS = create("screaming_goat_horns");
    TagKey<Instrument> MICROFONO = create("microfono");

    private static TagKey<Instrument> create(String p_215861_) {
        return TagKey.create(Registries.INSTRUMENT, new ResourceLocation(p_215861_));
    }
}
