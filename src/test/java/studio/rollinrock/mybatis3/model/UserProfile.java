package studio.rollinrock.mybatis3.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class UserProfile {
    @ApiModelProperty(name="uid",notes="user id")
    private Integer uid;

    @ApiModelProperty(name="name",notes="user name")
    private String name;

    @ApiModelProperty(name="biologicalSex",notes="M for mail and F for female")
    private String biologicalSex;

    @ApiModelProperty(name="limit",notes="limit")
    private Integer limit;
}