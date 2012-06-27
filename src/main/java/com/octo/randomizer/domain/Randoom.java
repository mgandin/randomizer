package com.octo.randomizer.domain;

public class Randoom {
	private Integer[] series;
	private Integer number;
	
	public Randoom(Integer number, Integer[] series) {
		this.number = number;
		this.series = series;
	}
	public Integer[] getSeries() {
		return series;
	}
	public void setSeries(Integer[] series) {
		this.series = series;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
}
