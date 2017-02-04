package java.com.haro.netty.test.pojo;

public class IotMachineInfo {
    private Integer infoId;

    private String deviceName;

    private String tempStatus;

    private String twoelLength;

    private String alarmStatus;

    private String tempModel;

    private Integer totalTwoelNum;

    private Integer newTotalNum;

    private Integer surplus;

    private String waterCapacity;

    private String waterSource;

    private String ph;

    private Integer totalCoins;

    private Integer mobilePay;

    private Integer payCard;

    private String deviceSn;
    
    private String returnTime;

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getTempStatus() {
        return tempStatus;
    }

    public void setTempStatus(String tempStatus) {
        this.tempStatus = tempStatus == null ? null : tempStatus.trim();
    }

    public String getTwoelLength() {
        return twoelLength;
    }

    public void setTwoelLength(String twoelLength) {
        this.twoelLength = twoelLength == null ? null : twoelLength.trim();
    }

    public String getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus == null ? null : alarmStatus.trim();
    }

    public String getTempModel() {
        return tempModel;
    }

    public void setTempModel(String tempModel) {
        this.tempModel = tempModel == null ? null : tempModel.trim();
    }

    public Integer getTotalTwoelNum() {
        return totalTwoelNum;
    }

    public void setTotalTwoelNum(Integer totalTwoelNum) {
        this.totalTwoelNum = totalTwoelNum;
    }

    public Integer getNewTotalNum() {
        return newTotalNum;
    }

    public void setNewTotalNum(Integer newTotalNum) {
        this.newTotalNum = newTotalNum;
    }

    public Integer getSurplus() {
        return surplus;
    }

    public void setSurplus(Integer surplus) {
        this.surplus = surplus;
    }

    public String getWaterCapacity() {
        return waterCapacity;
    }

    public void setWaterCapacity(String waterCapacity) {
        this.waterCapacity = waterCapacity == null ? null : waterCapacity.trim();
    }

    public String getWaterSource() {
        return waterSource;
    }

    public void setWaterSource(String waterSource) {
        this.waterSource = waterSource == null ? null : waterSource.trim();
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph == null ? null : ph.trim();
    }

    public Integer getTotalCoins() {
        return totalCoins;
    }

    public void setTotalCoins(Integer totalCoins) {
        this.totalCoins = totalCoins;
    }

    public Integer getMobilePay() {
        return mobilePay;
    }

    public void setMobilePay(Integer mobilePay) {
        this.mobilePay = mobilePay;
    }

    public Integer getPayCard() {
        return payCard;
    }

    public void setPayCard(Integer payCard) {
        this.payCard = payCard;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn == null ? null : deviceSn.trim();
    }

	public String getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}

	@Override
	public String toString() {
		return "IotMachineInfo [infoId=" + infoId + ", deviceName=" + deviceName + ", tempStatus=" + tempStatus
				+ ", twoelLength=" + twoelLength + ", alarmStatus=" + alarmStatus + ", tempModel=" + tempModel
				+ ", totalTwoelNum=" + totalTwoelNum + ", newTotalNum=" + newTotalNum + ", surplus=" + surplus
				+ ", waterCapacity=" + waterCapacity + ", waterSource=" + waterSource + ", ph=" + ph + ", totalCoins="
				+ totalCoins + ", mobilePay=" + mobilePay + ", payCard=" + payCard + ", deviceSn=" + deviceSn
				+ ", returnTime=" + returnTime + "]";
	}
	
	
    
}