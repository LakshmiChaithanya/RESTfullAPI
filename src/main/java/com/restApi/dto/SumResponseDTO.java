package com.restApi.dto;

import java.util.ArrayList;
import java.util.List;

public class SumResponseDTO {
	List<SumDTO> sumReponse;

	public SumResponseDTO(){
		this.sumReponse = new ArrayList<SumDTO>();
	}
	public List<SumDTO> getSumReponse() {
		return sumReponse;
	}

	public void setSumReponse(List<SumDTO> sumReponse) {
		this.sumReponse = sumReponse;
	}

	public void addResponse(SumDTO dto) {
		sumReponse.add(dto);
	}
	
}
