package com.xpto.util;

public enum Uf {

	AC("AC"),
	AL("AL"),
	AM("AM"),
	AP("AP"),
	BA("BA"),
	CE("CE"),
	DF("DF"),
	ES("ES"),
	GO("GO"),
	MA("MA"),
	MG("MG"),
	MS("MS"),
	MT("MT"),
	PA("PA"),
	PB("PB"),
	PE("PE"),
	PI("PI"),
	PR("PR"),
	RJ("RJ"),
	RN("RN"),
	RO("RO"),
	RR("RR"),
	RS("RS"),
	SC("SC"),
	SE("SE"),
	SP("SP"),
	TO("TO");
	
	private final String uf;
	
	Uf(String uf){
		this.uf = uf;
	}

	public String getUf() {
		return uf;
	}
	
	 
}
