import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Validator")
public class ValidatorCMMDC extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getRequest(request,response);
    }
    private void getRequest(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        int unu = 0;
        int doi = 0;
        boolean ok = true;
        try {
            unu = Integer.parseInt(request.getParameter("Number 1"));

        }
        catch (Exception e)
        {
            e.printStackTrace();
            ok = false;
        }
        try {
            doi = Integer.parseInt(request.getParameter("Number 2"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            ok =false;
        }

        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        if((ok == false)||((unu<0)||(doi<0)))
        {
            RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("OptiuneServlet");
            requestDispatcher1.include(request,response);
            printWriter.append("<font color='red'><b>Eroare numarul introdus nu este valid!</b></fond> ");
        }
        else
        {
            //response.sendRedirect("Cmmdc");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("Cmmdc");
            System.out.println(requestDispatcher);
            requestDispatcher.forward(request,response);
        }
        printWriter.close();


    }
}
