package com.hwua.dao.daoImpl;

import com.hwua.dao.INewsDao;
import com.hwua.entity.News;
import com.hwua.util.MysqlUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**新闻dao层
 * @author Administrator
 */
public class NewsDaoImpl implements INewsDao {
    private QueryRunner runner;
    private Connection connection;

    public NewsDaoImpl() {
        runner = new QueryRunner();
        connection= MysqlUtil.getConnection();
    }

    /**
     * 查找新闻标题
     * @return
     */
    @Override
    public List<News> getNewsAll() throws SQLException {
        String sql ="select id,name,text_name from news limit 0,3";
         return runner.query(connection, sql, new BeanListHandler<News>(News.class));
    }

    @Override
    public News getNewsOne(Integer id) throws SQLException {
        String sql ="select * from news where id = ? ";
       return runner.query(connection,sql,new BeanHandler<News>(News.class),id);
    }
}
