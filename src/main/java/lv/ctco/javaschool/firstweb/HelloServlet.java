package lv.ctco.javaschool.firstweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User r = new User(request.getParameter("userName"), request.getParameter("userSurname"), Integer.valueOf(request.getParameter("userDate")));
        request.getSession().setAttribute("r", r);
        response.sendRedirect("/hello.jsp");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // it is bad code. But just an example.
        String userSurname = request.getParameter("userSurname");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Test</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>HELLO!" + userSurname + "</h1>");
        out.print("</body>");
        out.print("</html>");
    }
}
