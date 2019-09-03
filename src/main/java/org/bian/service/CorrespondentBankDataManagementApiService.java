/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CorrespondentBankDataManagementApiService {

	SDCorrespondentBankDataManagementActivateOutputModel activate(SDCorrespondentBankDataManagementActivateInputModel request);
	
	SDCorrespondentBankDataManagementConfigureOutputModel configure(String sdReferenceId, SDCorrespondentBankDataManagementConfigureInputModel request);
	
	SDCorrespondentBankDataManagementFeedbackOutputModel feedback(String sdReferenceId, SDCorrespondentBankDataManagementFeedbackInputModel request);
	
	CRCorrespondentBankDirectoryEntryRegisterOutputModel register(String sdReferenceId, CRCorrespondentBankDirectoryEntryRegisterInputModel request);
	
	CRCorrespondentBankDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCorrespondentBankDirectoryEntryRequestInputModel request);
	
	CRCorrespondentBankDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCorrespondentBankDataManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCorrespondentBankDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorrespondentBankDirectoryEntryUpdateInputModel request);
	
}
