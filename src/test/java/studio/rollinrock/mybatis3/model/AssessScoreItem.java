package studio.rollinrock.mybatis3.model;

import java.util.Date;
import lombok.Data;

@Data
public class AssessScoreItem {
    private Long id;

    private Long userId;

    private String assessPeriod;

    private Long referenceId;

    private String indicator;

    private String scene;

    private Float score;

    private String remark;

    private Boolean deleted;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;
}