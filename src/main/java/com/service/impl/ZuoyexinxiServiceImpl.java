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


import com.dao.ZuoyexinxiDao;
import com.entity.ZuoyexinxiEntity;
import com.service.ZuoyexinxiService;
import com.entity.vo.ZuoyexinxiVO;
import com.entity.view.ZuoyexinxiView;

@Service("zuoyexinxiService")
public class ZuoyexinxiServiceImpl extends ServiceImpl<ZuoyexinxiDao, ZuoyexinxiEntity> implements ZuoyexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyexinxiEntity> page = this.selectPage(
                new Query<ZuoyexinxiEntity>(params).getPage(),
                new EntityWrapper<ZuoyexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyexinxiEntity> wrapper) {
		  Page<ZuoyexinxiView> page =new Query<ZuoyexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoyexinxiVO> selectListVO(Wrapper<ZuoyexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoyexinxiVO selectVO(Wrapper<ZuoyexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoyexinxiView> selectListView(Wrapper<ZuoyexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyexinxiView selectView(Wrapper<ZuoyexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
