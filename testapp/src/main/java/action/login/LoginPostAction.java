package action.login;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.AbstractAction;
import constants.WebConstant;
import domain.User;
import persistance.repository.UserRepository;

public class LoginPostAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {

		User user = login(request);
		List<User> loggedUsers = (List<User>) request.getServletContext().getAttribute("loggedUsers");

		if (user != null && !(loggedUsers.contains(user))) {
			HttpSession session = request.getSession(true);

			session.setAttribute("loggedUser", user);
			loggedUsers.add(user);
			return WebConstant.PAGE_HOME;
		} else {
			request.setAttribute("error_message", "Korisnik ne postoji!");
			return WebConstant.PAGE_LOGIN;
		}
	}

	private User login(HttpServletRequest request) {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = UserRepository.getByUsername(username);
		if (user != null) {
			if (user.getPassword().equals(password) && user.getUsername().equals(username))
				return user;
			return null;

		}
		return null;
	}

}
