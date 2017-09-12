package com.wj.mybatis.main;


import com.wj.mybatis.mapper.RoleMapper;
import com.wj.mybatis.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * 程序入口,拥有main方法
 */
public class Chapter3Main {
    public static void main(String[] args) {
        // Logger log = Logger.getLogger(Chapter3Main.class);
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            SqlSession sqlSession2 = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            RoleMapper roleMapper2 = sqlSession2.getMapper(RoleMapper.class);
            //插入用户测试开始
            // Role role = roleMapper.getRole(1L);
            // sqlSession.commit();
            // Role role2 = roleMapper2.getRole(1L);
            // sqlSession.commit();
            /*Role roleUseResultMap = roleMapper.getRoleUseResultMap(1L);
            log.info("roleName = "+role.getRoleName());
            log.info("roleNameUseResultMap = "+role.getRoleName());*/
            //插入用户测试结束

            //主键回填测试开始
            /*Role role = new Role();
            role.setRoleName("role_name_test");
            role.setNote("note_test");
            roleMapper.insertRoleBackFillGeneratedKey(role);
            log.info("backFillGeneratedKeyValue = " + role.getId());
            sqlSession.commit();*/
            //主键回填测试结束

            /* 测试级联开始 ***************/
            /*EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.getEmployee(1L);
            log.info(employee.getBirthday());
            sqlSession.commit();
            log.info("在获取一次。。。");
            Employee employee2 = employeeMapper.getEmployee(1L);
            sqlSession.commit();*/
            /*测试级联结束 ***************/
            System.out.println();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
