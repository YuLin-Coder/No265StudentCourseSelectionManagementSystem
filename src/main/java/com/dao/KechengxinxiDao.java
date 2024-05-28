package com.dao;

import com.entity.KechengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengxinxiVO;
import com.entity.view.KechengxinxiView;


/**
 * 课程信息
 * 
 * @author 
 * @email 
 * @date 2022-04-30 14:26:20
 */
public interface KechengxinxiDao extends BaseMapper<KechengxinxiEntity> {
	
	List<KechengxinxiVO> selectListVO(@Param("ew") Wrapper<KechengxinxiEntity> wrapper);
	
	KechengxinxiVO selectVO(@Param("ew") Wrapper<KechengxinxiEntity> wrapper);
	
	List<KechengxinxiView> selectListView(@Param("ew") Wrapper<KechengxinxiEntity> wrapper);

	List<KechengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KechengxinxiEntity> wrapper);
	
	KechengxinxiView selectView(@Param("ew") Wrapper<KechengxinxiEntity> wrapper);
	

}
