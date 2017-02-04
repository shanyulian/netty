package com.haro.netty.test.pojo;

public class IotMachineStatus {
    private String deviceName;

    private Integer deviceStatus;

    private Integer deviceInfo;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public Integer getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(Integer deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public Integer getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(Integer deviceInfo) {
        this.deviceInfo = deviceInfo;
    }
}