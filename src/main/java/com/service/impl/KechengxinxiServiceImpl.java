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


import com.dao.KechengxinxiDao;
import com.entity.KechengxinxiEntity;
import com.service.KechengxinxiService;
import com.entity.vo.KechengxinxiVO;
import com.entity.view.KechengxinxiView;

@Service("kechengxinxiService")
public class KechengxinxiServiceImpl extends ServiceImpl<KechengxinxiDao, KechengxinxiEntity> implements KechengxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengxinxiEntity> page = this.selectPage(
                new Query<KechengxinxiEntity>(params).getPage(),
                new EntityWrapper<KechengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengxinxiEntity> wrapper) {
		  Page<KechengxinxiView> page =new Query<KechengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengxinxiVO> selectListVO(Wrapper<KechengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengxinxiVO selectVO(Wrapper<KechengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengxinxiView> selectListView(Wrapper<KechengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengxinxiView selectView(Wrapper<KechengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
