/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CorrespondentBankDataManagementApiServiceImpl implements CorrespondentBankDataManagementApiService {

	public SDCorrespondentBankDataManagementActivateOutputModel activate(SDCorrespondentBankDataManagementActivateInputModel request){
		return JsonReader.read("activate-SDCorrespondentBankDataManagementActivateOutputModel.json",new TypeReference<SDCorrespondentBankDataManagementActivateOutputModel>(){});
	}
	
	public SDCorrespondentBankDataManagementConfigureOutputModel configure(String sdReferenceId, SDCorrespondentBankDataManagementConfigureInputModel request){
		return JsonReader.read("configure-SDCorrespondentBankDataManagementConfigureOutputModel.json",new TypeReference<SDCorrespondentBankDataManagementConfigureOutputModel>(){});
	}
	
	public SDCorrespondentBankDataManagementFeedbackOutputModel feedback(String sdReferenceId, SDCorrespondentBankDataManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDCorrespondentBankDataManagementFeedbackOutputModel.json",new TypeReference<SDCorrespondentBankDataManagementFeedbackOutputModel>(){});
	}
	
	public CRCorrespondentBankDirectoryEntryRegisterOutputModel register(String sdReferenceId, CRCorrespondentBankDirectoryEntryRegisterInputModel request){
		return JsonReader.read("register-CRCorrespondentBankDirectoryEntryRegisterOutputModel.json",new TypeReference<CRCorrespondentBankDirectoryEntryRegisterOutputModel>(){});
	}
	
	public CRCorrespondentBankDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCorrespondentBankDirectoryEntryRequestInputModel request){
		return JsonReader.read("request-CRCorrespondentBankDirectoryEntryRequestOutputModel.json",new TypeReference<CRCorrespondentBankDirectoryEntryRequestOutputModel>(){});
	}
	
	public CRCorrespondentBankDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCorrespondentBankDirectoryEntryRetrieveOutputModel.json",new TypeReference<CRCorrespondentBankDirectoryEntryRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCorrespondentBankDataManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCorrespondentBankDataManagementRetrieveOutputModel.json",new TypeReference<SDCorrespondentBankDataManagementRetrieveOutputModel>(){});
	}
	
	public CRCorrespondentBankDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorrespondentBankDirectoryEntryUpdateInputModel request){
		return JsonReader.read("update-CRCorrespondentBankDirectoryEntryUpdateOutputModel.json",new TypeReference<CRCorrespondentBankDirectoryEntryUpdateOutputModel>(){});
	}
	
}
