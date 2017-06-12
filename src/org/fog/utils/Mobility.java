package org.fog.utils;

public class Mobility {
	private double longitude;
	private double latitude;
	private double xVector;
	private double yVector;
	private boolean isMobile;
	
	public Mobility(double latitude, double longitude, double xVector, double yVector, boolean isMobile){
		this.latitude = latitude;
		this.longitude = longitude;
		this.isMobile = isMobile;
		this.xVector = xVector;
		this.yVector = yVector;
	}
	private void updateLocation(){
		// Update the latitude and longitude based on vector.
		// Note, this function should depend on time.
		// Further research needs to be completed as to how this might be done.
		// I think using CloudSim.Clock() is the way to go.
	} 
	public double getVelocity() {
		double velocity;
		velocity = Math.sqrt(this.latitude*this.latitude+this.longitude*this.longitude);
		return velocity;
	}
	public double getAngleRad() {
		return Math.atan2(xVector, yVector);
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getxVector() {
		return xVector;
	}
	public void setxVector(double xVector) {
		this.xVector = xVector;
	}
	public double getyVector() {
		return yVector;
	}
	public void setyVector(double yVector) {
		this.yVector = yVector;
	}
	public boolean isMobile() {
		return isMobile;
	}
	public void setMobile(boolean isMobile) {
		this.isMobile = isMobile;
	}
}

