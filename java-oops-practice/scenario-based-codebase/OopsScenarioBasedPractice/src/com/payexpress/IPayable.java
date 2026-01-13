package com.payexpress;

public interface IPayable {

	void pay(boolean isLate);
	void sendReminder();
}
