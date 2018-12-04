/*
package com.yootk.Rent.work3.work3.Control;

import com.yootk.Rent.work3.work3.Service.Rent;
import com.yootk.Rent.work3.work3.Service.TransferService;
import com.yootk.Rent.work3.work3.Service.TransferServiceMain;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "transfer",urlPatterns = "/transfer")
public class transfer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
      String from=request.getParameter("from");
      String to=request.getParameter("to");
      String money=request.getParameter("money");
      int money1 =Integer.parseInt(money);
        Rent rent=new Rent();

        try {
            if(rent.Main().transfer(from,to,money1)) {
                response.getWriter().println("转账成功");
            }else{
                response.getWriter().println("转账失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
*/
