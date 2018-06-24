package com.health.checking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.health.checking.database.DietDatabase;
import com.health.checking.database.HealthDatabase;
import com.health.checking.modal.DietModal;
import com.health.checking.modal.DietPlan;
import com.health.checking.modal.HealthModal;

@CrossOrigin
@RestController
public class HealthController {
	private static final String String = null;

	@Autowired
	public  HealthDatabase healthdatabase;
	
	@Autowired
	public  DietDatabase dietdatabase;
	
	public float bloodPressureMax=0;
	public float diabetesMax=0;
	public float bmiMax=0;
	public float wbcMax=0;
	public float rbcMax=0;
	public float pigmentationMax=0;
	public float lipaseMax=0;
	public float electrolyteMax=0;
	public float drugContentMax=0;
	public float potassiumMax=0;
	public float sodiumMax=0;
	public float chlorideMax=0;
	public float calcuimMax=0;
	public float hemaglobinMax=0;
	public float alkalineMax=0;
	public float tempMax=0;
	public float plateletMax=0;
	
	public float bloodPressureMin=0;
	public float diabetesMin=0;
	public float bmiMin=0;
	public float wbcMin=0;
	public float rbcMin=0;
	public float pigmentationMin=0;
	public float lipaseMin=0;
	public float electrolyteMin=0;
	public float drugContentMin=0;
	public float potassiumMin=0;
	public float sodiumMin=0;
	public float chlorideMin=0;
	public float calcuimMin=0;
	public float hemaglobinMin=0;
	public float alkalineMin=0;
	public float tempMin=0;
	public float plateletMin=0;
	
	HealthModal existingPatientDetails=new HealthModal();
	
	@GetMapping("/getdata/{emailId}")
	public Object getUserData(@PathVariable String emailId)
	{	
		return healthdatabase.findByEmailId(emailId);
	}
	
	@PostMapping("/addingdata")
	public Object addUserData(@RequestBody HealthModal user)
	{	
		List<HealthModal> patientDetails= new ArrayList<HealthModal>();
		patientDetails=healthdatabase.findAll();
		for(HealthModal patientDetail : patientDetails) {
			if(patientDetail.getAlkaline()>alkalineMax)
				alkalineMax=patientDetail.getAlkaline();
			
			if(patientDetail.getBloodPressure()>bloodPressureMax)
				bloodPressureMax=patientDetail.getBloodPressure();
			
			if(patientDetail.getBmi()>bmiMax)
				bmiMax=patientDetail.getBmi();
			
			if(patientDetail.getCalcuim()>calcuimMax)
				calcuimMax=patientDetail.getCalcuim();
			
			if(patientDetail.getChloride()>chlorideMax)
				chlorideMax=patientDetail.getChloride();
			
			if(patientDetail.getDiabetes()>diabetesMax)
				diabetesMax=patientDetail.getDiabetes();
			
			if(patientDetail.getDrugContent()>drugContentMax)
				drugContentMax=patientDetail.getDrugContent();
			
			if(patientDetail.getElectrolyte()>electrolyteMax)
				electrolyteMax=patientDetail.getElectrolyte();
			
			if(patientDetail.getHemaglobin()>hemaglobinMax)
				hemaglobinMax=patientDetail.getHemaglobin();
			
			if(patientDetail.getLipase()>lipaseMax)
				lipaseMax=patientDetail.getLipase();
			
			if(patientDetail.getPigmentation()>pigmentationMax)
				pigmentationMax=patientDetail.getPigmentation();
			
			if(patientDetail.getPlatelet()>plateletMax)
				plateletMax=patientDetail.getPlatelet();
			
			if(patientDetail.getPotassium()>potassiumMax)
				potassiumMax=patientDetail.getPotassium();
			
			if(patientDetail.getRbc()>rbcMax)
				rbcMax=patientDetail.getRbc();
			
			if(patientDetail.getSodium()>sodiumMax)
				sodiumMax=patientDetail.getSodium();
			
			if(patientDetail.getTemp()>tempMax)
				tempMax=patientDetail.getTemp();
			
			if(patientDetail.getWbc()>wbcMax)
				wbcMax=patientDetail.getWbc();
			
			if(patientDetail.getAlkaline()<alkalineMin)
				alkalineMin=patientDetail.getAlkaline();
			
			if(patientDetail.getBloodPressure()<bloodPressureMin)
				bloodPressureMin=patientDetail.getBloodPressure();
			
			if(patientDetail.getBmi()<bmiMin)
				bmiMin=patientDetail.getBmi();
			
			if(patientDetail.getCalcuim()<calcuimMin)
				calcuimMin=patientDetail.getCalcuim();
			
			if(patientDetail.getChloride()<chlorideMin)
				chlorideMin=patientDetail.getChloride();
			
			if(patientDetail.getDiabetes()<diabetesMin)
				diabetesMin=patientDetail.getDiabetes();
			
			if(patientDetail.getDrugContent()<drugContentMin)
				drugContentMin=patientDetail.getDrugContent();
			
			if(patientDetail.getElectrolyte()<electrolyteMin)
				electrolyteMin=patientDetail.getElectrolyte();
			
			if(patientDetail.getHemaglobin()<hemaglobinMin)
				hemaglobinMin=patientDetail.getHemaglobin();
			
			if(patientDetail.getLipase()<lipaseMin)
				lipaseMin=patientDetail.getLipase();
			
			if(patientDetail.getPigmentation()<pigmentationMin)
				pigmentationMin=patientDetail.getPigmentation();
			
			if(patientDetail.getPlatelet()<plateletMin)
				plateletMin=patientDetail.getPlatelet();
			
			if(patientDetail.getPotassium()<potassiumMin)
				potassiumMin=patientDetail.getPotassium();
			
			if(patientDetail.getRbc()<rbcMin)
				rbcMin=patientDetail.getRbc();
			
			if(patientDetail.getSodium()<sodiumMin)
				sodiumMin=patientDetail.getSodium();
			
			if(patientDetail.getTemp()<tempMin)
				tempMin=patientDetail.getTemp();
			
			if(patientDetail.getWbc()<wbcMin)
				wbcMin=patientDetail.getWbc();
		}
		
			user.setAlkalineSimilarity(1-(user.getAlkaline()/(alkalineMax-alkalineMin)));
			user.setBloodPressureSimilarity(1-(user.getBloodPressure()/(bloodPressureMax-bloodPressureMin)));
			user.setBmiSimilarity(1-(user.getBmi()/(bmiMax-bmiMin)));
			user.setCalcuimSimilarity(1-(user.getCalcuim()/(calcuimMax-calcuimMin)));
			user.setChlorideSimilarity(1-(user.getChloride()/(chlorideMax-chlorideMin)));
			user.setDiabetesSimilarity(1-(user.getDiabetes()/(diabetesMax-diabetesMin)));
			user.setDrugContentSimilarity(1-(user.getDrugContent()/(drugContentMax-drugContentMin)));
			user.setElectrolyteSimilarity(1-(user.getElectrolyte()/(electrolyteMax-electrolyteMin)));
			user.setHemaglobinSimilarity(1-(user.getHemaglobin()/(hemaglobinMax-hemaglobinMin)));
			user.setLipaseSimilarity(1-(user.getLipase()/(lipaseMax-lipaseMin)));
			user.setPigmentationSimilarity(1-(user.getPigmentation()/(pigmentationMax-pigmentationMin)));
			user.setPlateletSimilarity(1-(user.getPlatelet()/(plateletMax-plateletMin)));
			user.setPotassiumSimilarity(1-(user.getPotassium()/(potassiumMax-potassiumMin)));
			user.setRbcSimilarity(1-(user.getRbc()/(rbcMax-rbcMin)));
			user.setSodiumSimilarity(1-(user.getSodium()/(sodiumMax-sodiumMin)));
			user.setTempSimilarity(1-(user.getTemp()/(tempMax-tempMin)));
			user.setWbcSimilarity(1-(user.getWbc()/(wbcMax-wbcMin)));
			
			user.setTotalSimilarityComplex(user.getAlkalineSimilarity()*user.getAlkalineWeight()
											+user.getBloodPressureSimilarity()*user.getBloodPressureWeight()
											+user.getBmiSimilarity()*user.getBmiWeight()
											+user.getCalcuimSimilarity()*user.getCalcuimWeight()
											+user.getChlorideSimilarity()*user.getChlorideWeight()
											+user.getDiabetesSimilarity()*user.getDiabetesWeight()
											+user.getDrugContentSimilarity()*user.getDrugContentWeight()
											+user.getElectrolyteSimilarity()*user.getElectrolyteWeight()
											+user.getHemaglobinSimilarity()*user.getHemaglobinWeight()
											+user.getLipaseSimilarity()*user.getLipaseWeight() 
											+user.getPigmentationSimilarity()*user.getPigmentationWeight()
											+user.getPlateletSimilarity()*user.getPlateletWeight()
											+user.getPotassiumSimilarity()*user.getPotassiumWeight()
											+user.getRbcSimilarity()*user.getRbcWeight()
											+user.getSodiumSimilarity()*user.getSodiumWeight()
											+user.getTempSimilarity()*user.getTempWeight()
											+user.getWbcSimilarity()*user.getWbcWeight()
											);
			
	
		healthdatabase.save(user);
		return user;
	}
	
	@PutMapping("/updatepatient")
	public Object updatePatient(@RequestBody HealthModal user)
	{	List<HealthModal> patientDetails= new ArrayList<HealthModal>();
	patientDetails=healthdatabase.findAll();
	for(HealthModal patientDetail : patientDetails) {
		if(patientDetail.getAlkaline()>alkalineMax)
			alkalineMax=patientDetail.getAlkaline();
		
		if(patientDetail.getBloodPressure()>bloodPressureMax)
			bloodPressureMax=patientDetail.getBloodPressure();
		
		if(patientDetail.getBmi()>bmiMax)
			bmiMax=patientDetail.getBmi();
		
		if(patientDetail.getCalcuim()>calcuimMax)
			calcuimMax=patientDetail.getCalcuim();
		
		if(patientDetail.getChloride()>chlorideMax)
			chlorideMax=patientDetail.getChloride();
		
		if(patientDetail.getDiabetes()>diabetesMax)
			diabetesMax=patientDetail.getDiabetes();
		
		if(patientDetail.getDrugContent()>drugContentMax)
			drugContentMax=patientDetail.getDrugContent();
		
		if(patientDetail.getElectrolyte()>electrolyteMax)
			electrolyteMax=patientDetail.getElectrolyte();
		
		if(patientDetail.getHemaglobin()>hemaglobinMax)
			hemaglobinMax=patientDetail.getHemaglobin();
		
		if(patientDetail.getLipase()>lipaseMax)
			lipaseMax=patientDetail.getLipase();
		
		if(patientDetail.getPigmentation()>pigmentationMax)
			pigmentationMax=patientDetail.getPigmentation();
		
		if(patientDetail.getPlatelet()>plateletMax)
			plateletMax=patientDetail.getPlatelet();
		
		if(patientDetail.getPotassium()>potassiumMax)
			potassiumMax=patientDetail.getPotassium();
		
		if(patientDetail.getRbc()>rbcMax)
			rbcMax=patientDetail.getRbc();
		
		if(patientDetail.getSodium()>sodiumMax)
			sodiumMax=patientDetail.getSodium();
		
		if(patientDetail.getTemp()>tempMax)
			tempMax=patientDetail.getTemp();
		
		if(patientDetail.getWbc()>wbcMax)
			wbcMax=patientDetail.getWbc();
		
		if(patientDetail.getAlkaline()<alkalineMin)
			alkalineMin=patientDetail.getAlkaline();
		
		if(patientDetail.getBloodPressure()<bloodPressureMin)
			bloodPressureMin=patientDetail.getBloodPressure();
		
		if(patientDetail.getBmi()<bmiMin)
			bmiMin=patientDetail.getBmi();
		
		if(patientDetail.getCalcuim()<calcuimMin)
			calcuimMin=patientDetail.getCalcuim();
		
		if(patientDetail.getChloride()<chlorideMin)
			chlorideMin=patientDetail.getChloride();
		
		if(patientDetail.getDiabetes()<diabetesMin)
			diabetesMin=patientDetail.getDiabetes();
		
		if(patientDetail.getDrugContent()<drugContentMin)
			drugContentMin=patientDetail.getDrugContent();
		
		if(patientDetail.getElectrolyte()<electrolyteMin)
			electrolyteMin=patientDetail.getElectrolyte();
		
		if(patientDetail.getHemaglobin()<hemaglobinMin)
			hemaglobinMin=patientDetail.getHemaglobin();
		
		if(patientDetail.getLipase()<lipaseMin)
			lipaseMin=patientDetail.getLipase();
		
		if(patientDetail.getPigmentation()<pigmentationMin)
			pigmentationMin=patientDetail.getPigmentation();
		
		if(patientDetail.getPlatelet()<plateletMin)
			plateletMin=patientDetail.getPlatelet();
		
		if(patientDetail.getPotassium()<potassiumMin)
			potassiumMin=patientDetail.getPotassium();
		
		if(patientDetail.getRbc()<rbcMin)
			rbcMin=patientDetail.getRbc();
		
		if(patientDetail.getSodium()<sodiumMin)
			sodiumMin=patientDetail.getSodium();
		
		if(patientDetail.getTemp()<tempMin)
			tempMin=patientDetail.getTemp();
		
		if(patientDetail.getWbc()<wbcMin)
			wbcMin=patientDetail.getWbc();
	}
		if(healthdatabase.existsByEmailId(user.getEmailId()))
		{
			existingPatientDetails=healthdatabase.findByEmailId(user.getEmailId());
			
			user.setAlkalineSimilarity(1-(user.getAlkaline()-existingPatientDetails.getAlkaline()/(alkalineMax-alkalineMin)));
			user.setBloodPressureSimilarity(1-(user.getBloodPressure()-existingPatientDetails.getBmi()/(bloodPressureMax-bloodPressureMin)));
			user.setBmiSimilarity(1-(user.getBmi()-existingPatientDetails.getBmi()/(bmiMax-bmiMin)));
			user.setCalcuimSimilarity(1-(user.getCalcuim()-existingPatientDetails.getCalcuim()/(calcuimMax-calcuimMin)));
			user.setChlorideSimilarity(1-(user.getChloride()-existingPatientDetails.getChloride()/(chlorideMax-chlorideMin)));
			user.setDiabetesSimilarity(1-(user.getDiabetes()-existingPatientDetails.getDiabetes()/(diabetesMax-diabetesMin)));
			user.setDrugContentSimilarity(1-(user.getDrugContent()-existingPatientDetails.getDrugContent()/(drugContentMax-drugContentMin)));
			user.setElectrolyteSimilarity(1-(user.getElectrolyte()-existingPatientDetails.getElectrolyte()/(electrolyteMax-electrolyteMin)));
			user.setHemaglobinSimilarity(1-(user.getHemaglobin()-existingPatientDetails.getHemaglobin()/(hemaglobinMax-hemaglobinMin)));
			user.setLipaseSimilarity(1-(user.getLipase()-existingPatientDetails.getLipase()/(lipaseMax-lipaseMin)));
			user.setPigmentationSimilarity(1-(user.getPigmentation()-existingPatientDetails.getPigmentation()/(pigmentationMax-pigmentationMin)));
			user.setPlateletSimilarity(1-(user.getPlatelet()-existingPatientDetails.getPlatelet()/(plateletMax-plateletMin)));
			user.setPotassiumSimilarity(1-(user.getPotassium()-existingPatientDetails.getPotassium()/(potassiumMax-potassiumMin)));
			user.setRbcSimilarity(1-(user.getRbc()-existingPatientDetails.getRbc()/(rbcMax-rbcMin)));
			user.setSodiumSimilarity(1-(user.getSodium()-existingPatientDetails.getSodium()/(sodiumMax-sodiumMin)));
			user.setTempSimilarity(1-(user.getTemp()-existingPatientDetails.getTemp()/(tempMax-tempMin)));
			user.setWbcSimilarity(1-(user.getWbc()-existingPatientDetails.getWbc()/(wbcMax-wbcMin)));
			
			user.setTotalSimilarityComplex(user.getAlkalineSimilarity()*user.getAlkalineWeight()
											+user.getBloodPressureSimilarity()*user.getBloodPressureWeight()
											+user.getBmiSimilarity()*user.getBmiWeight()
											+user.getCalcuimSimilarity()*user.getCalcuimWeight()
											+user.getChlorideSimilarity()*user.getChlorideWeight()
											+user.getDiabetesSimilarity()*user.getDiabetesWeight()
											+user.getDrugContentSimilarity()*user.getDrugContentWeight()
											+user.getElectrolyteSimilarity()*user.getElectrolyteWeight()
											+user.getHemaglobinSimilarity()*user.getHemaglobinWeight()
											+user.getLipaseSimilarity()*user.getLipaseWeight() 
											+user.getPigmentationSimilarity()*user.getPigmentationWeight()
											+user.getPlateletSimilarity()*user.getPlateletWeight()
											+user.getPotassiumSimilarity()*user.getPotassiumWeight()
											+user.getRbcSimilarity()*user.getRbcWeight()
											+user.getSodiumSimilarity()*user.getSodiumWeight()
											+user.getTempSimilarity()*user.getTempWeight()
											+user.getWbcSimilarity()*user.getWbcWeight()
											);

		}
		healthdatabase.save(user);
		return user;
	
	}
	
	
	@PostMapping("/addingdefault")
	public Object addDefaultData(@RequestBody HealthModal user)
	{	
	
		healthdatabase.save(user);
		return user;
	
	}
	
	@PostMapping("/addingdefaultdiet")
	public Object addDefaultDiet(@RequestBody DietModal diet)
	{	
		
		dietdatabase.save(diet);
		return diet;
	
	}
	
	@PostMapping("/getdiet")
	public Object getDiet(@RequestBody HealthModal user)
	{	String diet = null;
		DietPlan plan=new DietPlan();
		DietModal dietmodal=new DietModal();
		String temp="temp";
		String bloodpressure="bloodpressure";
		String bmiweight="bmiweight";
		
		if(user.getTempWeight()>0.7)
		{	
			dietmodal=dietdatabase.findByParameter(temp);
			temp=dietmodal.getDiet();
		}
		
		if(user.getBloodPressureWeight()>0.7)
		{	
			dietmodal=dietdatabase.findByParameter(bloodpressure);
			bloodpressure=dietmodal.getDiet();
		}
		
		if(user.getBmiWeight()>0.7)
		{	
			dietmodal=dietdatabase.findByParameter(bmiweight);
			bmiweight=dietmodal.getDiet();
		}
		
		diet=temp+". "+bloodpressure+". "+bmiweight;
		
		plan.setDiet(diet);
		return plan;
	
	}
}
