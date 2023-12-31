package com.artemnizhnyk.servlet;

import com.artemnizhnyk.service.UserService;
import com.artemnizhnyk.util.StringUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/users")
public class UserServlet extends HttpServlet {
    private final UserService userService = new UserService();
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        userService.getAll().forEach(user -> writer.write("""
                <h1>%d: %s</h`>
                """.formatted(user.id(), StringUtils.trim(user.name()))));
    }
}
