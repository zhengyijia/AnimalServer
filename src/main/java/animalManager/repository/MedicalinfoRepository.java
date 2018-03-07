package animalManager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying; 
import org.springframework.transaction.annotation.Transactional;

import animalManager.model.Medicalinfo;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MedicalinfoRepository extends CrudRepository<Medicalinfo, String> {
	@Query("select medicalinfo from Medicalinfo medicalinfo where medicalinfo.medical_username=?1 and medicalinfo.medical_year=?2 and medicalinfo.medical_month=?3 and medicalinfo.medical_day=?4")
	public Iterable<Medicalinfo> findMedical(String username, int year, int month, int day);

	@Transactional
	@Modifying
	@Query("delete from Medicalinfo medicalinfo where medicalinfo.medical_username=?1 and medicalinfo.medical_year=?2 and medicalinfo.medical_month=?3 and medicalinfo.medical_day=?4")
    public void deleteMedical(String username, int year, int month, int day);

    @Transactional
    @Modifying
    @Query("update Medicalinfo medicalinfo set medicalinfo.medical_body_length=?5, medicalinfo.medical_body_waistline=?6, medicalinfo.medical_body_weight=?7, medicalinfo.medical_physical_exam_result=?8, medicalinfo.medical_physical_exam_doctor=?9, medicalinfo.medical_physical_exam_comment=?10, medicalinfo.medical_physical_exam_advice=?11, medicalinfo.medical_urine_color=?12, medicalinfo.medical_acid_base_reaction=?13, medicalinfo.medical_transparency=?14, medicalinfo.medical_urine_occult_blood=?15, medicalinfo.medical_assay_urine_result=?16, medicalinfo.medical_assay_urine_doctor=?17, medicalinfo.medical_defecate_occult_blood=?18, medicalinfo.medical_canine_parvovirus=?19, medicalinfo.medical_neutral_fat=?20, medicalinfo.medical_parasite=?21, medicalinfo.medical_muscle_fibers=?22, medicalinfo.medical_assay_defecate_result=?23, medicalinfo.medical_assay_defecate_doctor=?24, medicalinfo.medical_red_blood_cell=?25, medicalinfo.medical_white_blood_cell=?26, medicalinfo.medical_esr=?27, medicalinfo.medical_hemoglobin=?28, medicalinfo.medical_assay_blood_result=?29, medicalinfo.medical_assay_blood_doctor=?30, medicalinfo.medical_assay_comment=?31, medicalinfo.medical_assay_advice=?32, medicalinfo.medical_vaccine_name=?33, medicalinfo.medical_vaccine_dosage=?34, medicalinfo.medical_vaccine_doctor=?35, medicalinfo.medical_diagnose_symptom=?36, medicalinfo.medical_diagnose_diagnosis=?37, medicalinfo.medical_diagnose_prescribe=?38 where medicalinfo.medical_username=?1 and medicalinfo.medical_year=?2 and medicalinfo.medical_month=?3 and medicalinfo.medical_day=?4")
    public void updateMedical(String username, int year, int month, int day,
        int body_length, int body_waistline, int body_weight, 
        String physical_exam_result, String physical_exam_doctor, String physical_exam_comment,
        String physical_exam_advice, String urine_color, String acid_base_reaction,
        String transparency, String urine_occult_blood, String assay_urine_result, 
        String assay_urine_doctor, String defecate_occult_blood, String canine_parvovirus,
        String neutral_fat, String parasite, String muscle_fibers, String assay_defecate_result,
        String assay_defecate_doctor, String red_blood_cell, String white_blood_cell, 
        String esr, String hemoglobin, String assay_blood_result, String assay_blood_doctor, 
        String assay_comment, String assay_advice, String vaccine_name, String vaccine_dosage, 
        String vaccine_doctor, String diagnose_symptom, String diagnose_diagnosis, String diagnose_prescribe);
}