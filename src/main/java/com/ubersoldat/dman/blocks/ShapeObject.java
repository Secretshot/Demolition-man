package com.ubersoldat.dman.blocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;

/**
 * Created by Soldat on 1/27/2016.
 */
public class ShapeObject {

    public static void Demolish(World world, int x, int y, int z, int BlockOffset, int ClearCenterOffset){

        switch (world.getBlockMetadata(x, y, z)){
            case 0:{
                y -= BlockOffset; //looking down
                for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
                    for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
                        for(int zl = z-ClearCenterOffset; zl <= z+ClearCenterOffset; zl ++){ //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

                            }
                            else{
                                world.func_147480_a(xl, yl, zl,false);
                            }
                        }
                    }
                }
                y +=BlockOffset;
            }
            break;
            case 1:{
                y += BlockOffset;
                for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
                    for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
                        for(int zl = z-ClearCenterOffset; zl <= z+ClearCenterOffset; zl ++){ //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

                            }
                            else{
                                world.func_147480_a(xl, yl, zl,false);
                            }
                        }
                    }
                }
                y -= BlockOffset;
            }
            break;
            case 2:{
                z += BlockOffset;
                for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
                    for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
                        for(int zl = z-ClearCenterOffset; zl <= z+ClearCenterOffset; zl ++){ //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

                            }
                            else{
                                world.func_147480_a(xl, yl, zl,false);
                            }
                        }
                    }
                }
                z -= BlockOffset;
            }
            break;
            case 3:{
                z -= BlockOffset;
                for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
                    for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
                        for(int zl = z-ClearCenterOffset; zl <= z+ClearCenterOffset; zl ++){ //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

                            }
                            else{
                                world.func_147480_a(xl, yl, zl,false);
                            }
                        }
                    }
                }
                z += BlockOffset;
            }
            break;
            case 4:{
                x += BlockOffset;
                for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
                    for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
                        for(int zl = z-ClearCenterOffset; zl <= z+ClearCenterOffset; zl ++){ //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

                            }
                            else{
                                world.func_147480_a(xl, yl, zl,false);
                            }
                        }
                    }
                }
                x-=BlockOffset;
            }
            break;
            case 5:{
                x -= BlockOffset;
                for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
                    for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
                        for(int zl = z-ClearCenterOffset; zl <= z+ClearCenterOffset; zl ++){ //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

                            }
                            else{
                                world.func_147480_a(xl, yl, zl,false);
                            }
                        }
                    }
                }
                x += BlockOffset;
            }
            break;
        }
        world.func_147480_a(x, y, z,false);
    }

    public static void DemolishDeep(World world, int x, int y, int z, int BlockOffset, int ClearCenterOffset,int DepthOffset){

            switch (world.getBlockMetadata(x, y, z)){
                case 0:{
                    y -= BlockOffset; //looking down
                    for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
                        for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
                            for(int zl = z-DepthOffset; zl <= z+DepthOffset; zl ++){ //z loop
                                if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

                                }
                                else{
                                    world.func_147480_a(xl, yl, zl,false);
                                }
                            }
                        }
                    }
                    y +=BlockOffset;
                }
                break;
                case 1:{
                    y += BlockOffset;
                    for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
                        for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
                            for(int zl = z-DepthOffset; zl <= z+DepthOffset; zl ++){ //z loop
                                if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

                                }
                                else{
                                    world.func_147480_a(xl, yl, zl,false);
                                }
                            }
                        }
                    }
                    y -= BlockOffset;
                }
                break;
                case 2:{
                    z += BlockOffset;
                    for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
                        for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
                            for(int zl = z-DepthOffset; zl <= z+DepthOffset; zl ++){ //z loop
                                if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

                                }
                                else{
                                    world.func_147480_a(xl, yl, zl,false);
                                }
                            }
                        }
                    }
                    z -= BlockOffset;
                }
                break;
                case 3:{
                    z -= BlockOffset;
                    for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
                        for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
                            for(int zl = z-DepthOffset; zl <= z+DepthOffset; zl ++){ //z loop
                                if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

                                }
                                else{
                                    world.func_147480_a(xl, yl, zl,false);
                                }
                            }
                        }
                    }
                    z += BlockOffset;
                }
                break;
                case 4:{
                    x += BlockOffset;
                    for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
                        for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
                            for(int zl = z-DepthOffset; zl <= z+DepthOffset; zl ++){ //z loop
                                if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

                                }
                                else{
                                    world.func_147480_a(xl, yl, zl,false);
                                }
                            }
                        }
                    }
                    x-=BlockOffset;
                }
                break;
                case 5:{
                    x -= BlockOffset;
                    for(int yl = y-ClearCenterOffset; yl <= y+ClearCenterOffset; yl ++){ //y loop
                        for(int xl = x-ClearCenterOffset; xl <= x+ClearCenterOffset; xl ++){ //x loop
                            for(int zl = z-DepthOffset; zl <= z+DepthOffset; zl ++){ //z loop
                                if (world.getBlock(xl, yl, zl) == Blocks.bedrock){

                                }
                                else{
                                    world.func_147480_a(xl, yl, zl,false);
                                }
                            }
                        }
                    }
                    x += BlockOffset;
                }
                break;
            }
            world.func_147480_a(x, y, z,false);
        }
}
