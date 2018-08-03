package com.haomostudio.SpringMVCTemplate.service.source.dao;

import com.haomostudio.SpringMVCTemplate.common.domain.HmUser;

import java.util.List;

/**
 * @ClassName(类名) :
 * @Description(描述) :
 * @author(作者) ：杨名昶
 * @date (开发日期)      ：2018/8/2  19:51
 */
public interface HmUserDao {

    HmUser selectOneByObject(HmUser hmUser);

    List<HmUser> selectListByObject(HmUser hmUser);

    int insert(HmUser hmUser);

    int update(HmUser hmUser);
}
