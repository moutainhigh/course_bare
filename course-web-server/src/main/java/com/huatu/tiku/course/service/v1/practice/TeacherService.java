package com.huatu.tiku.course.service.v1.practice;

import com.github.pagehelper.PageInfo;
import com.huatu.tiku.course.bean.practice.PracticeRoomRankUserBo;
import com.huatu.tiku.course.bean.practice.QuestionMetaBo;
import com.huatu.tiku.course.bean.practice.TeacherQuestionBo;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by lijun on 2019/2/21
 */
public interface TeacherService {

    /**
     * 通过roomId 获取绑定的试题信息
     */
    List<TeacherQuestionBo> getQuestionInfoByRoomId(Long roomId) throws ExecutionException, InterruptedException;

    /**
     * 存储 试题练习信息
     */
    void saveQuestionPracticeInfo(Long roomId, Long questionId, Integer practiceTime);

    /**
     * 更新预留考试时间
     */
    void updateQuestionPracticeTime(Long roomId, Long questionId, Integer practiceTime);

    /**
     * 获取答题情况
     */
    QuestionMetaBo getQuestionStatisticsByRoomIdAndQuestionId(Long roomId, Long questionId) throws ExecutionException, InterruptedException;

    /**
     * 教师端分页获取统计数据
     */
    PageInfo<PracticeRoomRankUserBo> getQuestionRankInfo(Long roomId, Integer page, Integer pageSize);
}
