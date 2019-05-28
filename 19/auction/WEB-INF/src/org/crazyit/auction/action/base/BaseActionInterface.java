package org.crazyit.auction.action.base;

import com.opensymphony.xwork2.Action;

import org.crazyit.auction.service.AuctionManager;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class BaseActionInterface implements Action
{
	protected AuctionManager mgr;

	public void setMgr(AuctionManager mgr)
	{
		this.mgr = mgr;
	}

	public String execute() throws Exception
	{
		return SUCCESS;
	}
}