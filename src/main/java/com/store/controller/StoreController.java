package com.store.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface StoreController {
	public String storeView(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
