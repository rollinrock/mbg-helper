package studio.rollinrock.mybatis3.model;

import lombok.Data;

@Data
public class UserProfile {
    private Integer uid;

    private String name;

    private String biologicalSex;

    private Integer limit;
}