package com.uniritter.monitor.model;

import java.util.ArrayList;
import java.util.Observable;
public class Metrica extends Observable{
	private TipoDeMetrica tipo;
	private ArrayList<Medicao> medicoes;
	private Medicao ultimaMedida;
	
	public Metrica(TipoDeMetrica tipo)
	{
		this.setTipo(tipo);
		this.medicoes = new ArrayList<Medicao>(); 
	}

	public TipoDeMetrica getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeMetrica tipo) {
		this.tipo = tipo;
	}
	
	public Medicao getUltimaMedida() {
		return ultimaMedida;
	}

	public void setUltimaMedida(Medicao ultimaMedida) {
		this.ultimaMedida = ultimaMedida;
	}
	
	public void addMedicao(Medicao medida){
		this.ultimaMedida = medida;
		this.medicoes.add(medida);
		setChanged();
		notifyObservers();
	}
}
