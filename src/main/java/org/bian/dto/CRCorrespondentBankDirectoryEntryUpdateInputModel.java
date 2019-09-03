package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankDirectoryEntryUpdateInputModelCorrespondentBankDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankDirectoryEntryUpdateInputModel
 */
public class CRCorrespondentBankDirectoryEntryUpdateInputModel   {
  private String correspondentBankDataManagementServicingSessionReference = null;

  private String correspondentBankDirectoryEntryInstanceReference = null;

  private CRCorrespondentBankDirectoryEntryUpdateInputModelCorrespondentBankDirectoryEntryInstanceRecord correspondentBankDirectoryEntryInstanceRecord = null;

  private Object correspondentBankDirectoryEntryUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return correspondentBankDataManagementServicingSessionReference
  **/

  public String getCorrespondentBankDataManagementServicingSessionReference() {
    return correspondentBankDataManagementServicingSessionReference;
  }

  public void setCorrespondentBankDataManagementServicingSessionReference(String correspondentBankDataManagementServicingSessionReference) {
    this.correspondentBankDataManagementServicingSessionReference = correspondentBankDataManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Correspondent Bank Directory Entry instance 
   * @return correspondentBankDirectoryEntryInstanceReference
  **/

  public String getCorrespondentBankDirectoryEntryInstanceReference() {
    return correspondentBankDirectoryEntryInstanceReference;
  }

  public void setCorrespondentBankDirectoryEntryInstanceReference(String correspondentBankDirectoryEntryInstanceReference) {
    this.correspondentBankDirectoryEntryInstanceReference = correspondentBankDirectoryEntryInstanceReference;
  }


  /**
   * Get correspondentBankDirectoryEntryInstanceRecord
   * @return correspondentBankDirectoryEntryInstanceRecord
  **/

  public CRCorrespondentBankDirectoryEntryUpdateInputModelCorrespondentBankDirectoryEntryInstanceRecord getCorrespondentBankDirectoryEntryInstanceRecord() {
    return correspondentBankDirectoryEntryInstanceRecord;
  }

  public void setCorrespondentBankDirectoryEntryInstanceRecord(CRCorrespondentBankDirectoryEntryUpdateInputModelCorrespondentBankDirectoryEntryInstanceRecord correspondentBankDirectoryEntryInstanceRecord) {
    this.correspondentBankDirectoryEntryInstanceRecord = correspondentBankDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return correspondentBankDirectoryEntryUpdateActionTaskRecord
  **/

  public Object getCorrespondentBankDirectoryEntryUpdateActionTaskRecord() {
    return correspondentBankDirectoryEntryUpdateActionTaskRecord;
  }

  public void setCorrespondentBankDirectoryEntryUpdateActionTaskRecord(Object correspondentBankDirectoryEntryUpdateActionTaskRecord) {
    this.correspondentBankDirectoryEntryUpdateActionTaskRecord = correspondentBankDirectoryEntryUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

