package com.mygame.dao;

public class GameDAO {
	static String cityName[] = {"Chennai","Mumbai","Delhi","Kolkata","Hyderabad"};
	public GameDAO(String[] cityName) {
		this.cityName = cityName;
	}
	public String[] getCityName() {
		return cityName;
	}
}
