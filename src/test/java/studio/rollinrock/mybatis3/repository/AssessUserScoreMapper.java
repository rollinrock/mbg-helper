package studio.rollinrock.mybatis3.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import studio.rollinrock.mybatis3.model.AssessUserScore;
import studio.rollinrock.mybatis3.model.AssessUserScoreExample;

public interface AssessUserScoreMapper {
    long countByExample(AssessUserScoreExample example);

    int deleteByExample(AssessUserScoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AssessUserScore record);

    int insertSelective(AssessUserScore record);

    List<AssessUserScore> selectByExample(AssessUserScoreExample example);

    AssessUserScore selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AssessUserScore record, @Param("example") AssessUserScoreExample example);

    int updateByExample(@Param("record") AssessUserScore record, @Param("example") AssessUserScoreExample example);

    int updateByPrimaryKeySelective(AssessUserScore record);

    int updateByPrimaryKey(AssessUserScore record);
}