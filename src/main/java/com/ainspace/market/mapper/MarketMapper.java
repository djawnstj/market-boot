package com.ainspace.market.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.ainspace.market.vo.HistoryVO;
import com.ainspace.market.vo.MemberVO;
import com.ainspace.market.vo.ProductVO;

@Repository
@Mapper
public interface MarketMapper {
	
	List<MemberVO> getMemberList();
	int logIn(MemberVO memVo);
	List<ProductVO> getProductList();
	List<HistoryVO> getHistoriesByMemId(MemberVO memVo);
	int updateHistoryStatus(HistoryVO historyVo);

}
