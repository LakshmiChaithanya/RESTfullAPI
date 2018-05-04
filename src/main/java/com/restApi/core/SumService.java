package com.restApi.core;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.restApi.dto.SumDTO;
import com.restApi.dto.SumResponseDTO;

public class SumService {

	public SumResponseDTO getSums() throws FileNotFoundException {
		// TODO Auto-generated method stub
		SumResponseDTO sumRespoonses = new SumResponseDTO();
		//InputStream integerInputStream = new FileInputStream("input.txt");
		//InputStreamReader integerReader = new InputStreamReader(integerInputStream);
		//BufferedReader br = new BufferedReader(integerReader);
		String line;
		 InputStream integerInputStream = SumService.class.getResourceAsStream("/input.txt");
	      BufferedReader br = new BufferedReader(new InputStreamReader(integerInputStream));
		try {
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				int sum = 0;
				SumDTO dto = new SumDTO();
				for(int i = 0; i<values.length ; i++){
					int value = Integer.parseInt(values[i]);
					sum+=value;
					dto.addElement(value);
				}
				dto.setSum(sum);
				sumRespoonses.addResponse(dto);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sumRespoonses;
	}

}
