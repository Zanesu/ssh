package com.txy.controller.fom;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @ClassName BaseForm
 * @Description TODO 表单基础类
 * @author Administrator
 * @Date 2017年12月7日 下午2:31:15
 * @version 1.0.0
 */
public class BaseForm {
	private int page = 0;
	private int pageSize = 0;
	private Map<String, Object> keyMap = new HashMap<>();

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
