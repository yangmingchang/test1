package com.haomostudio.SpringMVCTemplate.service.source.service;

import com.haomostudio.SpringMVCTemplate.common.domain.HmUser;
import com.haomostudio.SpringMVCTemplate.common.util.IHmUserService;
import com.haomostudio.SpringMVCTemplate.service.source.dao.HmUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName(类名) :
 * @Description(描述) :
 * @author(作者) ：杨名昶
 * @date (开发日期)      ：2018/8/2  19:53
 */
@Component
public class HmUserService implements IHmUserService {
    @Autowired
    HmUserDao hmUserDao;

    @Override
    public  HmUser selectOneByObject(HmUser hmUser){
        return hmUserDao.selectOneByObject(hmUser);
    }

    @Override
    public List<HmUser> selectListByObject(HmUser hmUser){
        return hmUserDao.selectListByObject(hmUser);
    }

    @Override
    public int insert(HmUser hmUser){
        return hmUserDao.insert(hmUser);
    }

    @Override
    public int update(HmUser hmUser){
        return hmUserDao.update(hmUser);
    }
}
