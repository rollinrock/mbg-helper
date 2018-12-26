package studio.rollinrock.mybatis3.model;

import lombok.Data;

@Data
public class UserProfileQuery extends UserProfile {
    private Integer pageIndex;

    private Integer pageSize;
}