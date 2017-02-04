package java.com.haro.netty.test.pojo;

public class Message {
	
	//尊敬的${name}维护人员，机器${device}在${time},发生${warn}异常，请您前往查看。
	private String name;
	private String device;
	private String time;
	private String warn;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getWarn() {
		return warn;
	}
	public void setWarn(String warn) {
		this.warn = warn;
	}
	

}
