package com.massivecraft.massivecore.cmd.arg;

import org.bukkit.command.CommandSender;

import com.massivecraft.massivecore.store.SenderIdSourceMixinAllSenderIds;
import com.massivecraft.massivecore.util.IdUtil;

public class ARSender extends ARSenderIdAbstract<CommandSender>
{
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static final ARSender i = new ARSender();
	public static ARSender get() { return i; }
	private ARSender()
	{
		super(SenderIdSourceMixinAllSenderIds.get(), true, false);
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public CommandSender getResultForSenderId(String senderId)
	{
		// Null check is done in IdUtil
		return IdUtil.getSender(senderId);
	}

}
