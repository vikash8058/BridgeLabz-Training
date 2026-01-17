package com.sorting.artexpo;

public class ArtExpoApp {
	public static void main(String[] args) {
		ArtExpoManager manager = new ArtExpoManager();

		Artist[] artists = new Artist[10];
		int size = 0;

		artists[size++] = new Artist("Artist A", 9, 0);
		manager.insertArtist(artists, size);

		artists[size++] = new Artist("Artist B", 9, 15);
		manager.insertArtist(artists, size);

		artists[size++] = new Artist("Artist C", 9, 30);
		manager.insertArtist(artists, size);

		artists[size++] = new Artist("Artist D", 9, 20);
		manager.insertArtist(artists, size);

		System.out.println("Artist Booth Assignment Order:");
		manager.displayArtists(artists, size);

	}
}
