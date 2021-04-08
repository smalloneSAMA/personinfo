package org.zz.personinfo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.zz.personinfo.entity.User;

@Mapper
public interface UserMapper {

    User selectUserByUsername(String username);

}
