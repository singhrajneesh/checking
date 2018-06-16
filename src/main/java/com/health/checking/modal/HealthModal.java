package com.health.checking.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "health")
public class HealthModal {
		@Id
		private String emailId;
		
		private float bloodPressure;
		private float diabetes;
		private float bmi;
		private float wbc;
		private float rbc;
		private float pigmentation;
		private float lipase;
		private float electrolyte;
		private float drugContent;
		private float potassium;
		private float sodium;
		private float chloride;
		private float calcuim;
		private float hemaglobin;
		private float alkaline;
		private float temp;
		private float platelet;
		
		
		private float bloodPressureWeight;
		private float diabetesWeight;
		private float bmiWeight;
		private float wbcWeight;
		private float rbcWeight;
		private float pigmentationWeight;
		private float lipaseWeight;
		private float electrolyteWeight;
		private float drugContentWeight;
		private float potassiumWeight;
		private float sodiumWeight;
		private float chlorideWeight;
		private float calcuimWeight;
		private float hemaglobinWeight;
		private float alkalineWeight;
		private float tempWeight;
		private float plateletWeight;
		
		private float bloodPressureSimilarity;
		private float diabetesSimilarity;
		private float bmiSimilarity;
		private float wbcSimilarity;
		private float rbcSimilarity;
		private float pigmentationSimilarity;
		private float lipaseSimilarity;
		private float electrolyteSimilarity;
		private float drugContentSimilarity;
		private float potassiumSimilarity;
		private float sodiumSimilarity;
		private float chlorideSimilarity;
		private float calcuimSimilarity;
		private float hemaglobinSimilarity;
		private float alkalineSimilarity;
		private float tempSimilarity;
		private float plateletSimilarity;
		
		private float totalSimilarityComplex;
		
		public HealthModal() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

		public HealthModal(String emailId, float bloodPressure, float diabetes, float bmi, float wbc, float rbc,
				float pigmentation, float lipase, float electrolyte, float drugContent, float potassium, float sodium,
				float chloride, float calcuim, float hemaglobin, float alkaline, float temp, float platelet,
				float bloodPressureWeight, float diabetesWeight, float bmiWeight, float wbcWeight, float rbcWeight,
				float pigmentationWeight, float lipaseWeight, float electrolyteWeight, float drugContentWeight,
				float potassiumWeight, float sodiumWeight, float chlorideWeight, float calcuimWeight,
				float hemaglobinWeight, float alkalineWeight, float tempWeight, float plateletWeight,
				float bloodPressureSimilarity, float diabetesSimilarity, float bmiSimilarity, float wbcSimilarity,
				float rbcSimilarity, float pigmentationSimilarity, float lipaseSimilarity, float electrolyteSimilarity,
				float drugContentSimilarity, float potassiumSimilarity, float sodiumSimilarity,
				float chlorideSimilarity, float calcuimSimilarity, float hemaglobinSimilarity, float alkalineSimilarity,
				float tempSimilarity, float plateletSimilarity, float totalSimilarityComplex) {
			super();
			this.emailId = emailId;
			this.bloodPressure = bloodPressure;
			this.diabetes = diabetes;
			this.bmi = bmi;
			this.wbc = wbc;
			this.rbc = rbc;
			this.pigmentation = pigmentation;
			this.lipase = lipase;
			this.electrolyte = electrolyte;
			this.drugContent = drugContent;
			this.potassium = potassium;
			this.sodium = sodium;
			this.chloride = chloride;
			this.calcuim = calcuim;
			this.hemaglobin = hemaglobin;
			this.alkaline = alkaline;
			this.temp = temp;
			this.platelet = platelet;
			this.bloodPressureWeight = bloodPressureWeight;
			this.diabetesWeight = diabetesWeight;
			this.bmiWeight = bmiWeight;
			this.wbcWeight = wbcWeight;
			this.rbcWeight = rbcWeight;
			this.pigmentationWeight = pigmentationWeight;
			this.lipaseWeight = lipaseWeight;
			this.electrolyteWeight = electrolyteWeight;
			this.drugContentWeight = drugContentWeight;
			this.potassiumWeight = potassiumWeight;
			this.sodiumWeight = sodiumWeight;
			this.chlorideWeight = chlorideWeight;
			this.calcuimWeight = calcuimWeight;
			this.hemaglobinWeight = hemaglobinWeight;
			this.alkalineWeight = alkalineWeight;
			this.tempWeight = tempWeight;
			this.plateletWeight = plateletWeight;
			this.bloodPressureSimilarity = bloodPressureSimilarity;
			this.diabetesSimilarity = diabetesSimilarity;
			this.bmiSimilarity = bmiSimilarity;
			this.wbcSimilarity = wbcSimilarity;
			this.rbcSimilarity = rbcSimilarity;
			this.pigmentationSimilarity = pigmentationSimilarity;
			this.lipaseSimilarity = lipaseSimilarity;
			this.electrolyteSimilarity = electrolyteSimilarity;
			this.drugContentSimilarity = drugContentSimilarity;
			this.potassiumSimilarity = potassiumSimilarity;
			this.sodiumSimilarity = sodiumSimilarity;
			this.chlorideSimilarity = chlorideSimilarity;
			this.calcuimSimilarity = calcuimSimilarity;
			this.hemaglobinSimilarity = hemaglobinSimilarity;
			this.alkalineSimilarity = alkalineSimilarity;
			this.tempSimilarity = tempSimilarity;
			this.plateletSimilarity = plateletSimilarity;
			this.totalSimilarityComplex = totalSimilarityComplex;
		}



		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public float getBloodPressure() {
			return bloodPressure;
		}

		public void setBloodPressure(float bloodPressure) {
			this.bloodPressure = bloodPressure;
		}

		public float getDiabetes() {
			return diabetes;
		}

		public void setDiabetes(float diabetes) {
			this.diabetes = diabetes;
		}

		public float getBmi() {
			return bmi;
		}

		public void setBmi(float bmi) {
			this.bmi = bmi;
		}

		public float getWbc() {
			return wbc;
		}

		public void setWbc(float wbc) {
			this.wbc = wbc;
		}

		public float getRbc() {
			return rbc;
		}

		public void setRbc(float rbc) {
			this.rbc = rbc;
		}

		public float getPigmentation() {
			return pigmentation;
		}

		public void setPigmentation(float pigmentation) {
			this.pigmentation = pigmentation;
		}

		public float getLipase() {
			return lipase;
		}

		public void setLipase(float lipase) {
			this.lipase = lipase;
		}

		public float getElectrolyte() {
			return electrolyte;
		}

		public void setElectrolyte(float electrolyte) {
			this.electrolyte = electrolyte;
		}

		public float getDrugContent() {
			return drugContent;
		}

		public void setDrugContent(float drugContent) {
			this.drugContent = drugContent;
		}

		public float getPotassium() {
			return potassium;
		}

		public void setPotassium(float potassium) {
			this.potassium = potassium;
		}

		public float getSodium() {
			return sodium;
		}

		public void setSodium(float sodium) {
			this.sodium = sodium;
		}

		public float getChloride() {
			return chloride;
		}

		public void setChloride(float chloride) {
			this.chloride = chloride;
		}

		public float getCalcuim() {
			return calcuim;
		}

		public void setCalcuim(float calcuim) {
			this.calcuim = calcuim;
		}

		public float getHemaglobin() {
			return hemaglobin;
		}

		public void setHemaglobin(float hemaglobin) {
			this.hemaglobin = hemaglobin;
		}

		public float getAlkaline() {
			return alkaline;
		}

		public void setAlkaline(float alkaline) {
			this.alkaline = alkaline;
		}

		public float getTemp() {
			return temp;
		}

		public void setTemp(float temp) {
			this.temp = temp;
		}

		public float getPlatelet() {
			return platelet;
		}

		public void setPlatelet(float platelet) {
			this.platelet = platelet;
		}

		public float getBloodPressureWeight() {
			return bloodPressureWeight;
		}

		public void setBloodPressureWeight(float bloodPressureWeight) {
			this.bloodPressureWeight = bloodPressureWeight;
		}

		public float getDiabetesWeight() {
			return diabetesWeight;
		}

		public void setDiabetesWeight(float diabetesWeight) {
			this.diabetesWeight = diabetesWeight;
		}

		public float getBmiWeight() {
			return bmiWeight;
		}

		public void setBmiWeight(float bmiWeight) {
			this.bmiWeight = bmiWeight;
		}

		public float getWbcWeight() {
			return wbcWeight;
		}

		public void setWbcWeight(float wbcWeight) {
			this.wbcWeight = wbcWeight;
		}

		public float getRbcWeight() {
			return rbcWeight;
		}

		public void setRbcWeight(float rbcWeight) {
			this.rbcWeight = rbcWeight;
		}

		public float getPigmentationWeight() {
			return pigmentationWeight;
		}

		public void setPigmentationWeight(float pigmentationWeight) {
			this.pigmentationWeight = pigmentationWeight;
		}

		public float getLipaseWeight() {
			return lipaseWeight;
		}

		public void setLipaseWeight(float lipaseWeight) {
			this.lipaseWeight = lipaseWeight;
		}

		public float getElectrolyteWeight() {
			return electrolyteWeight;
		}

		public void setElectrolyteWeight(float electrolyteWeight) {
			this.electrolyteWeight = electrolyteWeight;
		}

		public float getDrugContentWeight() {
			return drugContentWeight;
		}

		public void setDrugContentWeight(float drugContentWeight) {
			this.drugContentWeight = drugContentWeight;
		}

		public float getPotassiumWeight() {
			return potassiumWeight;
		}

		public void setPotassiumWeight(float potassiumWeight) {
			this.potassiumWeight = potassiumWeight;
		}

		public float getSodiumWeight() {
			return sodiumWeight;
		}

		public void setSodiumWeight(float sodiumWeight) {
			this.sodiumWeight = sodiumWeight;
		}

		public float getChlorideWeight() {
			return chlorideWeight;
		}

		public void setChlorideWeight(float chlorideWeight) {
			this.chlorideWeight = chlorideWeight;
		}

		public float getCalcuimWeight() {
			return calcuimWeight;
		}

		public void setCalcuimWeight(float calcuimWeight) {
			this.calcuimWeight = calcuimWeight;
		}

		public float getHemaglobinWeight() {
			return hemaglobinWeight;
		}

		public void setHemaglobinWeight(float hemaglobinWeight) {
			this.hemaglobinWeight = hemaglobinWeight;
		}

		public float getAlkalineWeight() {
			return alkalineWeight;
		}

		public void setAlkalineWeight(float alkalineWeight) {
			this.alkalineWeight = alkalineWeight;
		}

		public float getTempWeight() {
			return tempWeight;
		}

		public void setTempWeight(float tempWeight) {
			this.tempWeight = tempWeight;
		}

		public float getPlateletWeight() {
			return plateletWeight;
		}

		public void setPlateletWeight(float plateletWeight) {
			this.plateletWeight = plateletWeight;
		}

		public float getBloodPressureSimilarity() {
			return bloodPressureSimilarity;
		}

		public void setBloodPressureSimilarity(float bloodPressureSimilarity) {
			this.bloodPressureSimilarity = bloodPressureSimilarity;
		}

		public float getDiabetesSimilarity() {
			return diabetesSimilarity;
		}

		public void setDiabetesSimilarity(float diabetesSimilarity) {
			this.diabetesSimilarity = diabetesSimilarity;
		}

		public float getBmiSimilarity() {
			return bmiSimilarity;
		}

		public void setBmiSimilarity(float bmiSimilarity) {
			this.bmiSimilarity = bmiSimilarity;
		}

		public float getWbcSimilarity() {
			return wbcSimilarity;
		}

		public void setWbcSimilarity(float wbcSimilarity) {
			this.wbcSimilarity = wbcSimilarity;
		}

		public float getRbcSimilarity() {
			return rbcSimilarity;
		}

		public void setRbcSimilarity(float rbcSimilarity) {
			this.rbcSimilarity = rbcSimilarity;
		}

		public float getPigmentationSimilarity() {
			return pigmentationSimilarity;
		}

		public void setPigmentationSimilarity(float pigmentationSimilarity) {
			this.pigmentationSimilarity = pigmentationSimilarity;
		}

		public float getLipaseSimilarity() {
			return lipaseSimilarity;
		}

		public void setLipaseSimilarity(float lipaseSimilarity) {
			this.lipaseSimilarity = lipaseSimilarity;
		}

		public float getElectrolyteSimilarity() {
			return electrolyteSimilarity;
		}

		public void setElectrolyteSimilarity(float electrolyteSimilarity) {
			this.electrolyteSimilarity = electrolyteSimilarity;
		}

		public float getDrugContentSimilarity() {
			return drugContentSimilarity;
		}

		public void setDrugContentSimilarity(float drugContentSimilarity) {
			this.drugContentSimilarity = drugContentSimilarity;
		}

		public float getPotassiumSimilarity() {
			return potassiumSimilarity;
		}

		public void setPotassiumSimilarity(float potassiumSimilarity) {
			this.potassiumSimilarity = potassiumSimilarity;
		}

		public float getSodiumSimilarity() {
			return sodiumSimilarity;
		}

		public void setSodiumSimilarity(float sodiumSimilarity) {
			this.sodiumSimilarity = sodiumSimilarity;
		}

		public float getChlorideSimilarity() {
			return chlorideSimilarity;
		}

		public void setChlorideSimilarity(float chlorideSimilarity) {
			this.chlorideSimilarity = chlorideSimilarity;
		}

		public float getCalcuimSimilarity() {
			return calcuimSimilarity;
		}

		public void setCalcuimSimilarity(float calcuimSimilarity) {
			this.calcuimSimilarity = calcuimSimilarity;
		}

		public float getHemaglobinSimilarity() {
			return hemaglobinSimilarity;
		}

		public void setHemaglobinSimilarity(float hemaglobinSimilarity) {
			this.hemaglobinSimilarity = hemaglobinSimilarity;
		}

		public float getAlkalineSimilarity() {
			return alkalineSimilarity;
		}

		public void setAlkalineSimilarity(float alkalineSimilarity) {
			this.alkalineSimilarity = alkalineSimilarity;
		}

		public float getTempSimilarity() {
			return tempSimilarity;
		}

		public void setTempSimilarity(float tempSimilarity) {
			this.tempSimilarity = tempSimilarity;
		}

		public float getPlateletSimilarity() {
			return plateletSimilarity;
		}

		public void setPlateletSimilarity(float plateletSimilarity) {
			this.plateletSimilarity = plateletSimilarity;
		}

		public float getTotalSimilarityComplex() {
			return totalSimilarityComplex;
		}

		public void setTotalSimilarityComplex(float totalSimilarityComplex) {
			this.totalSimilarityComplex = totalSimilarityComplex;
		}
		
		
		
		

		
}
