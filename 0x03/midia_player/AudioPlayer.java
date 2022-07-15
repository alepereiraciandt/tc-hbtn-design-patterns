public class AudioPlayer implements MediaPlayer{
    @Override
    public void reproduzir(TipoMedia tipoMedia, String file) {
        System.out.print(String.format("Reproduzindo MP3: %s", file));
    }
}
