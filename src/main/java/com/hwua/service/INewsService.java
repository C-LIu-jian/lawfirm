package com.hwua.service;

import com.hwua.entity.News;

import java.sql.SQLException;
import java.util.List;

public interface INewsService {
    /**查找所有新闻
     * @return
     * @throws SQLException
     */
    public List<News> getNewsAll();

    /**
     * 根据id获取对象
     * @param id
     * @return
     */
    public News getNewsOne(Integer id) ;
}
