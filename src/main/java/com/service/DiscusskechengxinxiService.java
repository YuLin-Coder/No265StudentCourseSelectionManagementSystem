package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskechengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskechengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskechengxinxiView;


/**
 * 课程信息评论表
 *
 * @author 
 * @email 
 * @date 2022-04-30 14:26:20
 */
public interface DiscusskechengxinxiService extends IService<DiscusskechengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskechengxinxiVO> selectListVO(Wrapper<DiscusskechengxinxiEntity> wrapper);
   	
   	DiscusskechengxinxiVO selectVO(@Param("ew") Wrapper<DiscusskechengxinxiEntity> wrapper);
   	
   	List<DiscusskechengxinxiView> selectListView(Wrapper<DiscusskechengxinxiEntity> wrapper);
   	
   	DiscusskechengxinxiView selectView(@Param("ew") Wrapper<DiscusskechengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskechengxinxiEntity> wrapper);
   	

}

