package modtutorial.modtutorial.item;

import modtutorial.modtutorial.Modtutorial;
import modtutorial.modtutorial.item.custom.ModItemSound;
import modtutorial.modtutorial.tags.ModInstrumentTags;
import net.minecraft.tags.InstrumentTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.InstrumentItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Modtutorial.MODID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> ASADO=
            ITEMS.register("asado", () -> new Item(
                    new Item.Properties().stacksTo(32).fireResistant().food(
                            new FoodProperties.Builder().nutrition(3).effect(
                            () -> new MobEffectInstance(MobEffects.LEVITATION, 6000, 0), 1.0f).build())
            )
            );

    public static final RegistryObject<InstrumentItem> MICROFONO =
            ITEMS.register((String)"microfono", () -> new InstrumentItem((new Item.Properties()).stacksTo(1), ModInstrumentTags.MICROFONO));
    //((String)"goat_horn", new InstrumentItem((new Item.Properties()).stacksTo(1), InstrumentTags.GOAT_HORNS));

    public static final RegistryObject<Item> POCHOCLO =
            ITEMS.register("pochoclo", () -> new Item(
                    new Item.Properties().stacksTo(64).food(
                            new FoodProperties.Builder().nutrition(6).effect(
                                    () -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2000, 0), 1.0f).effect(
                                            () -> new MobEffectInstance(MobEffects.GLOWING, 2000, 0), 1.0f).effect(
                                                    () -> new MobEffectInstance(MobEffects.HEAL, 1000, 0), 1.0f).build())
    ));

}


