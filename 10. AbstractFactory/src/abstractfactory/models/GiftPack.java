package edu.mum.lsvs.entity;

import java.util.ArrayList;
import java.util.List;

public class GiftPack {
	
	
	private List<GiftItem> giftPack = new ArrayList<GiftItem>();
	private String packType;
	
	public GiftPack(String packType){
		this.packType = packType;
	}
	
	public List<GiftItem> getGiftPack() {
		return giftPack;
	}
	public void setGiftPack(List<GiftItem> giftPack) {
		this.giftPack = giftPack;
	}
	public String getPackType() {
		return packType;
	}
	public void setPackType(String packType) {
		this.packType = packType;
	}
	
	

}
