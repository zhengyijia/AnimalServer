package animalManager.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity // This tells Hibernate to make a table out of this class
@IdClass(MedicalPK.class)
public class Medicalinfo {

    @Id
    private String medical_username;

    @Id
    private Integer medical_year;

    @Id
    private Integer medical_month;

    @Id
    private Integer medical_day;

    private Integer medical_body_length;

    private Integer medical_body_waistline;

    private Integer medical_body_weight;

    private String medical_physical_exam_result;

    private String medical_physical_exam_doctor;

    private String medical_physical_exam_comment;

    private String medical_physical_exam_advice;

    private String medical_urine_color;

    private String medical_acid_base_reaction;

    private String medical_transparency;

    private String medical_urine_occult_blood;

    private String medical_assay_urine_result;

    private String medical_assay_urine_doctor;

    private String medical_defecate_occult_blood;

    private String medical_canine_parvovirus;

    private String medical_neutral_fat;

    private String medical_parasite;

    private String medical_muscle_fibers;

    private String medical_assay_defecate_result;

    private String medical_assay_defecate_doctor;

    private String medical_red_blood_cell;

    private String medical_white_blood_cell;

    private String medical_esr;

    private String medical_hemoglobin;

    private String medical_assay_blood_result;

    private String medical_assay_blood_doctor;

    private String medical_assay_comment;

    private String medical_assay_advice;

    private String medical_vaccine_name;

    private String medical_vaccine_dosage;

    private String medical_vaccine_doctor;

    private String medical_diagnose_symptom;

    private String medical_diagnose_diagnosis;

    private String medical_diagnose_prescribe;



	public String getUserName() {
		return medical_username;
	}

	public void setUserName(String medical_username) {
		this.medical_username = medical_username;
	}

	public Integer getYear() {
		return medical_year;
	}

	public void setYear(Integer medical_year) {
		this.medical_year = medical_year;
	}

	public Integer getMonth() {
		return medical_month;
	}

	public void setMonth(Integer medical_month) {
		this.medical_month = medical_month;
	}

	public Integer getDay() {
		return medical_day;
	}

	public void setDay(Integer medical_day) {
		this.medical_day = medical_day;
	}

	public Integer getBodyLength() {
		return medical_body_length;
	}

	public void setBodyLength(Integer medical_body_length) {
		this.medical_body_length = medical_body_length;
	}

	public Integer getBodyWaistline() {
		return medical_body_waistline;
	}

	public void setBodyWaistline(Integer medical_body_waistline) {
		this.medical_body_waistline = medical_body_waistline;
	}

	public Integer getBodyWeight() {
		return medical_body_weight;
	}

	public void setBodyWeight(Integer medical_body_weight) {
		this.medical_body_weight = medical_body_weight;
	}

	public String getPhysicalExamResult() {
		return medical_physical_exam_result;
	}

	public void setPhysicalExamResult(String medical_physical_exam_result) {
		this.medical_physical_exam_result = medical_physical_exam_result;
	}

	public String getPhysicalExamDoctor() {
		return medical_physical_exam_doctor;
	}

	public void setPhysicalExamDoctor(String medical_physical_exam_doctor) {
		this.medical_physical_exam_doctor = medical_physical_exam_doctor;
	}

	public String getPhysicalExamComment() {
		return medical_physical_exam_comment;
	}

	public void setPhysicalExamComment(String medical_physical_exam_comment) {
		this.medical_physical_exam_comment = medical_physical_exam_comment;
	}

	public String getPhysicalExamAdvice() {
		return medical_physical_exam_advice;
	}

	public void setPhysicalExamAdvice(String medical_physical_exam_advice) {
		this.medical_physical_exam_advice = medical_physical_exam_advice;
	}

	public String getUrineColor() {
		return medical_urine_color;
	}

	public void setUrineColor(String medical_urine_color) {
		this.medical_urine_color = medical_urine_color;
	}

	public String getAcidBaseReaction() {
		return medical_acid_base_reaction;
	}

	public void setAcidBaseReaction(String medical_acid_base_reaction) {
		this.medical_acid_base_reaction = medical_acid_base_reaction;
	}

	public String getTransparency() {
		return medical_transparency;
	}

	public void setTransparency(String medical_transparency) {
		this.medical_transparency = medical_transparency;
	}

	public String getUrineOccultBlood() {
		return medical_urine_occult_blood;
	}

	public void setUrineOccultBlood(String medical_urine_occult_blood) {
		this.medical_urine_occult_blood = medical_urine_occult_blood;
	}

	public String getAssayUrineResult() {
		return medical_assay_urine_result;
	}

	public void setAssayUrineResult(String medical_assay_urine_result) {
		this.medical_assay_urine_result = medical_assay_urine_result;
	}

	public String getAssayUrineDoctor() {
		return medical_assay_urine_doctor;
	}

	public void setAssayUrineDoctor(String medical_assay_urine_doctor) {
		this.medical_assay_urine_doctor = medical_assay_urine_doctor;
	}

	public String getDefecateOccultBlood() {
		return medical_defecate_occult_blood;
	}

	public void setDefecateOccultBlood(String medical_defecate_occult_blood) {
		this.medical_defecate_occult_blood = medical_defecate_occult_blood;
	}

	public String getCanineParvovirus() {
		return medical_canine_parvovirus;
	}

	public void setCanineParvovirus(String medical_canine_parvovirus) {
		this.medical_canine_parvovirus = medical_canine_parvovirus;
	}

	public String getNeutralFat() {
		return medical_neutral_fat;
	}

	public void setNeutralFat(String medical_neutral_fat) {
		this.medical_neutral_fat = medical_neutral_fat;
	}

	public String getParasite() {
		return medical_parasite;
	}

	public void setParasite(String medical_parasite) {
		this.medical_parasite = medical_parasite;
	}

	public String getMuscleFibers() {
		return medical_muscle_fibers;
	}

	public void setMuscleFibers(String medical_muscle_fibers) {
		this.medical_muscle_fibers = medical_muscle_fibers;
	}

	public String getAssayDefecateResult() {
		return medical_assay_defecate_result;
	}

	public void setAssayDefecateResult(String medical_assay_defecate_result) {
		this.medical_assay_defecate_result = medical_assay_defecate_result;
	}

	public String getAssayDefecateDoctor() {
		return medical_assay_defecate_doctor;
	}

	public void setAssayDefecateDoctor(String medical_assay_defecate_doctor) {
		this.medical_assay_defecate_doctor = medical_assay_defecate_doctor;
	}

	public String getRedBloodCell() {
		return medical_red_blood_cell;
	}

	public void setRedBloodCell(String medical_red_blood_cell) {
		this.medical_red_blood_cell = medical_red_blood_cell;
	}

	public String getWhiteBloodCell() {
		return medical_white_blood_cell;
	}

	public void setWhiteBloodCell(String medical_white_blood_cell) {
		this.medical_white_blood_cell = medical_white_blood_cell;
	}

	public String getEsr() {
		return medical_esr;
	}

	public void setEsr(String medical_esr) {
		this.medical_esr = medical_esr;
	}

	public String getHemoglobin() {
		return medical_hemoglobin;
	}

	public void setHemoglobin(String medical_hemoglobin) {
		this.medical_hemoglobin = medical_hemoglobin;
	}

	public String getAssayBloodResult() {
		return medical_assay_blood_result;
	}

	public void setAssayBloodResult(String medical_assay_blood_result) {
		this.medical_assay_blood_result = medical_assay_blood_result;
	}

	public String getAssayBloodDoctor() {
		return medical_assay_blood_doctor;
	}

	public void setAssayBloodDoctor(String medical_assay_blood_doctor) {
		this.medical_assay_blood_doctor = medical_assay_blood_doctor;
	}

	public String getAssayComment() {
		return medical_assay_comment;
	}

	public void setAssayComment(String medical_assay_comment) {
		this.medical_assay_comment = medical_assay_comment;
	}

	public String getAssayAdvice() {
		return medical_assay_advice;
	}

	public void setAssayAdvice(String medical_assay_advice) {
		this.medical_assay_advice = medical_assay_advice;
	}

	public String getVaccineName() {
		return medical_vaccine_name;
	}

	public void setVaccineName(String medical_vaccine_name) {
		this.medical_vaccine_name = medical_vaccine_name;
	}

	public String getVaccineDosage() {
		return medical_vaccine_dosage;
	}

	public void setVaccineDosage(String medical_vaccine_dosage) {
		this.medical_vaccine_dosage = medical_vaccine_dosage;
	}

	public String getVaccineDoctor() {
		return medical_vaccine_doctor;
	}

	public void setVaccineDoctor(String medical_vaccine_doctor) {
		this.medical_vaccine_doctor = medical_vaccine_doctor;
	}

	public String getDiagnoseSymptom() {
		return medical_diagnose_symptom;
	}

	public void setDiagnoseSymptom(String medical_diagnose_symptom) {
		this.medical_diagnose_symptom = medical_diagnose_symptom;
	}

	public String getDiagnoseDiagnosis() {
		return medical_diagnose_diagnosis;
	}

	public void setDiagnoseDiagnosis(String medical_diagnose_diagnosis) {
		this.medical_diagnose_diagnosis = medical_diagnose_diagnosis;
	}

	public String getDiagnosePrescribe() {
		return medical_diagnose_prescribe;
	}

	public void setDiagnosePrescribe(String medical_diagnose_prescribe) {
		this.medical_diagnose_prescribe = medical_diagnose_prescribe;
	}
}
