package com.gustavo.bookservice.response;

import java.io.Serializable;

public class Cambio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;	
	private String from;
	private String to;
	private Double conversionFactor;
	private Double convertedValue;
	private String enviroment;
	
	public Cambio() {		
	}
	
	public Cambio(Long id, String from, String to, Double conversionFactor, Double convertedValue,
			String enviroment) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.convertedValue = convertedValue;
		this.enviroment = enviroment;
	}

	public Long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public Double getConversionFactor() {
		return conversionFactor;
	}

	public Double getConvertedValue() {
		return convertedValue;
	}

	public String getEnviroment() {
		return enviroment;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setConversionFactor(Double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public void setConvertedValue(Double convertedValue) {
		this.convertedValue = convertedValue;
	}

	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conversionFactor == null) ? 0 : conversionFactor.hashCode());
		result = prime * result + ((convertedValue == null) ? 0 : convertedValue.hashCode());
		result = prime * result + ((enviroment == null) ? 0 : enviroment.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cambio other = (Cambio) obj;
		if (conversionFactor == null) {
			if (other.conversionFactor != null)
				return false;
		} else if (!conversionFactor.equals(other.conversionFactor))
			return false;
		if (convertedValue == null) {
			if (other.convertedValue != null)
				return false;
		} else if (!convertedValue.equals(other.convertedValue))
			return false;
		if (enviroment == null) {
			if (other.enviroment != null)
				return false;
		} else if (!enviroment.equals(other.enviroment))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}

}
