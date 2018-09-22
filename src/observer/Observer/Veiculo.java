
package observer.Observer;

import Observer.Observado;
import Observer.Observador;
import java.util.ArrayList;
import java.util.List;


public class Veiculo implements Observado{
    
    	private List<Observador> observadores;
	private List<String> saidas;
	
	public Veiculo() {
		this.observadores = new ArrayList<>();
		this.saidas = new ArrayList<>();
	}
	
	public void receberSaida(String saida) {
		this.saidas.add(saida);
		this.notificarObservadores();
	}

	@Override
	public void incluirObservador(Observador obs) {
		this.observadores.add(obs);
		
	}

	@Override
	public void removerObservador(Observador obs) {
		int indice = this.observadores.indexOf(obs);
		if (indice >= 0) {
			this.observadores.remove(obs);
		}
	}

	@Override
	public void notificarObservadores() {
		for (Observador observador : observadores) {
			observador.update(this.saidas.get(this.saidas.size()-1));
		}
		
	}
    
}
