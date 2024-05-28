package com.entity.vo;

import com.entity.XueshengchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生成绩
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-30 14:26:20
 */
public class XueshengchengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 成绩名称
	 */
	
	private String chengjimingcheng;
		
	/**
	 * 分数
	 */
	
	private Integer fenshu;
		
	/**
	 * 评价建议
	 */
	
	private String pingjiajianyi;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 发送日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fasongriqi;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
				
	
	/**
	 * 设置：成绩名称
	 */
	 
	public void setChengjimingcheng(String chengjimingcheng) {
		this.chengjimingcheng = chengjimingcheng;
	}
	
	/**
	 * 获取：成绩名称
	 */
	public String getChengjimingcheng() {
		return chengjimingcheng;
	}
				
	
	/**
	 * 设置：分数
	 */
	 
	public void setFenshu(Integer fenshu) {
		this.fenshu = fenshu;
	}
	
	/**
	 * 获取：分数
	 */
	public Integer getFenshu() {
		return fenshu;
	}
				
	
	/**
	 * 设置：评价建议
	 */
	 
	public void setPingjiajianyi(String pingjiajianyi) {
		this.pingjiajianyi = pingjiajianyi;
	}
	
	/**
	 * 获取：评价建议
	 */
	public String getPingjiajianyi() {
		return pingjiajianyi;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：发送日期
	 */
	 
	public void setFasongriqi(Date fasongriqi) {
		this.fasongriqi = fasongriqi;
	}
	
	/**
	 * 获取：发送日期
	 */
	public Date getFasongriqi() {
		return fasongriqi;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
			
}
