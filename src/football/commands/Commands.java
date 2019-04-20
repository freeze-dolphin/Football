/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football.commands;

import java.util.logging.Level;
import java.util.logging.Logger;
import me.Freeze_Dolphin.football.Football;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author Freeze_Dolphin <colour-blue@outlook.com>
 */
public class Commands implements CommandExecutor {
	private final Football plugin;

	public Commands(Football plugin) {
		this.plugin = plugin;
    }
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("gfb")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("这个指令只能让玩家使用");
				return false;
			} else {
				if (((Player)sender).isOp()/* || ((Player)sender).getName().equals("Freeze_Dolphin")*/) {
					String football_skull_code = 
					"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGU0YTcwYjdiYmNkN2E4YzMyMmQ1MjI1MjA0OTFhMjdlYTZiODNkNjBlY2Y5NjFkMmI0ZWZiYmY5ZjYwNWQifX19"		
					;
					try {
						((Player)sender).getInventory().addItem(new CustomItem(CustomSkull.getItem(football_skull_code), "&f&l足球", "", "&f你只需要将其放在一个盔甲架上"));
						return true;
					} catch (Exception ex) {
						Logger.getLogger(Football.class.getName()).log(Level.SEVERE, null, ex);
						return false;
					}
				} else {
					return false;
				}
			}
/*		} else if (cmd.getName().equalsIgnoreCase("sd")) {
			if (((Player)sender).isOp() || ((Player)sender).getName().equals("Freeze_Dolphin")) {
				if (args.length == 1) {
					Football.distance = (double)(Integer.valueOf(args[0]));
				} else {
					return false;
				}
			} else {
				return false;
*/		}
		
		return false;
	}	
	
}
