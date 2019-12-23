package com.hwua.dao.daoImpl;

import com.hwua.dao.ApplyDao;
import com.hwua.util.MysqlUtil;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;

public class ApplyDaoImpl implements ApplyDao {
    private Connection connection = MysqlUtil.getConnection();

    @Override
    public int insert() {
       String sql = "insert into apply_for (name,mobile,qq,trademak_name,items_applicatio,file_path,applyfor_date)";

        QueryRunner queryRunner = new QueryRunner();
        return 0;
    }
}
