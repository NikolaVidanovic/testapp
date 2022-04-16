package actionfactory;

import action.AbstractAction;
import action.home.HomeAction;
import action.login.LoginGetAction;
import action.login.LoginPostAction;
import action.login.LogoutAction;
import constants.WebConstant;
import proizvodjacAction.CreateActionProizvodjac;
import proizvodjacAction.DeleteByIdAction;
import proizvodjacAction.FindAllAction;
import proizvodjacAction.FindByIdAction;

public class ActionFactory {

	public static AbstractAction createAction(String method, String path) {
		AbstractAction action = null;
		
		switch (path) {
		case WebConstant.PATH_LOGIN:
			if (method.equalsIgnoreCase("GET")) action = new LoginGetAction();
			if (method.equalsIgnoreCase("POST")) action = new LoginPostAction();
			break;
		case WebConstant.PATH_PROIZVODJAC_FINDALL: action = new FindAllAction();
			break;
		case WebConstant.PATH_PROIZVODJAC_FINDBYID: action = new FindByIdAction();
		break;
		case WebConstant.PATH_PROIZVODJAC_CREATE: action = new CreateActionProizvodjac();
		break;
		case WebConstant.PATH_PROIZVODJAC_DELETE: action = new DeleteByIdAction();
		break;
		case WebConstant.PATH_HOME: action = new HomeAction();
		break;
		case WebConstant.PATH_LOGOUT: action = new LogoutAction();
		break;
		default:
			break;
		}
		return action;
	}

}