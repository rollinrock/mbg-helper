package studio.rollinrock.mybatis3.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import studio.rollinrock.mybatis3.model.AssessConfig;
import studio.rollinrock.mybatis3.model.AssessConfigExample;

public interface AssessConfigMapper {
    long countByExample(AssessConfigExample example);

    int deleteByExample(AssessConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AssessConfig record);

    int insertSelective(AssessConfig record);

    List<AssessConfig> selectByExample(AssessConfigExample example);

    AssessConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AssessConfig record, @Param("example") AssessConfigExample example);

    int updateByExample(@Param("record") AssessConfig record, @Param("example") AssessConfigExample example);

    int updateByPrimaryKeySelective(AssessConfig record);

    int updateByPrimaryKey(AssessConfig record);
}