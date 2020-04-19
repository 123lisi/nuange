package com.nuange.community.dao;

import com.nuange.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPost(@Param("userId") int userId,int offset,int limit);

    //@Parm这个方法是给参数取别名，
    //如果只有一个参数，并且在<if>里面使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);
}
