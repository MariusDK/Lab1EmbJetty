import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Start")
public class Start extends HttpServlet
{
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
        }


        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

        {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><head><title>Alege optiunea dorită:</title></head><body>");
            out.println("<form method=\"POST\" action=\"OptiuneServlet\">");
            out.println("<input type=\"radio\" name=\"op\" value=\"1\"> CMMDC <br>");
            out.println("<input type=\"radio\" name=\"op\" value=\"2\"> PRIM <br>");

            out.println("<input type=\"submit\" value=\"Enter\">");
            out.println("</form></body></html>");
            out.close();
        }

        }