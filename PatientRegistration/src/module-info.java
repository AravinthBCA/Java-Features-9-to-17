module patientregistration {
// patientmanagment module only able to use patientregistation package
	exports PatientRegistration to patientmanagement;
//	it allow all modules
//	exports PatientRegistration; 
}