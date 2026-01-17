package com.sorting.artexpo;

public class ArtExpoManager {

	//insertion sort
	public void insertArtist(Artist[] artists, int size) {
		for(int i=1;i<size;i++) {
			Artist key=artists[size-1];
			int j=size-2;
			
			while(j>=0 && artists[j].getRegistrationTime()>key.getRegistrationTime()) {
				artists[j+1]=artists[j];
				j--;
			}
			artists[j+1]=key;
		}
	}
	
	public void displayArtists(Artist[] artists, int size) {
		for(int i=0;i<size;i++) {
			System.out.println(artists[i]);
		}
	}
}
