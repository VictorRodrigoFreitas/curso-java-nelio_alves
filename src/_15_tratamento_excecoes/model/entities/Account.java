package _15_tratamento_excecoes.model.entities;

import _15_tratamento_excecoes.model.exceptions.WithdrawException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public void withDraw(Double amount) throws WithdrawException {
		validateWithdraw(amount);
		balance -= amount;
	}

	private void validateWithdraw(double amount) throws WithdrawException {
		if (amount > withDrawLimit) {
			throw new WithdrawException("The amount exceeds withdraw limit");
		}
		if (getBalance() < amount) {
			throw new WithdrawException("Not enough balance");
		}
	}

}
