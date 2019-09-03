package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankDirectoryEntryRegisterInputModelCorrespondentBankDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankDirectoryEntryRegisterInputModel
 */
public class CRCorrespondentBankDirectoryEntryRegisterInputModel   {
  private String correspondentBankDataManagementServicingSessionReference = null;

  private Object correspondentBankDirectoryEntryRegisterActionRecord = null;

  private String correspondentBankDirectoryEntryInstanceStatus = null;

  private CRCorrespondentBankDirectoryEntryRegisterInputModelCorrespondentBankDirectoryEntryInstanceRecord correspondentBankDirectoryEntryInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Register service call input and output record 
   * @return correspondentBankDirectoryEntryRegisterActionRecord
  **/

  public Object getCorrespondentBankDirectoryEntryRegisterActionRecord() {
    return correspondentBankDirectoryEntryRegisterActionRecord;
  }

  public void setCorrespondentBankDirectoryEntryRegisterActionRecord(Object correspondentBankDirectoryEntryRegisterActionRecord) {
    this.correspondentBankDirectoryEntryRegisterActionRecord = correspondentBankDirectoryEntryRegisterActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Correspondent Bank Directory Entry instance (e.g. initialised, pending, active) 
   * @return correspondentBankDirectoryEntryInstanceStatus
  **/

  public String getCorrespondentBankDirectoryEntryInstanceStatus() {
    return correspondentBankDirectoryEntryInstanceStatus;
  }

  public void setCorrespondentBankDirectoryEntryInstanceStatus(String correspondentBankDirectoryEntryInstanceStatus) {
    this.correspondentBankDirectoryEntryInstanceStatus = correspondentBankDirectoryEntryInstanceStatus;
  }


  /**
   * Get correspondentBankDirectoryEntryInstanceRecord
   * @return correspondentBankDirectoryEntryInstanceRecord
  **/

  public CRCorrespondentBankDirectoryEntryRegisterInputModelCorrespondentBankDirectoryEntryInstanceRecord getCorrespondentBankDirectoryEntryInstanceRecord() {
    return correspondentBankDirectoryEntryInstanceRecord;
  }

  public void setCorrespondentBankDirectoryEntryInstanceRecord(CRCorrespondentBankDirectoryEntryRegisterInputModelCorrespondentBankDirectoryEntryInstanceRecord correspondentBankDirectoryEntryInstanceRecord) {
    this.correspondentBankDirectoryEntryInstanceRecord = correspondentBankDirectoryEntryInstanceRecord;
  }


}

