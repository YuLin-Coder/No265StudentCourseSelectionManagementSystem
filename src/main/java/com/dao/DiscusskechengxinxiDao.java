package com.dao;

import com.entity.DiscusskechengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskechengxinxiVO;
import com.entity.view.DiscusskechengxinxiView;


/**
 * 课程信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-30 14:26:20
 */
public interface DiscusskechengxinxiDao extends BaseMapper<DiscusskechengxinxiEntity> {
	
	List<DiscusskechengxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusskechengxinxiEntity> wrapper);
	
	DiscusskechengxinxiVO selectVO(@Param("ew") Wrapper<DiscusskechengxinxiEntity> wrapper);
	
	List<DiscusskechengxinxiView> selectListView(@Param("ew") Wrapper<DiscusskechengxinxiEntity> wrapper);

	List<DiscusskechengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskechengxinxiEntity> wrapper);
	
	DiscusskechengxinxiView selectView(@Param("ew") Wrapper<DiscusskechengxinxiEntity> wrapper);
	

}
