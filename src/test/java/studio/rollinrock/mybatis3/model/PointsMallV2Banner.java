package studio.rollinrock.mybatis3.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@Data
@ApiModel
public class PointsMallV2Banner {
    @ApiModelProperty(name="id",notes="主键")
    private Integer id;

    @ApiModelProperty(name="deleted",notes="是否删除：0-未删除; 1-已删除")
    private Boolean deleted;

    @ApiModelProperty(name="creator",notes="创建人（对应登录名）")
    private String creator;

    @ApiModelProperty(name="gmtCreate",notes="创建时间")
    private Date gmtCreate;

    @ApiModelProperty(name="modifier",notes="修改人（对应登录名）")
    private String modifier;

    @ApiModelProperty(name="gmtModified",notes="修改时间")
    private Date gmtModified;

    @ApiModelProperty(name="title",notes="名称")
    private String title;

    @ApiModelProperty(name="picUrl",notes="banner图片url")
    private String picUrl;

    @ApiModelProperty(name="destination",notes="banner目的地：普通banner存url，商品banner存商品id")
    private String destination;

    @ApiModelProperty(name="enabled",notes="是否启用")
    private Boolean enabled;

    @ApiModelProperty(name="rank",notes="排序号")
    private Integer rank;

    @ApiModelProperty(name="style",notes="0-普通banner，1-商品banner")
    private Byte style;
}