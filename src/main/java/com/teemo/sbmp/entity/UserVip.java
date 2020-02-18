package com.teemo.sbmp.entity;

    import java.time.LocalDateTime;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author teemo
* @since 2020-02-16
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class UserVip implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 用户主键
            */
    private Integer userId;

            /**
            * 会员等级
            */
    private Integer vipLevel;

            /**
            * 创建时间
            */
    private LocalDateTime createTime;


}
