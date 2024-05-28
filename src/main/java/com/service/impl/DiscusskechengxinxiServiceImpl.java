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


import com.dao.DiscusskechengxinxiDao;
import com.entity.DiscusskechengxinxiEntity;
import com.service.DiscusskechengxinxiService;
import com.entity.vo.DiscusskechengxinxiVO;
import com.entity.view.DiscusskechengxinxiView;

@Service("discusskechengxinxiService")
public class DiscusskechengxinxiServiceImpl extends ServiceImpl<DiscusskechengxinxiDao, DiscusskechengxinxiEntity> implements DiscusskechengxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskechengxinxiEntity> page = this.selectPage(
                new Query<DiscusskechengxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusskechengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskechengxinxiEntity> wrapper) {
		  Page<DiscusskechengxinxiView> page =new Query<DiscusskechengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskechengxinxiVO> selectListVO(Wrapper<DiscusskechengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskechengxinxiVO selectVO(Wrapper<DiscusskechengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskechengxinxiView> selectListView(Wrapper<DiscusskechengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskechengxinxiView selectView(Wrapper<DiscusskechengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
