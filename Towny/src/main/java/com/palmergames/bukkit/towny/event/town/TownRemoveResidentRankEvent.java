package com.palmergames.bukkit.towny.event.town;

import com.palmergames.bukkit.towny.event.CancellableTownyEvent;
import com.palmergames.bukkit.towny.object.Resident;
import com.palmergames.bukkit.towny.object.Town;
import com.palmergames.bukkit.towny.object.Translation;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * @author Artuto
 *
 *         Fired after a Resident has been removed from a Town rank.
 */
public class TownRemoveResidentRankEvent extends CancellableTownyEvent {
	private static final HandlerList HANDLER_LIST = new HandlerList();
	
	private final Resident resident;
	private final String rank;
	private final Town town;

	public TownRemoveResidentRankEvent(Resident resident, String rank, Town town) {
		this.resident = resident;
		this.rank = rank;
		this.town = town;
		setCancelMessage(Translation.of("msg_err_command_disable"));
	}

	/**
	 *
	 * @return the resident that got removed the rank
	 */
	public Resident getResident() {
		return resident;
	}

	/**
	 *
	 * @return the removed rank
	 */
	public String getRank() {
		return rank;
	}

	/**
	 *
	 * @return the town this resident is part of
	 */
	public Town getTown() {
		return town;
	}

	public static HandlerList getHandlerList() {
		return HANDLER_LIST;
	}

	@NotNull
	@Override
	public HandlerList getHandlers() {
		return HANDLER_LIST;
	}
}