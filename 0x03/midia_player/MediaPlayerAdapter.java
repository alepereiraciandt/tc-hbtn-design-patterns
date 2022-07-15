public class MediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia) {
        this.advancedMediaPlayer = new VideoMediaPlayer();
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String file) {
        System.out.print("Reproduzindo MP4: " + file);
    }
}
