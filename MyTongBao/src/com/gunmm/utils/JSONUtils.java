package com.gunmm.utils;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;



public class JSONUtils {
	public static JSONObject responseToJsonString(String runStatus, Object r, String result) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("result_code", runStatus);
		jsonObject.put("result", r);
		jsonObject.put("reason", result);
		return jsonObject;
	}
}
