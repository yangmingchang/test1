package com.haomostudio.SpringMVCTemplate.controller;

import com.haomostudio.SpringMVCTemplate.common.domain.HmUser;
import com.haomostudio.SpringMVCTemplate.common.util.IHmUserService;
import com.haomostudio.SpringMVCTemplate.untils.JacksonUtil;
import com.haomostudio.SpringMVCTemplate.untils.ObjectIsNullUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName(类名) :
 * @Description(描述) :
 * @author(作者) ：杨名昶
 * @date (开发日期)      ：2018/8/2  20:42
 */
@Controller
@RequestMapping("/account-Controller")
public class AccountController {
    @Autowired
    IHmUserService hmUserService;
    @RequestMapping(value = "/LoginUsingPOST",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> loginUsingPOST(String data){
        Map<String,Object> returnMap = new HashMap<String, Object>(8);
        Map<String,Object> paramMap = JacksonUtil.jsonToMap(data);
        if(ObjectIsNullUtil.isNullOrEmpty(paramMap.get("loginId"))){
            returnMap.put("success",false);
            returnMap.put("message","loginId不能为空");
            System.out.println("loginId不能为空");
            return returnMap;
        }
        if(ObjectIsNullUtil.isNullOrEmpty(paramMap.get("passWord"))){
            returnMap.put("success",false);
            returnMap.put("message","passWord不能为空");
            System.out.println("passWord不能为空");
            return returnMap;
        }
        HmUser hmUser = new HmUser();
        hmUser.setLoginid(paramMap.get("loginId").toString());
        hmUser.setPassword(paramMap.get("passWord").toString());
        try {
            hmUser = hmUserService.selectOneByObject(hmUser);
        }catch(Exception e){
            System.out.println("查询数据库出现异常");
            returnMap.put("success",false);
            returnMap.put("message","查询数据库出现异常");
            return returnMap;
        }

        if(ObjectIsNullUtil.isNullOrEmpty(hmUser)){
            System.out.println("账号密码不匹配，登陆失败");
            returnMap.put("success",false);
            returnMap.put("message","账号密码不匹配，登陆失败");
        }else{
            returnMap.put("success",true);
            returnMap.put("message","登录成功");
        }
        return returnMap;
    }
}
