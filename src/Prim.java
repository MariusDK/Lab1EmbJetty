import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Prim")
public class Prim extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getRequest(request,response);
    }
    private void getRequest(HttpServletRequest request,HttpServletResponse response) throws IOException {
        int numar = Integer.parseInt(request.getParameter("Number"));
        Algoritm algoritm = new Algoritm();
        boolean verificarePrim = algoritm.prim(numar);

        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        if (verificarePrim==true) {
            printWriter.println("Numarul " + numar + " este prim");
        }
        else
        {
            printWriter.println("Numarul " + numar + " nu este prim");
        }
        printWriter.close();
    }
}
