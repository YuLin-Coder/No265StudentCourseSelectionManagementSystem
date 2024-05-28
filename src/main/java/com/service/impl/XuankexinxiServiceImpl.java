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


import com.dao.XuankexinxiDao;
import com.entity.XuankexinxiEntity;
import com.service.XuankexinxiService;
import com.entity.vo.XuankexinxiVO;
import com.entity.view.XuankexinxiView;

@Service("xuankexinxiService")
public class XuankexinxiServiceImpl extends ServiceImpl<XuankexinxiDao, XuankexinxiEntity> implements XuankexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuankexinxiEntity> page = this.selectPage(
                new Query<XuankexinxiEntity>(params).getPage(),
                new EntityWrapper<XuankexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuankexinxiEntity> wrapper) {
		  Page<XuankexinxiView> page =new Query<XuankexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuankexinxiVO> selectListVO(Wrapper<XuankexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuankexinxiVO selectVO(Wrapper<XuankexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuankexinxiView> selectListView(Wrapper<XuankexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuankexinxiView selectView(Wrapper<XuankexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
