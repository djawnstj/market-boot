package com.ainspace.market.vo;

public class HistoryVO {
	
	int historySeq;
	String historyImg;
	int historyPrice;
	String historyTitle;
	String historyId;
	int historyProductId;
	int historyCount;
	int historyStatus;
	
	public int getHistorySeq() {
		return historySeq;
	}
	public void setHistorySeq(int historySeq) {
		this.historySeq = historySeq;
	}
	public String getHistoryImg() {
		return historyImg;
	}
	public void setHistoryImg(String historyImg) {
		this.historyImg = historyImg;
	}
	public int getHistoryPrice() {
		return historyPrice;
	}
	public void setHistoryPrice(int historyPrice) {
		this.historyPrice = historyPrice;
	}
	public String getHistoryTitle() {
		return historyTitle;
	}
	public void setHistoryTitle(String historyTitle) {
		this.historyTitle = historyTitle;
	}
	public String getHistoryId() {
		return historyId;
	}
	public void setHistoryId(String historyId) {
		this.historyId = historyId;
	}
	public int getHistoryProductId() {
		return historyProductId;
	}
	public void setHistoryProductId(int historyProductId) {
		this.historyProductId = historyProductId;
	}
	public int getHistoryCount() {
		return historyCount;
	}
	public void setHistoryCount(int historyCount) {
		this.historyCount = historyCount;
	}
	public int getHistoryStatus() {
		return historyStatus;
	}
	public void setHistoryStatus(int historyStatus) {
		this.historyStatus = historyStatus;
	}
	
	@Override
	public String toString() {
		return "HistoryVO [historySeq=" + historySeq + ", historyImg=" + historyImg + ", historyPrice=" + historyPrice
				+ ", historyTitle=" + historyTitle + ", historyId=" + historyId + ", historyProductId="
				+ historyProductId + ", historyCount=" + historyCount + ", historyStatus=" + historyStatus + "]";
	}	

}
