package com.ainspace.market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ainspace.market.mapper.MarketMapper;
import com.ainspace.market.vo.HistoryVO;
import com.ainspace.market.vo.MemberVO;
import com.ainspace.market.vo.ProductVO;

@Service
public class MarketService {
	
	private final String TAG = "MarketService";
	
	@Autowired
	public MarketMapper marketMapper;
	
	public List<MemberVO> getMemberList() throws Exception {
		return marketMapper.getMemberList();
	}
	
	public int postLogin(MemberVO memVo) throws Exception {
		return marketMapper.logIn(memVo);
	}
	
	public List<ProductVO> getProductList() throws Exception {
		return marketMapper.getProductList();
	}
	
	public List<HistoryVO> getHistoriesByMemId(MemberVO memVo) throws Exception {
		return marketMapper.getHistoriesByMemId(memVo);
	}
	
	public int updateHistoryStatus(HistoryVO historyVo) throws Exception {
		return marketMapper.updateHistoryStatus(historyVo);
	}

}
