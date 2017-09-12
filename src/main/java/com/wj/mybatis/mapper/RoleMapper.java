package com.wj.mybatis.mapper;

import com.wj.mybatis.pojo.Role;

import java.util.List;

/**
 * 映射器接口
 */
public interface RoleMapper {
    int insertRole(Role role);

    int insertRoleBackFillGeneratedKey(Role role);

    int deleteRole(Long id);

    int updateRole(Role role);

    Role getRole(Long id);

    Role getRoleUseResultMap(Long id);

    List<Role> findRoles(String roleName);

}
