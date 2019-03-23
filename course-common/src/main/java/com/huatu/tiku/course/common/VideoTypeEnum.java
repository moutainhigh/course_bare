package com.huatu.tiku.course.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 描述：大纲返回课件videoType 枚举
 *
 * @author biguodong
 * Create time 2019-03-21 2:44 PM
 **/

@AllArgsConstructor
@Getter
public enum VideoTypeEnum {

    /**
     * 点播
     */
    DOT_LIVE("点播", 1),
    /**
     * 直播
     */
    LIVE("直播", 2),
    /**
     * 直播回放
     */
    LIVE_PLAY_BACK("直播回放", 3),
    /**
     * 阶段测试
     */
    PERIOD_TEST("阶段测试", 4);

    private String value;
    private int videoType;

    public static VideoTypeEnum create (int videoType){
        for (VideoTypeEnum courseWareEnum : values()) {
            if(courseWareEnum.getVideoType() == videoType){
                return courseWareEnum;
            }
        }
        return null;
    }
}
