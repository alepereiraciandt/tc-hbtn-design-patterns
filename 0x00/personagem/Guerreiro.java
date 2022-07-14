public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, TipoPersonagem.GUERREIRO, inteligencia, forca, vigor, resistencia, destreza);

        if (getForca() < getInteligencia() || getForca() < getDestreza()) {
            throw new IllegalArgumentException("Atributos invalidos para GUERREIRO.");
        }
    }

    @Override
    Double getDanoAtaque() {
        return (getForca() * 0.8) + (getVigor() * 0.05) + (getDestreza() * 0.1) + (getInteligencia() * 0.05);
    }
}