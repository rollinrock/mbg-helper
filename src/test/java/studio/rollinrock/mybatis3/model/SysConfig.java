package studio.rollinrock.mybatis3.model;

import lombok.Data;

@Data
public class SysConfig {
    private Long id;

    private String paramKey;

    private String paramValue;

    private Byte status;

    private String remark;
}