import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ValidatorPrim")
public class ValidatorPrim extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getRequest(request,response);
    }
    private void getRequest(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        int numar = 0;
        boolean ok = true;
        try {
            numar = Integer.parseInt(request.getParameter("Number"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            ok=false;
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Prim");
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        if ((ok == false)||(numar<0))
        {
            RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("/PRIM.html");
            requestDispatcher1.include(request,response);
            printWriter.append("<font color='red'><b>Eroare numarul introdus nu este valid!</b></fond> ");
        }
        else
        {
            requestDispatcher.forward(request,response);
        }
        printWriter.close();


    }
}

