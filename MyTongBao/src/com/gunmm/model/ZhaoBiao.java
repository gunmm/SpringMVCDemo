package com.gunmm.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ZhaoBiao {
	
	public ZhaoBiao() {
		
	}
	
    private int id;
    private String publishId;
    
    private String userId;

    //物品
    private String goodsName;
    
    //价格
    private String price;
    
    //联系人
    private String contact;

    //联系电话
    private String phone;
    
    //結束時間
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endAt;
    
  //创建时间
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    
    //招標内容
    private String content;

	

	@Override
	public String toString() {
		return "ZhaoBiao [id=" + id + ", publishId=" + publishId + ", userId=" + userId + ", goodsName=" + goodsName
				+ ", price=" + price + ", contact=" + contact + ", phone=" + phone + ", endAt=" + endAt
				+ ", createTime=" + createTime + ", content=" + content + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPublishId() {
		return publishId;
	}

	public void setPublishId(String publishId) {
		this.publishId = publishId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getEndAt() {
		return endAt;
	}

	public void setEndAt(Date endAt) {
		this.endAt = endAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	

    
}
