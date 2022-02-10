package de.etiiomc.chatclear.main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.configuration.file.FileConfiguration;


public class ChatClear implements CommandExecutor {
	 FileConfiguration cfg;
	  
	 public ChatClear(FileConfiguration config)
	 {
	   this.cfg = config;
	 }
	

	public boolean onCommand(CommandSender sender,Command cmd,String label,String[] args){
		
		if(label.equalsIgnoreCase("chat")){
			if(sender.hasPermission("etiiomc.chatclear.use") && sender instanceof Player && args.length == 0){
			Player player = (Player)sender;
			
			for(int i = 0;i<150;i++){
				Bukkit.broadcastMessage("");
			}
			Bukkit.broadcastMessage(this.cfg.getString("ChatClear.clearfirst") + player.getName() + this.cfg.getString("ChatClear.clearsecond"));
			return true;
			}
		}
		if(label.equalsIgnoreCase("silentchat")) {
			if(sender.hasPermission("etiiomc.chatclear.silent.use") && sender instanceof Player && args.length == 0){
			for(int i = 0;i<150;i++){
				Bukkit.broadcastMessage("");
			}
			Bukkit.broadcastMessage(this.cfg.getString("ChatClear.silentclear"));
			return true;
			}
			
		}
		return false;
	}
}
