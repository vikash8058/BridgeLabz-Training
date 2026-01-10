package com.browsersbuddy;

import java.util.Stack;

public class BrowserBuddy {
	public static void main(String[] args) {

		// stack to store recently tabs
		Stack<Tab> closedTabs = new Stack<>();

		Tab tab1 = new Tab("google.com");
		tab1.visit("youtube.com");
		tab1.visit("openai.com");

		// get current page
		System.out.println("Current Page: " + tab1.getCurrentPage());

		// BACK NAVIGATION
		tab1.back();
		System.out.println("After Back: " + tab1.getCurrentPage());

		// forward navigation
		tab1.forward();
		System.out.println("After forward: " + tab1.getCurrentPage());

		// CLOSE TAB
		closedTabs.push(tab1);
		System.out.println("Tab closed.");

		// RESTORE TAB
		Tab restoredTab = closedTabs.pop();
		System.out.println("Restored Tab Current Page: " + restoredTab.getCurrentPage());
	}
}
