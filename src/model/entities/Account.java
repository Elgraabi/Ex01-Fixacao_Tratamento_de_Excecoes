package model.entities;

import model.exceptions.DomainExceptions;

public class Account {
	
	// Atributos
	private Integer number;
	private String holde;
	private Double balance;
	private Double withdrawLimit;
	
	// Metodos Especificos
	public void deposit(Double amount) {
		
	}
	
	public void withdraw(Double amount) throws DomainExceptions {
		if (!(this.balance > 0 && amount <= this.withdrawLimit)) {
			throw new DomainExceptions("Withdraw error: The amount exceeds withdraw limit");
		} else {
			if (amount <= this.balance) {
				this.balance -= amount;
			} else {
				throw new DomainExceptions("Withdraw error: Not enough balance");
			}
		}
	}
	
	// Metodos Espciais
	public Account() {
		super();
	}

	public Account(Integer number, String holde, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holde = holde;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolde() {
		return holde;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	
}
