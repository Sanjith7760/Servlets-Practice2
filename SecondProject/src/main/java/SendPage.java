

import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class SendPage extends HttpServlet {
      public void service(HttpServletRequest req, HttpServletResponse res) {
    	  // Logic to redirect the already present html page
    	  try {
    		  res.sendRedirect("/SecondProject/dashboard.html");
    	  }
    	  catch (Exception e) {
			e.printStackTrace();
		}
      }
}
