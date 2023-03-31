import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta c1 = new Conta(new IdConta("123", "456"), "Ingrid", 19, "ingrid123", "789", 1500 );
		System.out.println(c1);
		
		Conta c2 = new Conta();
		IdConta i1 = new IdConta();
		i1.setCpf("789");
		i1.setRg("0123");
		c2.setId(i1);
		c2.setNome("Caputo");
		c2.setIdade(40);
		c2.setEmail("caputo@gmail.com");
		c2.setNroConta("32");
		c2.setSaldo(1);
		
		System.out.println(c2);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conta");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		
		em.getTransaction().commit();
		
		System.out.println("pronto!");
		em.close(); 
		emf.close();
	}
	
	

}
