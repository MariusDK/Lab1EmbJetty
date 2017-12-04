import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cmmdc")
public class Cmmdc extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
getRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
getRequest(request,response);
    }
    private void getRequest(HttpServletRequest request,HttpServletResponse response) throws IOException {

      System.out.println("NUll");
       int unu = Integer.parseInt(request.getParameter("Number 1"));
       int doi = Integer.parseInt(request.getParameter("Number 2"));
       Algoritm algoritm = new Algoritm();
       int cmmdc = algoritm.cmmdc(unu,doi);

       response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("Cel mai mare divizor comun al numerelor "+unu+" si "+ doi+" este: "+ cmmdc);
        printWriter.close();
    }
}
