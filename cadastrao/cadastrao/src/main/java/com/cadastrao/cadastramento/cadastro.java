package com.cadastrao.cadastramento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class cadastro {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private long cpf;
	@Column
	private String esc1;
	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		cadastro other = (cadastro) obj;
		return id == other.id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	

	public String getEsc1() {
		return esc1;
	}
	public void setEsc1(String esc1) {
		this.esc1 = esc1;
	}


	public String getEscolha2() {
		return escolha2;
	}
	public void setEscolha2(String escolha2) {
		this.escolha2 = escolha2;
	}
	public String getEscolha3() {
		return escolha3;
	}
	public void setEscolha3(String escolha3) {
		this.escolha3 = escolha3;
	}
	private String escolha2;
	private String escolha3;
	@Override
	public String toString() {
		return "cadastro [nome=" + nome + ", esc1=" + esc1 + ", escolha2=" + escolha2 + ", escolha3=" + escolha3
				+ "]";
	}
	
}
