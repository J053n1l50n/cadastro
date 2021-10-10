package com.cadastrao.cadastramento;

import java.util.Objects;

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
	
	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=false)
	private String cpf;
	
	@Column(nullable=false)
	private String escolha1;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "cadastro [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", escolha1=" + escolha1 + ", escolha2="
				+ escolha2 + ", escolha3=" + escolha3 + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf, escolha1, escolha2, escolha3, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		cadastro other = (cadastro) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(escolha1, other.escolha1)
				&& Objects.equals(escolha2, other.escolha2) && Objects.equals(escolha3, other.escolha3)
				&& id == other.id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEscolha1() {
		return escolha1;
	}
	public void setEscolha1(String escolha1) {
		this.escolha1 = escolha1;
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
	
	
}
