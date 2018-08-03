package com.haomostudio.SpringMVCTemplate.common.util;

import com.haomostudio.SpringMVCTemplate.common.domain.HmUser;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName(类名) :
 * @Description(描述) :
 * @author(作者) ：杨名昶
 * @date (开发日期)      ：2018/8/2  19:58
 */
@Component
public interface IHmUserService {
    HmUser selectOneByObject(HmUser hmUser);

    List<HmUser> selectListByObject(HmUser hmUser);

    int insert(HmUser hmUser);

    int update(HmUser hmUser);
}
