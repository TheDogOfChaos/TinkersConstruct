package slimeknights.tconstruct.gadgets.block;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DriedClaySlabBlock extends SlabBlock {

  public DriedClaySlabBlock() {
    super(Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 20.0F).sound(SoundType.STONE).lightValue(7));
  }

}
