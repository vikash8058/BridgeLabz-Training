package com.browsersbuddy;

class HistoryNode{
	String url;
	HistoryNode next;
	HistoryNode prev;
	
	//constructor to initialize history node
	
	HistoryNode(String url){
		this.url=url;
	}
}
public class Tab {
	private HistoryNode head;
	private HistoryNode current;
	
	//open the first page in tab
	public Tab(String url) {
		head=new HistoryNode(url);
		current=head;
	}
	
	//visit new page
	public void visit(String url) {
		HistoryNode newNode=new HistoryNode(url);
		current.next=newNode;
		newNode.prev=current;
		current=newNode;
	}
	
	//method to go back in history
	public void back() {
		if(current.prev!=null) {
			current=current.prev;
		}
		else {
			System.out.println("No previous page is available");
		}
	}
	
	//method to go forward in history
	public void forward() {
		if(current.next!=null) {
			current=current.next;
		}
		else {
			System.out.println("No next page is available");
		}
	}
	
	//method to get current page
	public String getCurrentPage() {
		return current.url;
	}
}
