package com.ubersoldat.dman.blocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;

/**
 * Created by Soldat on 1/27/2016.
 */
public class ShapeObject {

    public static void Demolish(World world, int x, int y, int z, int BlockOffset, int ClearCenterOffset) {

        switch (world.getBlockMetadata(x, y, z)) {
            case 0: { //looking down
                y -= BlockOffset;
                for (int yl = y - ClearCenterOffset; yl <= y + ClearCenterOffset; yl++) { //y loop
                    for (int xl = x - ClearCenterOffset; xl <= x + ClearCenterOffset; xl++) { //x loop
                        for (int zl = z - ClearCenterOffset; zl <= z + ClearCenterOffset; zl++) { //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock) {

                            } else {
                                world.func_147480_a(xl, yl, zl, false);
                            }
                        }
                    }
                }
                y += BlockOffset;
            }
            break;
            case 1: {
                y += BlockOffset;
                for (int yl = y - ClearCenterOffset; yl <= y + ClearCenterOffset; yl++) { //y loop
                    for (int xl = x - ClearCenterOffset; xl <= x + ClearCenterOffset; xl++) { //x loop
                        for (int zl = z - ClearCenterOffset; zl <= z + ClearCenterOffset; zl++) { //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock) {

                            } else {
                                world.func_147480_a(xl, yl, zl, false);
                            }
                        }
                    }
                }
                y -= BlockOffset;
            }
            break;
            case 2: {
                z += BlockOffset;
                for (int yl = y - ClearCenterOffset; yl <= y + ClearCenterOffset; yl++) { //y loop
                    for (int xl = x - ClearCenterOffset; xl <= x + ClearCenterOffset; xl++) { //x loop
                        for (int zl = z - ClearCenterOffset; zl <= z + ClearCenterOffset; zl++) { //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock) {

                            } else {
                                world.func_147480_a(xl, yl, zl, false);
                            }
                        }
                    }
                }
                z -= BlockOffset;
            }
            break;
            case 3: {
                z -= BlockOffset;
                for (int yl = y - ClearCenterOffset; yl <= y + ClearCenterOffset; yl++) { //y loop
                    for (int xl = x - ClearCenterOffset; xl <= x + ClearCenterOffset; xl++) { //x loop
                        for (int zl = z - ClearCenterOffset; zl <= z + ClearCenterOffset; zl++) { //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock) {

                            } else {
                                world.func_147480_a(xl, yl, zl, false);
                            }
                        }
                    }
                }
                z += BlockOffset;
            }
            break;
            case 4: {
                x += BlockOffset;
                for (int yl = y - ClearCenterOffset; yl <= y + ClearCenterOffset; yl++) { //y loop
                    for (int xl = x - ClearCenterOffset; xl <= x + ClearCenterOffset; xl++) { //x loop
                        for (int zl = z - ClearCenterOffset; zl <= z + ClearCenterOffset; zl++) { //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock) {

                            } else {
                                world.func_147480_a(xl, yl, zl, false);
                            }
                        }
                    }
                }
                x -= BlockOffset;
            }
            break;
            case 5: {
                x -= BlockOffset;
                for (int yl = y - ClearCenterOffset; yl <= y + ClearCenterOffset; yl++) { //y loop
                    for (int xl = x - ClearCenterOffset; xl <= x + ClearCenterOffset; xl++) { //x loop
                        for (int zl = z - ClearCenterOffset; zl <= z + ClearCenterOffset; zl++) { //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock) {

                            } else {
                                world.func_147480_a(xl, yl, zl, false);
                            }
                        }
                    }
                }
                x += BlockOffset;
            }
            break;
        }
        world.func_147480_a(x, y, z, false);
    }


    public static void DemolishDeep(World world, int x, int y, int z, int BlockOffset, int ClearCenterOffset, int Depth) {

        switch (world.getBlockMetadata(x, y, z)) {
            case 0: { //looking down
                y -= (Depth + 1); // This pushes the start of the algorithm to the furthest point down
                for (int yl = y ; yl <= y + Depth; yl++) { //y loop - stoping on the level below the shape charge
                    for (int xl = x - ClearCenterOffset; xl <= x + ClearCenterOffset; xl++) { //x loop
                        for (int zl = z - ClearCenterOffset; zl <= z + ClearCenterOffset; zl++) { //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock) {

                            } else {
                                world.func_147480_a(xl, yl, zl, false);
                            }
                        }
                    }
                }
                y += (Depth +1);
            }
            break;
            case 1: {
                y += 1;
                for (int yl = y; yl <= y + Depth; yl++) { //y loop
                    for (int xl = x - ClearCenterOffset; xl <= x + ClearCenterOffset; xl++) { //x loop
                        for (int zl = z - ClearCenterOffset; zl <= z + ClearCenterOffset; zl++) { //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock) {

                            } else {
                                world.func_147480_a(xl, yl, zl, false);
                            }
                        }
                    }
                }
                y -= 1;
            }
            break;
            case 2: {
                z += 1;
                for (int yl = y - ClearCenterOffset; yl <= y + ClearCenterOffset; yl++) { //y loop
                    for (int xl = x - ClearCenterOffset; xl <= x + ClearCenterOffset; xl++) { //x loop
                        for (int zl = z; zl <= z + Depth; zl++) { //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock) {

                            } else {
                                world.func_147480_a(xl, yl, zl, false);
                            }
                        }
                    }
                }
                z -= 1;
            }
            break;
            case 3: {
                z -= (Depth + 1);
                for (int yl = y - ClearCenterOffset; yl <= y + ClearCenterOffset; yl++) { //y loop
                    for (int xl = x - ClearCenterOffset; xl <= x + ClearCenterOffset; xl++) { //x loop
                        for (int zl = z; zl <= z + Depth; zl++) { //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock) {

                            } else {
                                world.func_147480_a(xl, yl, zl, false);
                            }
                        }
                    }
                }
                z += (Depth + 1);
            }
            break;
            case 4: {
                x += 1;
                for (int yl = y - ClearCenterOffset; yl <= y + ClearCenterOffset; yl++) { //y loop
                    for (int xl = x; xl <= x + Depth; xl++) { //x loop
                        for (int zl = z - ClearCenterOffset; zl <= z + ClearCenterOffset; zl++) { //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock) {

                            } else {
                                world.func_147480_a(xl, yl, zl, false);
                            }
                        }
                    }
                }
                x -= 1;
            }
            break;
            case 5: {
                x -= (Depth +1);
                for (int yl = y - ClearCenterOffset; yl <= y + ClearCenterOffset; yl++) { //y loop
                    for (int xl = x; xl <= x + Depth; xl++) { //x loop
                        for (int zl = z - ClearCenterOffset; zl <= z + ClearCenterOffset; zl++) { //z loop
                            if (world.getBlock(xl, yl, zl) == Blocks.bedrock) {

                            } else {
                                world.func_147480_a(xl, yl, zl, false);
                            }
                        }
                    }
                }
                x += (Depth +1);
            }
            break;
        }
        world.func_147480_a(x, y, z, false);
    }
}