package com.ty.hospitalapp.controller;

import com.ty.hospitalapp.dto.Hospital;
import com.ty.hospitalapp.services.HospitalService;

public class SaveHospital {
	public static void main(String[] args) {
		HospitalService service = new HospitalService();
		Hospital hospital = new Hospital();
		hospital.setName("Doctors");
		hospital.setWebsite("www.doctor.com");
		service.saveHospitalService(hospital);
		
				
	}

}
