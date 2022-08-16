package mesas;

public class ProxyDownload implements DownloadOffline{
    private RealDownload downloader;

    public ProxyDownload() {
        this.downloader = new RealDownload();
    }

    @Override
    public String downloadSong(User user) {
        if(user.getType().equalsIgnoreCase("Premium")){
            return downloader.downloadSong(user);
        }
        else{
            return "You're not allowed to download a song YOU POOR BASTARD";
        }
    }
}
