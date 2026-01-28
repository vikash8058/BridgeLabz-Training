package com.day1.healthcheckpro;

public class LabTestController {

	@PublicAPI(description = "Fetch all lab tests")
	public void getAllLabTests() {
	}

	@RequiresAuth(role = "PATIENT")
	public void bookLabTest() {
	}

	// Missing annotation (should be detected)
	public void downloadReport() {
	}
}
