package com.artify;

public class ArtifyApp {
	public static void main(String[] args) {
		
		//creating object for User class
		User vishal=new User("Vishal Yadav",5500);
		User anupam=new User("Anupam",6000);
		
		DigitalArt digitalArtWork=new DigitalArt("Digital Art","Anuj Dwivedi",4000,"Commercial","300*450");
		digitalArtWork.purchase(vishal);
		digitalArtWork.liscence();
		
		System.out.println("------------------------------------------------------------");
		
		PrintArt printArtWork=new PrintArt("Print Art","Raj Yadav",10000,"Personal","450*200");
		printArtWork.purchase(anupam);
		printArtWork.liscence();
		
	}
}
