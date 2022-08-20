package com.ainspace.market.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ainspace.market.service.MarketService;
import com.ainspace.market.utils.Logger;
import com.ainspace.market.vo.HistoryVO;
import com.ainspace.market.vo.MemberVO;
import com.ainspace.market.vo.ProductVO;

@RestController
@RequestMapping("/market-api/")
public class MarketController {
	
	private final String TAG = "MarketController";
	
	@Autowired
	MarketService marketService;
	
	@RequestMapping("member-list")
	public List<MemberVO> getMemberList() throws Exception {
		return marketService.getMemberList();
	}

	@RequestMapping("log-in")
	public int postLogin(HttpSession session, HttpServletRequest req, @RequestBody MemberVO memVo) throws Exception {
		Logger.debug(TAG, "postLogin(" + memVo + ") called.");
		
		return marketService.postLogin(memVo);
	}
	
	@RequestMapping("product-list")
	public List<ProductVO> getProductList() {
		Logger.error(TAG, "productList() called.");
		
		// 배열 변수 정의(값 할당)
		List<ProductVO> results = new ArrayList<ProductVO>();
		
		try {
			results = marketService.getProductList();
		} catch (Exception e) {
			Logger.error(TAG, "getProductList() error");
			e.printStackTrace();
		}
		
		return results;
		
	}
	
	@RequestMapping("history-list")
	public List<HistoryVO> getHistoriesByMemId(@RequestBody MemberVO memVo) {
		
		List<HistoryVO> results = new ArrayList<HistoryVO>();
		
		try {
			results = marketService.getHistoriesByMemId(memVo);
		} catch (Exception e) {
			Logger.error(TAG, "getHistoriesByMemId() error" + e.getMessage());
		}
		
		Logger.debug(TAG, "histories : " + results);
		
		return results;
	}
	
	@RequestMapping("update-history-status")
	public int updateHistoryStatus(@RequestBody HistoryVO historyVo) {
		Logger.debug(TAG, "updateHistoryStatus(" + historyVo + ") called.");
		
		int result = 0;
		
		try {
			result = marketService.updateHistoryStatus(historyVo);
		} catch (Exception e) {
			Logger.error(TAG, "updateHistoryStatus() error" + e.getMessage());
		}
		
		return result;
	}

}
