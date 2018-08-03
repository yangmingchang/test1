package com.haomostudio.SpringMVCTemplate.controller;

import com.haomostudio.SpringMVCTemplate.common.domain.HmUser;
import com.haomostudio.SpringMVCTemplate.common.util.IHmUserService;
import com.haomostudio.SpringMVCTemplate.untils.JacksonUtil;
import com.haomostudio.SpringMVCTemplate.untils.ObjectIsNullUtil;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName(类名) :
 * @Description(描述) :
 * @author(作者) ：杨名昶
 * @date (开发日期)      ：2018/8/2  19:10
 */
@Controller
@RequestMapping("/hm_users")
public class HmUserController {
    @Autowired
    IHmUserService hmUserService;
    @RequestMapping(value = "/new",method = RequestMethod.POST)
    @ResponseBody
    private Map<String,Object> createHmUserUsingPOST_1(String data){
        Map<String,Object> returnMap = new HashMap<String, Object>(8);
        Map<String,Object> paramMap = JacksonUtil.jsonToMap(data);
        if(ObjectIsNullUtil.isNullOrEmpty(paramMap.get("loginId"))){
            returnMap.put("success",false);
            returnMap.put("message","loginid不能为空");
            System.out.println("loginid不能为空");
            return returnMap;
        }

        try{
            String jsonStr = JacksonUtil.mapToJson(paramMap);
            HmUser hmUser =JacksonUtil.jsonToObject(jsonStr,HmUser.class);
            hmUserService.insert(hmUser);
            System.out.println("创建用户成功");
            returnMap.put("success",true);
            returnMap.put("message","创建用户成功");

        }catch(Exception e){
            System.out.println("创建用户失败");
            returnMap.put("success",false);
            returnMap.put("message","创建用户失败");
        }
        return returnMap;
    }


    @RequestMapping(value = "/{hm_user_id}/edit",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> getHmUserUsingPUT(@PathVariable String hm_user_id, String data){
        Map<String,Object> returnMap = new HashMap<String, Object>(8);
        Map<String,Object> paramMap = JacksonUtil.jsonToMap(data);
        if(ObjectIsNullUtil.isNullOrEmpty(paramMap.get("id"))){
            returnMap.put("success",false);
            returnMap.put("message","id不能为空");
            System.out.println("id不能为空");
            return returnMap;
        }
        try {
            String jsonStr = JacksonUtil.mapToJson(paramMap);
            HmUser hmUser = JacksonUtil.jsonToObject(jsonStr, HmUser.class);
            hmUserService.update(hmUser);
            System.out.println("更新用户成功");
            returnMap.put("success",true);
            returnMap.put("message","更新用户成功");
        }catch(Exception e){
            System.out.println("更新用户失败");
            returnMap.put("success",false);
            returnMap.put("message","更新用户失败");
        }
        return returnMap;
    }

    @RequestMapping(value = "/{hm_user_id}",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getHmUserUsingGET(@PathVariable String hm_user_id){
        Map<String,Object> returnMap = new HashedMap(8);
        if(ObjectIsNullUtil.isNullOrEmpty(hm_user_id)){
            returnMap.put("success",false);
            returnMap.put("message","id不能为空");
            System.out.println("id不能为空");
            return returnMap;
        }
        HmUser hmUser = new HmUser();
        hmUser.setId(hm_user_id);
        try{
            hmUser = hmUserService.selectOneByObject(hmUser);
            if(!ObjectIsNullUtil.isNullOrEmpty(hmUser)){
                System.out.println("查询用户成功");
                returnMap.put("success",true);
                returnMap.put("message",JacksonUtil.ObjectToJson(hmUser));
            }else{
                System.out.println("未查找到用户");
                returnMap.put("success",true);
                returnMap.put("message","未查找到用户");
            }
        }catch(Exception e){
            System.out.println("查找用户异常");
            returnMap.put("success",false);
            returnMap.put("message","查找用户异常");
        }
        return returnMap;
    }
}
