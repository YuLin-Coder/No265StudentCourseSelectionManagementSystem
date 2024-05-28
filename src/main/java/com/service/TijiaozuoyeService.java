package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TijiaozuoyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TijiaozuoyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TijiaozuoyeView;


/**
 * 提交作业
 *
 * @author 
 * @email 
 * @date 2022-04-30 14:26:20
 */
public interface TijiaozuoyeService extends IService<TijiaozuoyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TijiaozuoyeVO> selectListVO(Wrapper<TijiaozuoyeEntity> wrapper);
   	
   	TijiaozuoyeVO selectVO(@Param("ew") Wrapper<TijiaozuoyeEntity> wrapper);
   	
   	List<TijiaozuoyeView> selectListView(Wrapper<TijiaozuoyeEntity> wrapper);
   	
   	TijiaozuoyeView selectView(@Param("ew") Wrapper<TijiaozuoyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TijiaozuoyeEntity> wrapper);
   	

}

