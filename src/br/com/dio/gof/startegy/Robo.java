package br.com.dio.gof.startegy;

public class Robo {
	private comportamento comportamento;

	public void setComportamento(comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
		
	public void mover() {
		comportamento.mover();
	}
}
