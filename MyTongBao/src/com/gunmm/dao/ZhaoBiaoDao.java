package com.gunmm.dao;

import com.gunmm.model.ZhaoBiao;

public interface ZhaoBiaoDao {
	
	//添加招标
	public String addZhaoBiao(ZhaoBiao zbModel);
	
	//删除招标
	public boolean deleteZhaoBiao(ZhaoBiao zbModel);
	
}
