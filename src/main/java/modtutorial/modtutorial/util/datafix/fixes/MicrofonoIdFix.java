package modtutorial.modtutorial.util.datafix.fixes;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.datafix.fixes.ItemStackTagFix;

public class MicrofonoIdFix extends ItemStackTagFix {
    private static final String[] INSTRUMENTS = new String[]{"<<modtutorial:ponder_goat_horn>>", "modtutorial:sing_goat_horn", "modtutorial:seek_goat_horn", "modtutorial:feel_goat_horn", "modtutorial:admire_goat_horn", "modtutorial:call_goat_horn", "modtutorial:yearn_goat_horn", "modtutorial:dream_goat_horn"};

    public MicrofonoIdFix(Schema p_216674_) {
        super(p_216674_, "MicrofonoIdFix", (p_216678_) -> {
            return p_216678_.equals("modtutorial:microfono");
        });
    }

    protected <T> Dynamic<T> fixItemStackTag(Dynamic<T> p_216676_) {
        int $$1 = p_216676_.get("SoundVariant").asInt(0);
        String $$2 = INSTRUMENTS[$$1 >= 0 && $$1 < INSTRUMENTS.length ? $$1 : 0];
        return p_216676_.remove("SoundVariant").set("instrument", p_216676_.createString($$2));
    }
}
