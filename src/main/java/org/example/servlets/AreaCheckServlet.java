package org.example.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.models.HtmlTable;
import org.example.models.Parameters;
import org.example.utils.Validator;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/area-check")
public class AreaCheckServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            Parameters parameters = new Parameters()
                    .buildX(req.getParameter("X"))
                    .buildY(req.getParameter("Y"))
                    .buildR(req.getParameter("R"));
            log(String.format("x: %s, y: %s, r: %d",
                    parameters.getX(), parameters.getY(), parameters.getR()));
            HtmlTable htmlTable = new HtmlTable(parameters);
            HttpSession session = req.getSession();
            String pointHash = String.valueOf(htmlTable.hashCode());
            session.setAttribute(pointHash, htmlTable);
        } catch (Validator.InvalidArgumentException | NumberFormatException e) {
            log("areacheck1");
            e.printStackTrace();
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/check-result.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (IOException | ServletException e) {
            log("areacheck2");
            e.printStackTrace();
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }

    }

}