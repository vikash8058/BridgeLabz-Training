package com.eventease;

// Interface defining scheduling actions
public interface ISchedulable {

	void schedule();

	void reschedule(String newDate);

	void cancel();
}
