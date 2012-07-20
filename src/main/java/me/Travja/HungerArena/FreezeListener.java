package me.travja.hungerarena;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;

public class FreezeListener implements Listener {
	public Main plugin;
	public FreezeListener(Main m) {
		this.plugin = m;
	}
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event){
		Player p = event.getPlayer();
		String pname = p.getName();
		if(plugin.Frozen.contains(pname) && plugin.config.getString("Frozen_Teleport").equalsIgnoreCase("True")){
                        Location from = event.getFrom();
                        p.teleport(from, TeleportCause.ENDER_PEARL);
		}
	}
}