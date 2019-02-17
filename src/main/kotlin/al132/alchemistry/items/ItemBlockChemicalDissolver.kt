package al132.alchemistry.items

import al132.alchemistry.ConfigHandler
import al132.alchemistry.compat.jei.Translator
import net.minecraft.block.Block
import net.minecraft.client.util.ITooltipFlag
import net.minecraft.item.ItemBlock
import net.minecraft.item.ItemStack
import net.minecraft.world.World

class ItemBlockChemicalDissolver(block: Block) : ItemBlock(block) {

    override fun addInformation(stack: ItemStack?, worldIn: World?, tooltip: MutableList<String>?, flagIn: ITooltipFlag?) {
        (tooltip as MutableList)
                .add(Translator.translateToLocal("tile.chemical_dissolver.tooltip") + " " + ConfigHandler.dissolverEnergyPerTick + " FE/t")
    }
}