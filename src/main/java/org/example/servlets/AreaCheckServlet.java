package org.example.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.models.HtmlTable;
import org.example.utils.Validator;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/area-check")
public class AreaCheckServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            double start = System.nanoTime();
            Integer r = Integer.parseInt(req.getParameter("R"));
            Integer x = Integer.parseInt(req.getParameter("X"));
            Double y = Double.parseDouble(req.getParameter("Y"));
            log(String.format("x: %s, y: %s, r: %d", x, y, r));
            HtmlTable point = new HtmlTable(r, x, y, LocalDateTime.now(), (System.nanoTime() - start) / 1_000_000.0);
            HttpSession session = req.getSession();
            String pointHash = String.valueOf(point.hashCode());
            session.setAttribute(pointHash, point);
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