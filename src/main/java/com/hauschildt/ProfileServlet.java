/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hauschildt;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author k0519415
 */
@WebServlet(name = "ProfileServlet", urlPatterns = {"/profile"})
public class ProfileServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = new User();
        user.setUserId(19384L);
        user.setUsername("Coder314");
        user.setFirstName("John");
        user.setLastName("Smith");

        Map<String, Boolean> permissions = new Hashtable<>();
        permissions.put("active", true);
        permissions.put("editor", true);
        permissions.put("admin", false);
        permissions.put("super-admin", false);
        user.setPermissions(permissions);
        
        request.setAttribute("user", user);
        
        User[] usersArr = {user}; 
        request.setAttribute("usersArr", usersArr);

        List<User> usersList = new ArrayList<>();
        usersList.add(user);
        request.setAttribute("usersList", usersList);

        String fullName = user.getFirstName() + " " + user.getLastName(); 
        request.setAttribute("fullName", fullName);

        LocalDateTime currentDate = LocalDateTime.now(); 
        request.setAttribute("currentYear", currentDate.getYear());
        
//        Map<Long, Character> vowels = new HashMap<>();
//        vowels.put(1L, 'A');
//        vowels.put(2L, 'E');
//        vowels.put(3L, 'I');
//        vowels.put(4L, 'O');
//        vowels.put(5L, 'U');
//        request.setAttribute("vowels", vowels);
        
//        char[] vowels = { 'A', 'E', 'I', 'O', 'U'};
//        request.setAttribute("vowels", vowels);

        List<Character> vowels = new ArrayList<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        request.setAttribute("vowels", vowels);
        
        request.getRequestDispatcher("/WEB-INF/jsp/view/profile.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
