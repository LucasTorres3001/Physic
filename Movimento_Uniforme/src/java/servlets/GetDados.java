package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "GetDados", urlPatterns = {"/GetDados"})
public class GetDados extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String Vo_txt,a_txt,S_txt,m_txt;
        
        Vo_txt = request.getParameter("velocidade");
        a_txt = request.getParameter("aceleracao");
        S_txt = request.getParameter("distancia");
        m_txt = request.getParameter("massa");
        
        double Vel,Acceleration,Space,mass;
        
        Vel = Double.parseDouble(Vo_txt);
        Acceleration = Double.parseDouble(a_txt);
        Space = Double.parseDouble(S_txt);
        mass = Double.parseDouble(m_txt);
        
        request.setAttribute("Velocy", Vel);
        request.setAttribute("Aceleracao", Acceleration);
        request.setAttribute("Space", Space);
        request.setAttribute("Mass", mass);
        
        request.getRequestDispatcher("indexII.jsp").forward(request, response);
    }
}
