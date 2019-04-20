/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.Freeze_Dolphin.football;

import football.commands.Commands;
import football.listeners.Listeners;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Freeze_Dolphin <colour-blue@outlook.com>
 */
public final class Football extends JavaPlugin {
	
	public static double distance = 3.5;
	
	@Override
	public void onEnable() {
		this.getLogger().info("足球插件正在启动");
		this.getLogger().info("插件原创 作者：Freeze_Dolphin");
		getServer().getPluginManager().registerEvents(new Listeners(), this);
		this.getCommand("gfb").setExecutor(new Commands(this));
		this.getLogger().info("注册指令及监听");
	}
	
	@Override
	public void onDisable() {
		this.getLogger().info("足球插件正在卸载");
	}

}