package com.palmergames.bukkit.towny.event.economy;

import com.palmergames.bukkit.towny.object.Nation;
import com.palmergames.bukkit.towny.object.economy.transaction.Transaction;
import com.palmergames.bukkit.towny.object.economy.BankAccount;
import org.jetbrains.annotations.Nullable;

/**
 * An event thrown when a {@link Nation} {@link BankAccount} either receives or
 * pays money.
 */
public class NationTransactionEvent extends BankTransactionEvent {

	final Nation nation;
	@Nullable
	final String message;

	/**
	 * An event thrown when a {@link Nation} {@link BankAccount} either receives or
	 * pays money.
	 * 
	 * @param nation      {@link Nation} whose account which is paying or receiving
	 *                    money.
	 * @param transaction {@link Transaction} which has occured.
	 */
	public NationTransactionEvent(Nation nation, Transaction transaction) {
		super(nation.getAccount(), transaction);
		this.nation = nation;
		this.message = null;
	}
	
	public NationTransactionEvent(Nation nation, Transaction transaction, @Nullable String message){
		super(nation.getAccount(), transaction);
		this.nation = nation;
		this.message = message;
	}

	/**
	 * @return {@link Nation}
	 */
	public Nation getNation() {
		return nation;
	}

	/**
	 * @return {@link String}
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return {@link BankAccount} belonging to the nation.
	 */
	public BankAccount getNationBankAccount() {
		return nation.getAccount();
	}
}
