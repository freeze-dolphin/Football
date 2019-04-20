/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football.listeners;

import java.util.Collection;
import me.Freeze_Dolphin.football.Football;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 *
 * @author Freeze_Dolphin <colour-blue@outlook.com>
 */
public final class Listeners implements Listener {
	
	
	
	@EventHandler
	public void onMove(PlayerMoveEvent evt) throws Exception {
		Collection<Entity> entities = evt.getPlayer().getWorld().getNearbyEntities(evt.getPlayer().getLocation(), 1D, 0, 1D);
	
		for (Entity tmp:entities) {
			if (tmp.getType().equals(EntityType.ARMOR_STAND)) {
				ArmorStand as = (ArmorStand) tmp;
				String football_skull_code = 
				"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGU0YTcwYjdiYmNkN2E4YzMyMmQ1MjI1MjA0OTFhMjdlYTZiODNkNjBlY2Y5NjFkMmI0ZWZiYmY5ZjYwNWQifX19"		
				;
				if (as.getHelmet().equals(new CustomItem(CustomSkull.getItem(football_skull_code), "&f&l足球", "", "&f你只需要将其放在一个盔甲架上"))) {
					as.setInvulnerable(true);
					as.setVisible(false);
				/*	float p = evt.getPlayer().getLocation().getPitch();
					float y = evt.getPlayer().getLocation().getYaw();
					as.getLocation().setPitch(p);
					as.getLocation().setYaw(y);
					Vector v = new Vector();
					v.multiply(y);
					as.getLocation().setDirection(v);
				*/	
					as.setVelocity(evt.getPlayer().getLocation().getDirection().multiply(Football.distance));
				}
			}
		}
	}
}