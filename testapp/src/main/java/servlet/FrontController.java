package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ApplicationController;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ApplicationController applicationController;
 
    public FrontController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	public void init() throws ServletException {
		super.init();
		applicationController=new ApplicationController();
	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = applicationController.processRequest(request, response);
		if(request.getAttribute("loggedUser")==null) {
			page="/WEB-INF/pages/forbiden.jsp";
		}
		request.getRequestDispatcher(page).forward(request, response);
	}

}