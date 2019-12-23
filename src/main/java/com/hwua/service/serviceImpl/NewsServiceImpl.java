package com.hwua.service.serviceImpl;

import com.hwua.dao.INewsDao;
import com.hwua.dao.daoImpl.NewsDaoImpl;
import com.hwua.entity.News;
import com.hwua.service.INewsService;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class NewsServiceImpl implements INewsService {
    private INewsDao iNewsDao;

    public NewsServiceImpl() {
       iNewsDao =new NewsDaoImpl();
    }
  @Test
    @Override
    public List<News> getNewsAll() {
      try {
          return iNewsDao.getNewsAll();
      } catch (SQLException e) {
          e.printStackTrace();
      }
      return null;
  }

    @Override
    public News getNewsOne(Integer id) {
        try {
            return  iNewsDao.getNewsOne(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        NewsServiceImpl newsService =new NewsServiceImpl();
        List<News> newsAll = newsService.getNewsAll();
        for (int i = 0; i <newsAll.size() ; i++) {
            System.out.println(newsAll.get(i));
        }
    }
}
