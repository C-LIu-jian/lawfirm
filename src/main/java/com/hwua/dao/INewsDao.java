package com.hwua.dao;

import com.hwua.entity.News;

import java.sql.SQLException;
import java.util.List;

/**新闻接口
 * @author Administrator
 */
public interface INewsDao {

    /**查找所有新闻
     * @return
     * @throws SQLException
     */
   public List<News> getNewsAll() throws SQLException;

    /**
     * 根据id获取对象
     * @param id
     * @return
     */
    News getNewsOne(Integer id) throws SQLException;
}
