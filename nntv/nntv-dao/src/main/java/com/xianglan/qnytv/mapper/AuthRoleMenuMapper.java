package com.xianglan.qnytv.mapper;

import com.xianglan.qnytv.domain.auth.AuthRoleMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Set;

@Mapper
public interface AuthRoleMenuMapper {

    List<AuthRoleMenu> getAuthRoleMenusByRoleIds(Set<Long> roleIdSet);
}