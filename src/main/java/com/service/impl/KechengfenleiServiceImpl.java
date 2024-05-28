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


import com.dao.KechengfenleiDao;
import com.entity.KechengfenleiEntity;
import com.service.KechengfenleiService;
import com.entity.vo.KechengfenleiVO;
import com.entity.view.KechengfenleiView;

@Service("kechengfenleiService")
public class KechengfenleiServiceImpl extends ServiceImpl<KechengfenleiDao, KechengfenleiEntity> implements KechengfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengfenleiEntity> page = this.selectPage(
                new Query<KechengfenleiEntity>(params).getPage(),
                new EntityWrapper<KechengfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengfenleiEntity> wrapper) {
		  Page<KechengfenleiView> page =new Query<KechengfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengfenleiVO> selectListVO(Wrapper<KechengfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengfenleiVO selectVO(Wrapper<KechengfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengfenleiView> selectListView(Wrapper<KechengfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengfenleiView selectView(Wrapper<KechengfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
