package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusskechengxinxiEntity;
import com.entity.view.DiscusskechengxinxiView;

import com.service.DiscusskechengxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 课程信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-30 14:26:20
 */
@RestController
@RequestMapping("/discusskechengxinxi")
public class DiscusskechengxinxiController {
    @Autowired
    private DiscusskechengxinxiService discusskechengxinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusskechengxinxiEntity discusskechengxinxi,
		HttpServletRequest request){
        EntityWrapper<DiscusskechengxinxiEntity> ew = new EntityWrapper<DiscusskechengxinxiEntity>();
		PageUtils page = discusskechengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusskechengxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusskechengxinxiEntity discusskechengxinxi, 
		HttpServletRequest request){
        EntityWrapper<DiscusskechengxinxiEntity> ew = new EntityWrapper<DiscusskechengxinxiEntity>();
		PageUtils page = discusskechengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusskechengxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusskechengxinxiEntity discusskechengxinxi){
       	EntityWrapper<DiscusskechengxinxiEntity> ew = new EntityWrapper<DiscusskechengxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusskechengxinxi, "discusskechengxinxi")); 
        return R.ok().put("data", discusskechengxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusskechengxinxiEntity discusskechengxinxi){
        EntityWrapper< DiscusskechengxinxiEntity> ew = new EntityWrapper< DiscusskechengxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusskechengxinxi, "discusskechengxinxi")); 
		DiscusskechengxinxiView discusskechengxinxiView =  discusskechengxinxiService.selectView(ew);
		return R.ok("查询课程信息评论表成功").put("data", discusskechengxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusskechengxinxiEntity discusskechengxinxi = discusskechengxinxiService.selectById(id);
        return R.ok().put("data", discusskechengxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusskechengxinxiEntity discusskechengxinxi = discusskechengxinxiService.selectById(id);
        return R.ok().put("data", discusskechengxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusskechengxinxiEntity discusskechengxinxi, HttpServletRequest request){
    	discusskechengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusskechengxinxi);
        discusskechengxinxiService.insert(discusskechengxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusskechengxinxiEntity discusskechengxinxi, HttpServletRequest request){
    	discusskechengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusskechengxinxi);
        discusskechengxinxiService.insert(discusskechengxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscusskechengxinxiEntity discusskechengxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusskechengxinxi);
        discusskechengxinxiService.updateById(discusskechengxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusskechengxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusskechengxinxiEntity> wrapper = new EntityWrapper<DiscusskechengxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusskechengxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
