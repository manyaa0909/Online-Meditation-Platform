package com.example.meditation;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

public class mediServlet extends HttpServlet {

    private mediServiceImpl mediService;

    @Override
    public void init() throws ServletException {
        // Initialize the MediDao instance (replace with your implementation)
        mediDao mediDao = (com.example.meditation.mediDao) new JdbcmediDao(); // JdbcMediDao implements MediDao

        // Initialize the MediService with the MediDao
        mediService = new mediServiceImpl(mediDao);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Forward to a page for displaying session information or forms for adding new sessions
        request.getRequestDispatcher("/meditation_session_form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get parameters from the form submission (user input)
        int userId = Integer.parseInt(request.getParameter("userId"));
        String sessionType = request.getParameter("sessionType");
        double duration = Double.parseDouble(request.getParameter("duration"));
        String notes = request.getParameter("notes");

        // Create a new MeditationSession object based on user input
        MeditationSession session = new MeditationSession();
        session.setNotes(notes);

        // Save the meditation session using the MediService
        ((Object) mediService).saveSession(session);

        // Redirect to a success page or display a confirmation message
        response.sendRedirect("meditation_success.jsp");
    }
}
