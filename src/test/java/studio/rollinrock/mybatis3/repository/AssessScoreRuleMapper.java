package studio.rollinrock.mybatis3.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import studio.rollinrock.mybatis3.model.AssessScoreRule;
import studio.rollinrock.mybatis3.model.AssessScoreRuleExample;

public interface AssessScoreRuleMapper {
    long countByExample(AssessScoreRuleExample example);

    int deleteByExample(AssessScoreRuleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AssessScoreRule record);

    int insertSelective(AssessScoreRule record);

    List<AssessScoreRule> selectByExample(AssessScoreRuleExample example);

    AssessScoreRule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AssessScoreRule record, @Param("example") AssessScoreRuleExample example);

    int updateByExample(@Param("record") AssessScoreRule record, @Param("example") AssessScoreRuleExample example);

    int updateByPrimaryKeySelective(AssessScoreRule record);

    int updateByPrimaryKey(AssessScoreRule record);
}