package com.ewell.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.soap.MTOM;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
@MTOM
public interface IWsWebService {
	@WebMethod
	public void add(String userCode,WsBean wsBean);//添加数据
	@WebMethod
	public void login(@WebParam(name = "username", partName = "username")String username,@WebParam(name = "password", partName = "password")String password);
	@WebMethod
	public void authentic(@WebParam(name = "code", partName = "code") String code);
	@WebMethod
	public void updateWorksState(@WebParam(name = "code", partName = "code") String code,@WebParam(name = "worksid", partName = "worksid")Integer worksID,Integer state);
}