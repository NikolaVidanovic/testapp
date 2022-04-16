package persistance.repository;

import javax.persistence.EntityManager;

import domain.User;
import persistance.managerFactory.MyEntityManagerFactory;

public class UserRepository {

	public static User getByUsername(String username) {
		EntityManager manager = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		User user = manager.find(User.class, username);
		manager.close();
		return user;
	}
}
