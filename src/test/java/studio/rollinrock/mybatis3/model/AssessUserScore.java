package studio.rollinrock.mybatis3.model;

import java.util.Date;
import lombok.Data;

@Data
public class AssessUserScore {
    private Long id;

    private Long userId;

    private String assessPeriod;

    private Short assessYear;

    private Byte assessMonth;

    private Float score;

    private Date ts;

    private Boolean deleted;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;
}