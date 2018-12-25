package studio.rollinrock.mybatis3.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import studio.rollinrock.mybatis3.model.PointsMallV2Banner;
import studio.rollinrock.mybatis3.model.PointsMallV2BannerExample;

public interface PointsMallV2BannerMapper {
    long countByExample(PointsMallV2BannerExample example);

    int deleteByExample(PointsMallV2BannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PointsMallV2Banner record);

    int insertSelective(PointsMallV2Banner record);

    List<PointsMallV2Banner> selectByExampleWithRowbounds(PointsMallV2BannerExample example, RowBounds rowBounds);

    List<PointsMallV2Banner> selectByExample(PointsMallV2BannerExample example);

    PointsMallV2Banner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PointsMallV2Banner record, @Param("example") PointsMallV2BannerExample example);

    int updateByExample(@Param("record") PointsMallV2Banner record, @Param("example") PointsMallV2BannerExample example);

    int updateByPrimaryKeySelective(PointsMallV2Banner record);

    int updateByPrimaryKey(PointsMallV2Banner record);

    PointsMallV2Banner selectLatestCreatedByExample(PointsMallV2BannerExample example);
}