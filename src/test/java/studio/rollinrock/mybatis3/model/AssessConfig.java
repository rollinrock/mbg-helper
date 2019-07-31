package studio.rollinrock.mybatis3.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class AssessConfig {
    private Long id;

    private String scoreKey;

    private BigDecimal scoreValue;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;
}