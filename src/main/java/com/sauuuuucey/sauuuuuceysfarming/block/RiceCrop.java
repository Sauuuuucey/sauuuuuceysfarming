package com.sauuuuucey.sauuuuuceysfarming.block;

import com.sauuuuucey.sauuuuuceysfarming.init.ModSeeds;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class RiceCrop extends CropsBlock 
{
    public static final IntegerProperty AGE = BlockStateProperties.AGE_0_7;
    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};

	public RiceCrop(Properties builder) {
		super(builder);
	}
	
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return SHAPE_BY_AGE[state.get(this.getAgeProperty())];
    }
    
	protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return state.getBlock() instanceof FarmlandBlock;
	}
	
    public IntegerProperty getAgeProperty() {
        return AGE;
    }
    
    public int getMaxAge() {
        return 4;
    }
    
    protected int getAge(BlockState state) {
        return state.get(this.getAgeProperty());
    }

    public BlockState withAge(int age) {
        return this.getDefaultState().with(this.getAgeProperty(), Integer.valueOf(age));
    }

    public boolean isMaxAge(BlockState state) {
        return state.get(this.getAgeProperty()) >= this.getMaxAge();
    }
	
    
	@OnlyIn(Dist.CLIENT)
	protected IItemProvider getSeedsItem() {
		return ModSeeds.rice;
	}
	
    
  	@OnlyIn(Dist.CLIENT)
  	public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
  		return new ItemStack(this.getSeedsItem());
  	}
  	
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
