package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankDirectoryEntryRequestInputModelCorrespondentBankDirectoryEntryInstanceRecord;
import org.bian.dto.CRCorrespondentBankDirectoryEntryRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankDirectoryEntryRequestInputModel
 */
public class CRCorrespondentBankDirectoryEntryRequestInputModel   {
  private String correspondentBankDataManagementServicingSessionReference = null;

  private String correspondentBankDirectoryEntryInstanceReference = null;

  private CRCorrespondentBankDirectoryEntryRequestInputModelCorrespondentBankDirectoryEntryInstanceRecord correspondentBankDirectoryEntryInstanceRecord = null;

  private Object correspondentBankDirectoryEntryRequestActionTaskRecord = null;

  private CRCorrespondentBankDirectoryEntryRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRCorrespondentBankDirectoryEntryRequestInputModelCorrespondentBankDirectoryEntryInstanceRecord getCorrespondentBankDirectoryEntryInstanceRecord() {
    return correspondentBankDirectoryEntryInstanceRecord;
  }

  public void setCorrespondentBankDirectoryEntryInstanceRecord(CRCorrespondentBankDirectoryEntryRequestInputModelCorrespondentBankDirectoryEntryInstanceRecord correspondentBankDirectoryEntryInstanceRecord) {
    this.correspondentBankDirectoryEntryInstanceRecord = correspondentBankDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return correspondentBankDirectoryEntryRequestActionTaskRecord
  **/

  public Object getCorrespondentBankDirectoryEntryRequestActionTaskRecord() {
    return correspondentBankDirectoryEntryRequestActionTaskRecord;
  }

  public void setCorrespondentBankDirectoryEntryRequestActionTaskRecord(Object correspondentBankDirectoryEntryRequestActionTaskRecord) {
    this.correspondentBankDirectoryEntryRequestActionTaskRecord = correspondentBankDirectoryEntryRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCorrespondentBankDirectoryEntryRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCorrespondentBankDirectoryEntryRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

