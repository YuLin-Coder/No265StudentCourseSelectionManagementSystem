package com.entity.view;

import com.entity.XueshengchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-30 14:26:20
 */
@TableName("xueshengchengji")
public class XueshengchengjiView  extends XueshengchengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengchengjiView(){
	}
 
 	public XueshengchengjiView(XueshengchengjiEntity xueshengchengjiEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengchengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
