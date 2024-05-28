package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshiView;


/**
 * 教师
 *
 * @author 
 * @email 
 * @date 2022-04-30 14:26:20
 */
public interface JiaoshiService extends IService<JiaoshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshiVO> selectListVO(Wrapper<JiaoshiEntity> wrapper);
   	
   	JiaoshiVO selectVO(@Param("ew") Wrapper<JiaoshiEntity> wrapper);
   	
   	List<JiaoshiView> selectListView(Wrapper<JiaoshiEntity> wrapper);
   	
   	JiaoshiView selectView(@Param("ew") Wrapper<JiaoshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshiEntity> wrapper);
   	

}

