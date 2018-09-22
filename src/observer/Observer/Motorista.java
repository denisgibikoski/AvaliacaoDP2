package Observer;

public class Motorista implements Observador {

    String nome;

    public Motorista(String nome, Observado obs) {
        this.nome = nome;
        obs.incluirObservador(this);
    }

    @Override
    public void update(String texto) {
        System.out.println(this.nome + ", motorista do dia, saiu para entrega em " + texto);

    }

}
