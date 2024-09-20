package entidades;

import java.time.LocalDateTime;

public class ContratoPorHora {
	
	private LocalDateTime data;
	private double valorPorHora;
	private Integer horas;
	
	public ContratoPorHora() {
		
	}
	
	public ContratoPorHora(LocalDateTime data, double valorPorHora, Integer horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	
	
	public double valorTotal() {
		return valorPorHora * horas;
	}
	
	
	
}
