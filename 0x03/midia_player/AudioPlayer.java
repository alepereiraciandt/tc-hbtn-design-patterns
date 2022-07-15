public class AudioPlayer implements MediaPlayer{
    @Override
    public void reproduzir(TipoMedia tipoMedia, String file) {
        if (tipoMedia.equals(TipoMedia.VLC)) {
            System.out.print(String.format("Reproduzindo VLC: %s", file));
        } else {
            System.out.print(String.format("Reproduzindo MP3: %s", file));
        }
    }
}
