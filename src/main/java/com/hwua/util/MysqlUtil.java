package com.hwua.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class MysqlUtil {
    public static Connection getConnection(){
        //提供properties文件
        Properties properties = System.getProperties();
        //构建文件对象
        //E:\ideaWorkSpace\WebServerProject\src\main\java\druid.properties
        File file = new File("C:\\Users\\Administrator\\Desktop\\lawFirm\\src\\main\\java\\druid.properties");
        try(FileInputStream fileInputStream = new FileInputStream(file))
        {
            //装载文件对象
            properties.load(fileInputStream);
            //使用Druid的工厂构建数据源
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            //获取连接
            Connection connection = dataSource.getConnection();
            return connection;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
