public class VideoMediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void reproduzirVlc(String vclFile) {
        System.out.print("Reproduzindo VLC: " + vclFile);
    }

    @Override
    public void reproduzirMp4(String mp4File) {
        System.out.print("Reproduzindo MP4: " + mp4File);
    }
}
