package anotherDEVer.FarmingWand;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.block.*;
import org.bukkit.block.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.ItemStack;

public final class FarmingWand extends JavaPlugin implements Listener
{
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void PlayerClickEvent(PlayerInteractEvent event)
	{
		Player interacter = event.getPlayer();
		
		PlayerInventory pInv = interacter.getInventory();
		
		ItemStack heldItem = pInv.getItemInHand();
		
		if (heldItem.getTypeId() == 294)
		{
			interacter.giveExp(2000);
		}
	}
}
