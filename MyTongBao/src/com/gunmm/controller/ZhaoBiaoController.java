package com.gunmm.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gunmm.dao.ZhaoBiaoDao;
import com.gunmm.impl.ZhaoBiaoDaoImpl;
import com.gunmm.model.ZhaoBiao;
import com.gunmm.utils.JSONUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/zhaobiao")
public class ZhaoBiaoController {
	
	@RequestMapping("/addZhaoBiao")
	@ResponseBody
	private JSONObject addZhaoBiao(ZhaoBiao zbModel) {
		System.out.println("-------------------------------------------------");
		System.out.println(zbModel);
		
		ZhaoBiaoDao zhaobiaoDao = new ZhaoBiaoDaoImpl();
		String result = zhaobiaoDao.addZhaoBiao(zbModel);
		if(result.equals("success")) {
			return JSONUtils.responseToJsonString("0", zbModel, result);
		}else {
			return JSONUtils.responseToJsonString("1", "", result);
		}
	}

}
