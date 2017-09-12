package com.wj.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 一个工具类，用于创建SqlSessionFactory和获取SqlSession对象
 */
public class SqlSessionFactoryUtils {
    private final static Class<SqlSessionFactoryUtils> LOCK = SqlSessionFactoryUtils.class;

    private static SqlSessionFactory SqlSessionFactory = null;

    private SqlSessionFactoryUtils(){
    }
    // 获取Sql会话工厂（可以理解为数据库连接池）
    public static SqlSessionFactory getSqlSessionFactory(){
        synchronized (LOCK){
            if (SqlSessionFactory != null) {
                return SqlSessionFactory;
            }
            String resource = "mybatis-config.xml";
            InputStream inputStream;
            try{
                inputStream = Resources.getResourceAsStream(resource);
                SqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e){
                e.printStackTrace();
                return null;
            }
            return SqlSessionFactory;
        }
    }
    // 通过工厂打开Sql会话（可以理解为建立一个数据库连接）
    public static SqlSession openSqlSession(){
        if (SqlSessionFactory == null) {
            getSqlSessionFactory();
        }
        return SqlSessionFactory.openSession();
    }

}
