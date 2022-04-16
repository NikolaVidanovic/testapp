package action.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.AbstractAction;
import constants.WebConstant;

public class LogoutAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().removeAttribute("loggedUser");
		return WebConstant.PAGE_LOGOUT;
	}

}
