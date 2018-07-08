package me.edin.listener;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class OreListener implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        Block block = event.getBlock();

        if(block.getType() == Material.EMERALD_ORE) {
            event.setCancelled(true);
            block.setType(Material.AIR);
            block.getState().update();
            player.getInventory().addItem(new ItemStack(Material.EMERALD_ORE));
        }
        if(block.getType() == Material.DIAMOND_ORE) {
            event.setCancelled(true);
            block.setType(Material.AIR);
            block.getState().update();
            player.getInventory().addItem(new ItemStack(Material.DIAMOND_ORE));
        }
        if(block.getType() == Material.COAL_ORE) {
            event.setCancelled(true);
            block.setType(Material.AIR);
            block.getState().update();
            player.getInventory().addItem(new ItemStack(Material.COAL_ORE));
        }
        if(block.getType() == Material.GOLD_ORE) {
            event.setCancelled(true);
            block.setType(Material.AIR);
            block.getState().update();
            player.getInventory().addItem(new ItemStack(Material.GOLD_ORE));
        }
        if(block.getType() == Material.IRON_ORE) {
            event.setCancelled(true);
            block.setType(Material.AIR);
            block.getState().update();
            player.getInventory().addItem(new ItemStack(Material.IRON_ORE));
        }
    }
}
