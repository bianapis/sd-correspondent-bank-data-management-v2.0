package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankDirectoryEntryRegisterOutputModel
 */
public class CRCorrespondentBankDirectoryEntryRegisterOutputModel   {
  private String correspondentBankDirectoryEntryInstanceReference = null;

  private String correspondentBankDirectoryEntryRegisterActionReference = null;

  private Object correspondentBankDirectoryEntryRegisterActionRecord = null;

  private String correspondentBankDirectoryEntryInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Register service call 
   * @return correspondentBankDirectoryEntryRegisterActionReference
  **/

  public String getCorrespondentBankDirectoryEntryRegisterActionReference() {
    return correspondentBankDirectoryEntryRegisterActionReference;
  }

  public void setCorrespondentBankDirectoryEntryRegisterActionReference(String correspondentBankDirectoryEntryRegisterActionReference) {
    this.correspondentBankDirectoryEntryRegisterActionReference = correspondentBankDirectoryEntryRegisterActionReference;
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


}

