package studio.rollinrock.mybatis3.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import studio.rollinrock.mybatis3.model.AssessScoreItem;
import studio.rollinrock.mybatis3.model.AssessScoreItemExample;

public interface AssessScoreItemMapper {
    long countByExample(AssessScoreItemExample example);

    int deleteByExample(AssessScoreItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AssessScoreItem record);

    int insertSelective(AssessScoreItem record);

    List<AssessScoreItem> selectByExample(AssessScoreItemExample example);

    AssessScoreItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AssessScoreItem record, @Param("example") AssessScoreItemExample example);

    int updateByExample(@Param("record") AssessScoreItem record, @Param("example") AssessScoreItemExample example);

    int updateByPrimaryKeySelective(AssessScoreItem record);

    int updateByPrimaryKey(AssessScoreItem record);
}