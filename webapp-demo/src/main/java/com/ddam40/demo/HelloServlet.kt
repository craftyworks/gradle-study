package com.ddam40.demo

import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(name = "HelloServlet", urlPatterns = ["/hello"], loadOnStartup = 1)
class HelloServlet : HttpServlet(){
    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
        resp.writer.print("Hello, World!")
    }

    override fun doPost(req: HttpServletRequest, resp: HttpServletResponse) {
        var name: String? = req.getParameter("name")
        if(name == null) name = "World"
        req.setAttribute("user", name)
        req.getRequestDispatcher("response.jsp").forward(req, resp)
    }
}