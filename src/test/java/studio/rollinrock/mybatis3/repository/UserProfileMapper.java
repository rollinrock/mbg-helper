package studio.rollinrock.mybatis3.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import studio.rollinrock.mybatis3.model.UserProfile;
import studio.rollinrock.mybatis3.model.UserProfileExample;

public interface UserProfileMapper {
    long countByExample(UserProfileExample example);

    int deleteByExample(UserProfileExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(UserProfile record);

    int insertSelective(UserProfile record);

    List<UserProfile> selectByExampleWithRowbounds(UserProfileExample example, RowBounds rowBounds);

    List<UserProfile> selectByExample(UserProfileExample example);

    UserProfile selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") UserProfile record, @Param("example") UserProfileExample example);

    int updateByExample(@Param("record") UserProfile record, @Param("example") UserProfileExample example);

    int updateByPrimaryKeySelective(UserProfile record);

    int updateByPrimaryKey(UserProfile record);
}