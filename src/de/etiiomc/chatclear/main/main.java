package de.etiiomc.chatclear.main;

import org.bukkit.plugin.java.JavaPlugin;




public class main extends JavaPlugin {
	
	public void onEnable(){
	    config();
	    System.out.println("§eChatClear v 1.1.3 §f | Enabled!");
		this.getCommand("chat").setExecutor(new ChatClear(getConfig()));
		this.getCommand("silentchat").setExecutor(new ChatClear(getConfig()));
		
	}
	public void config()
	{
		getConfig().options().header("ChatClear v 1.1.3 by etiiomc");
		getConfig().addDefault("ChatClear.silentclear", "§aDer Chat wurde von einem Teammitglied geleert.");
		getConfig().addDefault("ChatClear.clearfirst", "§aDer Chat wurde von ");
		getConfig().addDefault("ChatClear.clearsecond", " gecleart!");
	    getConfig().options().copyDefaults(true);
	    saveConfig();
	 }

}