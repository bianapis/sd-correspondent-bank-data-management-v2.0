package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankDirectoryEntryUpdateInputModelCorrespondentBankDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankDirectoryEntryUpdateOutputModel
 */
public class CRCorrespondentBankDirectoryEntryUpdateOutputModel   {
  private CRCorrespondentBankDirectoryEntryUpdateInputModelCorrespondentBankDirectoryEntryInstanceRecord correspondentBankDirectoryEntryInstanceRecord = null;

  private String correspondentBankDirectoryEntryUpdateActionTaskReference = null;

  private Object correspondentBankDirectoryEntryUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return correspondentBankDirectoryEntryUpdateActionTaskReference
  **/

  public String getCorrespondentBankDirectoryEntryUpdateActionTaskReference() {
    return correspondentBankDirectoryEntryUpdateActionTaskReference;
  }

  public void setCorrespondentBankDirectoryEntryUpdateActionTaskReference(String correspondentBankDirectoryEntryUpdateActionTaskReference) {
    this.correspondentBankDirectoryEntryUpdateActionTaskReference = correspondentBankDirectoryEntryUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

