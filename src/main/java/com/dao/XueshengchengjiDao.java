package com.dao;

import com.entity.XueshengchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengchengjiVO;
import com.entity.view.XueshengchengjiView;


/**
 * 学生成绩
 * 
 * @author 
 * @email 
 * @date 2022-04-30 14:26:20
 */
public interface XueshengchengjiDao extends BaseMapper<XueshengchengjiEntity> {
	
	List<XueshengchengjiVO> selectListVO(@Param("ew") Wrapper<XueshengchengjiEntity> wrapper);
	
	XueshengchengjiVO selectVO(@Param("ew") Wrapper<XueshengchengjiEntity> wrapper);
	
	List<XueshengchengjiView> selectListView(@Param("ew") Wrapper<XueshengchengjiEntity> wrapper);

	List<XueshengchengjiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengchengjiEntity> wrapper);
	
	XueshengchengjiView selectView(@Param("ew") Wrapper<XueshengchengjiEntity> wrapper);
	

}
