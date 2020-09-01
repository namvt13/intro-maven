package com.apress.gswmbook.web.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/status")
public class AppStatusServlet extends HttpServlet {
	@Override
	public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
		final PrintWriter writer = response.getWriter();
		writer.println("OK");
		response.setStatus(response.SC_OK);
	}
}