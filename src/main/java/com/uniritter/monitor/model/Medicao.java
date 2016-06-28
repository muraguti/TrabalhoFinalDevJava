package com.uniritter.monitor.model;

import java.util.Date;

public class Medicao {
	private long id;
	private double valor;
	private Date dataMedicao;
	
	public Medicao(double valor, Date dataMedicao)
	{
		this.valor = valor;
		this.dataMedicao = dataMedicao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getDataMedicao() {
		return dataMedicao;
	}
	public void setDataMedicao(Date dataMedicao) {
		this.dataMedicao = dataMedicao;
	}
}
