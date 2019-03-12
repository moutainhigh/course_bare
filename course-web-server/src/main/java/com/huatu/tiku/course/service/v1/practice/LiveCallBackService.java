package com.huatu.tiku.course.service.v1.practice;

import com.huatu.tiku.course.bean.practice.LiveCallbackBo;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by lijun on 2019/3/7
 */
public interface LiveCallBackService {

    /**
     * 直播生成回放- 回调
     *
     * @param roomId             房间ID
     * @param liveCallbackBoList 课件信息
     */
    void liveCallBackAllInfo(Long roomId, List<LiveCallbackBo> liveCallbackBoList) throws ExecutionException, InterruptedException;

}