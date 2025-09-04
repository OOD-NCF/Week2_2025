public class Main {
    public static void main(String[] args) {
        // Create a Rock playlist
        Playlist rockPlaylist = new RockPlaylist("My Favorite Rock Songs");
        rockPlaylist.addSong("Bohemian Rhapsody - Queen");
        rockPlaylist.addSong("Stairway to Heaven - Led Zeppelin");
        rockPlaylist.playAll();

        // Create a Pop playlist
        Playlist popPlaylist = new PopPlaylist("Top Pop Hits");
        popPlaylist.addSong("Dynamite - BTS");
        popPlaylist.addSong("Blinding Lights - The Weeknd");
        popPlaylist.playAll();


    }
}
