package persistance.managerFactory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyEntityManagerFactory {

	
	private static MyEntityManagerFactory instance;
	private static EntityManagerFactory factory;
	
	private MyEntityManagerFactory() {
		factory = Persistence.createEntityManagerFactory("testapp");
	}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if(instance==null) {
			instance= new MyEntityManagerFactory();
		}
		return instance.factory;
	}
	
	public static void closeEntityManagerFactory() {
		if (instance!=null) instance.factory.close();
	}
	
}
