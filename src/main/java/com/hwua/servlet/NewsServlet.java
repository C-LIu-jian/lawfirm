package com.hwua.servlet;

import com.google.gson.Gson;
import com.hwua.entity.News;
import com.hwua.service.INewsService;
import com.hwua.service.serviceImpl.NewsServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class NewsServlet extends HttpServlet {
    private INewsService iNewsService;
    private Gson gson;
    @Override
    public void init() throws ServletException {
         iNewsService = new NewsServiceImpl();
         gson =new Gson();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request,response);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        System.out.println("html");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String param = request.getParameter("param");

        if ("newsAll".equals(param)){
            List<News> lists = iNewsService.getNewsAll();
           if (lists !=null && lists.size() >0){
               String json = gson.toJson(lists);
              response.getWriter().print(json);
           }


        }else if ("newsAllId".equals(param)){
            System.out.println("111");
            String id =request.getParameter("id");
            int i = Integer.parseInt(id);
            News news = iNewsService.getNewsOne(i);
            if (news != null){
                String json = gson.toJson(news);
                response.getWriter().print(json);
            }
        }





    }

}
