package studio.rollinrock.mybatis3.model;

import java.util.Date;
import lombok.Data;

@Data
public class AssessScoreRule {
    private Long id;

    private String assessPeriod;

    private Byte indicator;

    private Float grantedScore;

    private Float assessedScore;

    private String extraDynamicScore;

    private Boolean deleted;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;
}