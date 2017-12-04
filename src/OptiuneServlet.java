import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OptiuneServlet")
public class OptiuneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
getRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
getRequest(request,response);
    }
    private void getRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        String op = request.getParameter("op");
        System.out.println(op);
        RequestDispatcher Dispatcher = request.getRequestDispatcher("/CMMDC.html");
        if (op.equals("1"))
        {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><head><title>Calculator: calculeaza cmmdc, cel mai mare divizor comun </title></head><body>");
            out.println("<form method=\"POST\" action=\"ValidatorCMMDC\">");
            out.println("Numarul 1: <input type=\"text\" name=\"Number 1\" /> <br>");
            out.println("Numarul 2: <input type=\"text\" name=\"Number 2\"><br>");

            out.println("<input type=\"submit\" value=\"Calculeaza\">");
            out.println("</form></body></html>");
            out.close();
            //Dispatcher.forward(request,response);
        }
        if (op.equals("2"))
        {
            RequestDispatcher Dispatcher2 = request.getRequestDispatcher("/PRIM.html");
            Dispatcher2.forward(request,response);
        }

    }
}
