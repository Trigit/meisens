package controller;

import service.IService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Class Description:留言管理
 * @author Boki
 * @Date 2014年12月3日 - 上午12:21:47
 */
@SuppressWarnings("serial")
public class MessageAction extends ActionSupport {

	private IService service;

	public String getPicList() {
		// get parameters:pagenum,conditions

		// query from service/dao, get then returning list.

		// save them to the jsp-template scope

		// point out the target jsp page

		service.getPOList();

		return SUCCESS;
	}
}
