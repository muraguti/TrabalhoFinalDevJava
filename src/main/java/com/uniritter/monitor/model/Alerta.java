package com.uniritter.monitor.model;

import java.util.Observable;
import java.util.Observer;

public class Alerta implements Observer{
	
	private Metrica metrica;
	private IRegra regra;
	
	public Alerta(Metrica metrica, IRegra regra)
	{
		this.metrica = metrica;
		this.regra = regra;
	}

	public void update(Observable obs, Object obj) {
		if(obs == this.metrica)
		{
			this.EnviaNotificacao(this.regra.TestaRegra(this.metrica));
		}
	}

	private void EnviaNotificacao(Notificacao notificacao) {
		if(notificacao != null){
			//envia notificacao
		}
	}
}
