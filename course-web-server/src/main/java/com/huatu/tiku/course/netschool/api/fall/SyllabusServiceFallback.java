package com.huatu.tiku.course.netschool.api.fall;

import com.huatu.tiku.course.bean.NetSchoolResponse;
import com.huatu.tiku.course.netschool.api.v7.SyllabusServiceV7;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 描述：
 *
 * @author biguodong
 * Create time 2019-03-07 5:00 PM
 **/

@Slf4j
@Component
public class SyllabusServiceFallback implements SyllabusServiceV7{

    /**
     * 根据大纲id获取课件信息，多个大纲，逗号分隔
     *
     * @param params
     * @return
     */
    @Override
    public NetSchoolResponse courseWareInfo(Map<String, Object> params) {
        return NetSchoolResponse.DEFAULT;
    }

    /**
     * 根据课件id & 课件类型 获取大纲课程信息
     *
     * @param params
     * @return
     */
    @Deprecated
    @Override
    public NetSchoolResponse obtainSyllabusIdByCourseWareId(Map<String, Object> params) {
        return NetSchoolResponse.DEFAULT;
    }
}
