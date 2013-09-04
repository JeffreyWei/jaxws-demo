package com.ewell.ws;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "WSFile")
@XmlAccessorType(XmlAccessType.FIELD)
public class WsBean {
	private String isTest; // 是否测试 T F
	private String workName;// 作品名称
	private String workType;// 作品类别
	private String workTypeDesc;// 作品类别描述
	private String isNeedWaterMark;// 是否添加水印
	
	
	private List<WsCopyrightOwner> copyrightOwners;// 著作人信息
	private List<WsAuthor> authors;// 作者署名信息
	private List<WsApplicant> applicants;// 申请人信息
	private WsProxy proxy;//代理人
	
	
	private String produceType; // 创作性质
	private String produceTypeDesc; // 创作性质说明
	private String completionDate; // 创作制作完成时间
	private String completionNation; // 创作制作完成国家
	private String completionCity;//创作完成城市
	private String isPublished; // 是否已发表
	private String publishedDate; // 首次发表日期
	private String publishedNationality; // 发表国家
	private String publishedCity; // 发表城市
	private String powerObtainWay; // 权利取得方式
	private String powerBelongWay; // 权利归属方式
	private String powerBelongDesc; // 权利归属说明
	private String powerOwnType; // 权利拥有状况
	private String powerOwnTypeDetail; // 权利拥有状况明细
	private String powerOwnDesc; // 权利拥有状况说明
	private String electronicMedia; // 电子介质
	private String electronicMediaNum; // 电子介质数量
	private String papgerMedia; // 纸介质
	private String papgerMediaNum; // 纸介质数量
	private String applyType;// 申请方式，数据字典：由著作权人申请、由代理人申请
	private String workStationName;// 工作站名称
	
	private String guaranteeRight; ////权利保证书
	private String manuWork;//作品说明书
	private String applybook;//申请书
	private String powerObtainDesc; //权利取得说明
	
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	public String getWorkType() {
		return workType;
	}
	public void setWorkType(String workType) {
		this.workType = workType;
	}
	public String getWorkTypeDesc() {
		return workTypeDesc;
	}
	public void setWorkTypeDesc(String workTypeDesc) {
		this.workTypeDesc = workTypeDesc;
	}
	public String getIsNeedWaterMark() {
		return isNeedWaterMark;
	}
	public void setIsNeedWaterMark(String isNeedWaterMark) {
		this.isNeedWaterMark = isNeedWaterMark;
	}
	public List<WsCopyrightOwner> getCopyrightOwners() {
		return copyrightOwners;
	}
	public void setCopyrightOwners(List<WsCopyrightOwner> copyrightOwners) {
		this.copyrightOwners = copyrightOwners;
	}
	public List<WsAuthor> getAuthors() {
		return authors;
	}
	public void setAuthors(List<WsAuthor> authors) {
		this.authors = authors;
	}
	public List<WsApplicant> getApplicants() {
		return applicants;
	}
	public void setApplicants(List<WsApplicant> applicants) {
		this.applicants = applicants;
	}
	public WsProxy getProxy() {
		return proxy;
	}
	public void setProxy(WsProxy proxy) {
		this.proxy = proxy;
	}
	public String getProduceType() {
		return produceType;
	}
	public void setProduceType(String produceType) {
		this.produceType = produceType;
	}
	public String getProduceTypeDesc() {
		return produceTypeDesc;
	}
	public void setProduceTypeDesc(String produceTypeDesc) {
		this.produceTypeDesc = produceTypeDesc;
	}
	public String getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}
	public String getCompletionNation() {
		return completionNation;
	}
	public void setCompletionNation(String completionNation) {
		this.completionNation = completionNation;
	}
	public String getCompletionCity() {
		return completionCity;
	}
	public void setCompletionCity(String completionCity) {
		this.completionCity = completionCity;
	}
	public String getIsPublished() {
		return isPublished;
	}
	public void setIsPublished(String isPublished) {
		this.isPublished = isPublished;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getPublishedNationality() {
		return publishedNationality;
	}
	public void setPublishedNationality(String publishedNationality) {
		this.publishedNationality = publishedNationality;
	}
	public String getPublishedCity() {
		return publishedCity;
	}
	public void setPublishedCity(String publishedCity) {
		this.publishedCity = publishedCity;
	}
	public String getPowerObtainWay() {
		return powerObtainWay;
	}
	public void setPowerObtainWay(String powerObtainWay) {
		this.powerObtainWay = powerObtainWay;
	}
	public String getPowerBelongWay() {
		return powerBelongWay;
	}
	public void setPowerBelongWay(String powerBelongWay) {
		this.powerBelongWay = powerBelongWay;
	}
	public String getPowerBelongDesc() {
		return powerBelongDesc;
	}
	public void setPowerBelongDesc(String powerBelongDesc) {
		this.powerBelongDesc = powerBelongDesc;
	}
	public String getPowerOwnType() {
		return powerOwnType;
	}
	public void setPowerOwnType(String powerOwnType) {
		this.powerOwnType = powerOwnType;
	}
	public String getPowerOwnTypeDetail() {
		return powerOwnTypeDetail;
	}
	public void setPowerOwnTypeDetail(String powerOwnTypeDetail) {
		this.powerOwnTypeDetail = powerOwnTypeDetail;
	}
	public String getPowerOwnDesc() {
		return powerOwnDesc;
	}
	public void setPowerOwnDesc(String powerOwnDesc) {
		this.powerOwnDesc = powerOwnDesc;
	}
	public String getElectronicMedia() {
		return electronicMedia;
	}
	public void setElectronicMedia(String electronicMedia) {
		this.electronicMedia = electronicMedia;
	}
	public String getElectronicMediaNum() {
		return electronicMediaNum;
	}
	public void setElectronicMediaNum(String electronicMediaNum) {
		this.electronicMediaNum = electronicMediaNum;
	}
	public String getPapgerMedia() {
		return papgerMedia;
	}
	public void setPapgerMedia(String papgerMedia) {
		this.papgerMedia = papgerMedia;
	}
	public String getPapgerMediaNum() {
		return papgerMediaNum;
	}
	public void setPapgerMediaNum(String papgerMediaNum) {
		this.papgerMediaNum = papgerMediaNum;
	}
	public String getApplyType() {
		return applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}
	public String getWorkStationName() {
		return workStationName;
	}
	public void setWorkStationName(String workStationName) {
		this.workStationName = workStationName;
	}
	public String getGuaranteeRight() {
		return guaranteeRight;
	}
	public void setGuaranteeRight(String guaranteeRight) {
		this.guaranteeRight = guaranteeRight;
	}
	public String getManuWork() {
		return manuWork;
	}
	public void setManuWork(String manuWork) {
		this.manuWork = manuWork;
	}
	public String getApplybook() {
		return applybook;
	}
	public void setApplybook(String applybook) {
		this.applybook = applybook;
	}
	public String getPowerObtainDesc() {
		return powerObtainDesc;
	}
	public void setPowerObtainDesc(String powerObtainDesc) {
		this.powerObtainDesc = powerObtainDesc;
	}
	public String getIsTest() {
		return isTest;
	}
	public void setIsTest(String isTest) {
		this.isTest = isTest;
	}
	
	@Override
	public String toString(){
		StringBuilder buf = new StringBuilder();
		buf.append("\n作品名称:").append(workName);
		buf.append("\n作品类别:").append(workType);
		buf.append("\n创作性质:").append(produceType);
		buf.append("\n创作完成时间:").append(completionDate);
		buf.append("\n创作完成地点:").append(completionNation+completionCity);
		buf.append("\n作品是否发表:").append("02".equals(isPublished)?"已发表_"
				+publishedDate+"_"+publishedNationality+publishedCity:"未发表");
		buf.append("\n权利取得方式:").append(powerObtainWay);
		buf.append("\n权利归属方式:").append(powerBelongWay);
		buf.append("\n权利拥有状况:").append(powerOwnType+"_"+powerOwnTypeDetail);
		buf.append("\n工作站:").append(workStationName);
		
		buf.append("\n著作权人:");
		if(copyrightOwners==null){
			buf.append("NULL");
		}else{
			for(int i=0;i<copyrightOwners.size();i++){
				buf.append(copyrightOwners.get(i).getName()+"   ");
			}
		}
		buf.append("\n作者信息:");
		if(authors==null){
			buf.append("NULL");
		}else{
			for(int i=0;i<authors.size();i++){
				buf.append(authors.get(i).getAuthorName()+"   ");
			}
		}
		buf.append("\n申请人信息:");
		if(applicants==null){
			buf.append("NULL");
		}else{
			for(int i=0;i<applicants.size();i++){
				buf.append(applicants.get(i).getName()+"   ");
			}
		}
		buf.append("\n代理人:").append(proxy==null?"NULL":proxy.getName());
		return buf.toString();
	}
}
