package org.example.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Objects;

@WebServlet("/controller")
public class ControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            String x = req.getParameter("X");
            String y = req.getParameter("Y");
            String r = req.getParameter("R");
            log(String.format("x: %s, y: %s, r: %s", x, y, r));
            if (Objects.isNull(r) || Objects.isNull(x) ||  Objects.isNull(y) ||
                    r.isBlank() || x.isBlank() || y.isBlank()) {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
                dispatcher.forward(req, resp);
            } else {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/area-check");
                dispatcher.forward(req, resp);
            }

        } catch (IOException | ServletException e) {
            log(e.getMessage());
            e.printStackTrace();
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

}