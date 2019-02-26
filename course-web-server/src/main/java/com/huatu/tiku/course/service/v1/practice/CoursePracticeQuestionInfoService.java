package com.huatu.tiku.course.service.v1.practice;

import com.huatu.tiku.entity.CoursePracticeQuestionInfo;
import service.BaseServiceHelper;

import java.util.List;

/**
 * Created by lijun on 2019/2/21
 */
public interface CoursePracticeQuestionInfoService extends BaseServiceHelper<CoursePracticeQuestionInfo> {

    /**
     * 根据 roomId questionId 列表查询
     */
    List<CoursePracticeQuestionInfo> listByRoomIdAndQuestionId(Long roomId, List<Long> questionIdList);
}