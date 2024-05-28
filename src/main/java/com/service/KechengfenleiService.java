package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengfenleiView;


/**
 * 课程分类
 *
 * @author 
 * @email 
 * @date 2022-04-30 14:26:20
 */
public interface KechengfenleiService extends IService<KechengfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengfenleiVO> selectListVO(Wrapper<KechengfenleiEntity> wrapper);
   	
   	KechengfenleiVO selectVO(@Param("ew") Wrapper<KechengfenleiEntity> wrapper);
   	
   	List<KechengfenleiView> selectListView(Wrapper<KechengfenleiEntity> wrapper);
   	
   	KechengfenleiView selectView(@Param("ew") Wrapper<KechengfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengfenleiEntity> wrapper);
   	

}

