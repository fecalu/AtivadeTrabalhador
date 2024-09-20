package entidades;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkLevel;

public class Trabalhador {
	
	private String nome;
	private WorkLevel nivel;
	private double baseSalarial;
	
	private Departamento departamento;
	private List <ContratoPorHora> contratos = new ArrayList<>();
	
	public Trabalhador() {
		
	}
	
	public Trabalhador(String nome, WorkLevel nivel, double baseSalarial, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.baseSalarial = baseSalarial;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public WorkLevel getNivel() {
		return nivel;
	}

	public void setNivel(WorkLevel nivel) {
		this.nivel = nivel;
	}

	public double getBaseSalarial() {
		return baseSalarial;
	}

	public void setBaseSalarial(double baseSalarial) {
		this.baseSalarial = baseSalarial;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoPorHora> getContrato() {
		return contratos;
	}


	
	
	
	public void addContrato(ContratoPorHora contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}
	
	
	public double renda(Integer ano, Integer mes) {
		double soma = baseSalarial;
		
		for (ContratoPorHora cph : contratos) {
			int c_ano = cph.getData().getYear();
			int c_mes = cph.getData().getMonthValue();
		if (ano == c_ano && mes == c_mes) {
				soma += cph.valorTotal(); 
			}
		}
		return soma;
	}
	
}
