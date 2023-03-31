import java.io.Serializable;
import javax.persistence.Embeddable;



@Embeddable	
public class IdConta implements Serializable {
	private static final long serialVersionUID = 1L;

	private String rg;
	private String cpf;
	
	
	public IdConta(String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}
	public IdConta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "IdConta [rg=" + rg + ", cpf=" + cpf + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
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
		IdConta other = (IdConta) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		return true;
	}
	
	

}
