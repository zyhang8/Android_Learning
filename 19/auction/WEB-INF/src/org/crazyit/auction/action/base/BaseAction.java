package org.crazyit.auction.action.base;

import com.opensymphony.xwork2.ActionSupport;

import org.crazyit.auction.service.AuctionManager;
import org.crazyit.auction.exception.AuctionException;

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
public class BaseAction extends ActionSupport
{
	protected AuctionManager mgr;

	public void setMgr(AuctionManager mgr)
	{
		this.mgr = mgr;
	}
}