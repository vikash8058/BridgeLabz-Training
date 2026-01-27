package com.lambda.smarthomelight;

class SmartLightController {

	public void activateLight(LightAction action) {
		action.execute();
	}
}
