package com.entity.view;

import com.entity.TijiaozuoyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 提交作业
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-30 14:26:20
 */
@TableName("tijiaozuoye")
public class TijiaozuoyeView  extends TijiaozuoyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TijiaozuoyeView(){
	}
 
 	public TijiaozuoyeView(TijiaozuoyeEntity tijiaozuoyeEntity){
 	try {
			BeanUtils.copyProperties(this, tijiaozuoyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
