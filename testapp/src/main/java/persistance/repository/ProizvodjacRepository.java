package persistance.repository;

import java.util.List;

import javax.persistence.EntityManager;

import domain.Mesto;
import domain.Proizvodjac;
import persistance.managerFactory.MyEntityManagerFactory;

public class ProizvodjacRepository {

	public static List<Proizvodjac> getAllProizvodjac() {
		EntityManager manager = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		List<Proizvodjac> listaProizvodjaca = manager.createNativeQuery("select * from proizvodjac",Proizvodjac.class).getResultList();
		manager.close();
		return listaProizvodjaca;
	}
	
	public static Proizvodjac getByIdProizvodjac(Long id) {
		EntityManager manager = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		Proizvodjac proizvodjac = manager.find(Proizvodjac.class, id);
		manager.close();
		return proizvodjac;
	}
	
	public static Proizvodjac saveOrUpdateProizvodjac(Long pib, String maticniBroj, String adresa, Long pttBroj) {
		EntityManager manager = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		Mesto mesto = manager.find(Mesto.class, pttBroj);
		Proizvodjac proizvodjac = new Proizvodjac(pib,maticniBroj,adresa,mesto);
		
		manager.getTransaction().begin();
		
		Proizvodjac context = manager.merge(proizvodjac);
		
		manager.getTransaction().commit();
		manager.close();
		
		return proizvodjac;
	}
	
	public static boolean deleteByIdProizvodjac(Long id) {
		EntityManager manager = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		Proizvodjac proizvodjac = manager.find(Proizvodjac.class, id);
		if(proizvodjac==null) {
			return false;
			}
		
		manager.getTransaction().begin();
		manager.remove(proizvodjac);
		manager.getTransaction().commit();
		
		manager.close();
		return true;
	}
	
}
