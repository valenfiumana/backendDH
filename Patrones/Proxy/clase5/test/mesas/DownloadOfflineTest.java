package mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DownloadOfflineTest {
    @Test
    public void downloadSongTest(){
        User user = new User(637372, "Premium");
        DownloadOffline download = new ProxyDownload();
        assertEquals("Downloading song...", download.downloadSong(user));

        User user2 = new User(637372, "free");
        assertEquals("You're not allowed to download a song YOU POOR BASTARD", download.downloadSong(user2));
    }
}