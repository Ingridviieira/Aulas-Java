import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity

public class Conta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdConta id;
	private String nome;
	private int idade;
	private String email;
	private String nroConta;
	private double saldo;
	
	
	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Conta(IdConta id, String nome, int idade, String email, String nroConta, double saldo) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.nroConta = nroConta;
		this.saldo = saldo;
	}


	public IdConta getId() {
		return id;
	}


	public void setId(IdConta id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNroConta() {
		return nroConta;
	}


	public void setNroConta(String nroConta) {
		this.nroConta = nroConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		return "Conta [id=" + id + ", nome=" + nome + ", idade=" + idade + ", email=" + email + ", nroConta=" + nroConta
				+ ", saldo=" + saldo + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nroConta == null) ? 0 : nroConta.hashCode());
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nroConta == null) {
			if (other.nroConta != null)
				return false;
		} else if (!nroConta.equals(other.nroConta))
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
	
	public void sacar() {
		
	}
	
	public void depositar(){
		
	}
	
}
