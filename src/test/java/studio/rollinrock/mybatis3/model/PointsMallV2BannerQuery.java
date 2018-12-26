package studio.rollinrock.mybatis3.model;

import lombok.Data;

@Data
public class PointsMallV2BannerQuery extends PointsMallV2Banner {
    private Integer pageIndex;

    private Integer pageSize;
}