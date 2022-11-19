public class Tank {
	Gun gun;
	Engine engine;
	String RegNo;

	public Tank(String RegNo) {
		this.RegNo=RegNo;
		gun =new Gun();
		engine=new Engine();
	}

	public void setRegNo(String RegNo) {
		this.RegNo = RegNo;
	}
	public String TankFire(){
		return "Gun Fired";
	}
	
}
