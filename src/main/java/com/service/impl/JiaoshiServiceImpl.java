package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaoshiDao;
import com.entity.JiaoshiEntity;
import com.service.JiaoshiService;
import com.entity.vo.JiaoshiVO;
import com.entity.view.JiaoshiView;

@Service("jiaoshiService")
public class JiaoshiServiceImpl extends ServiceImpl<JiaoshiDao, JiaoshiEntity> implements JiaoshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshiEntity> page = this.selectPage(
                new Query<JiaoshiEntity>(params).getPage(),
                new EntityWrapper<JiaoshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshiEntity> wrapper) {
		  Page<JiaoshiView> page =new Query<JiaoshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshiVO> selectListVO(Wrapper<JiaoshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshiVO selectVO(Wrapper<JiaoshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshiView> selectListView(Wrapper<JiaoshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshiView selectView(Wrapper<JiaoshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
