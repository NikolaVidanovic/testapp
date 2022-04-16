package listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import domain.User;

public class ContextListener implements ServletContextListener {

    public ContextListener() {
    	
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("Context initialized");
         List<User> loggedusers = new ArrayList<>();
         ServletContext context = sce.getServletContext();
         context.setAttribute("loggedUsers", loggedusers);
    }
	
}
