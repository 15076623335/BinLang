package com.xianglan.qnytv.mapper;

import com.xianglan.qnytv.domain.auth.AuthRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthRoleMapper {
    AuthRole getRoleByCode(String code);
}
