package studio.rollinrock.mybatis3.model;

import java.util.Date;
import lombok.Data;

@Data
public class PointsMallV2Banner {
    private Integer id;

    private Boolean deleted;

    private String creator;

    private Date gmtCreate;

    private String modifier;

    private Date gmtModified;

    private String title;

    private String picUrl;

    private String destination;

    private Boolean enabled;

    private Integer rank;

    private Byte style;
}