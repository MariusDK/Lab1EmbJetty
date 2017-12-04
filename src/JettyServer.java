import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletHandler;

public class JettyServer {
        public static void main(String[] args) throws Exception {
            Server server = new Server(8080);
            ServletHandler handler = new ServletHandler();
            server.setHandler(handler);

            handler.addServletWithMapping(Start.class, "/Start");
            handler.addServletWithMapping(Cmmdc.class, "/Cmmdc");
            handler.addServletWithMapping(OptiuneServlet.class, "/OptiuneServlet");
            handler.addServletWithMapping(Prim.class, "/Prim");
            handler.addServletWithMapping(ValidatorCMMDC.class, "/ValidatorCMMDC");
            handler.addServletWithMapping(ValidatorPrim.class, "/ValidatorPrim");


            System.out.println("Start server jetty embedded");
            server.start();
            server.join();
//            // Create Server
//            Server server = new Server(8080);
//
//            // Configure ResourceHandler
//            ResourceHandler resource_handler = new ResourceHandler();
//            resource_handler.setDirectoriesListed(true);
//            resource_handler.setWelcomeFiles(new String[] { "index.jsp" });
//            resource_handler.setResourceBase("./web");
//
//            // Add the ResourceHandler to the server.
//            HandlerList handlers = new HandlerList();
//            handlers.setHandlers(new Handler[] { resource_handler });
//            server.setHandler(handlers);

            // Start the server
            server.start();
            server.join();

        }
    }

