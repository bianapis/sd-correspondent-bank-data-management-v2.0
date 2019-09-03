package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankDirectoryEntryRequestInputModelCorrespondentBankDirectoryEntryInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankDirectoryEntryRequestOutputModel
 */
public class CRCorrespondentBankDirectoryEntryRequestOutputModel   {
  private CRCorrespondentBankDirectoryEntryRequestInputModelCorrespondentBankDirectoryEntryInstanceRecord correspondentBankDirectoryEntryInstanceRecord = null;

  private String correspondentBankDirectoryEntryRequestActionTaskReference = null;

  private Object correspondentBankDirectoryEntryRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Correspondent Bank Directory Entry instance request service call 
   * @return correspondentBankDirectoryEntryRequestActionTaskReference
  **/

  public String getCorrespondentBankDirectoryEntryRequestActionTaskReference() {
    return correspondentBankDirectoryEntryRequestActionTaskReference;
  }

  public void setCorrespondentBankDirectoryEntryRequestActionTaskReference(String correspondentBankDirectoryEntryRequestActionTaskReference) {
    this.correspondentBankDirectoryEntryRequestActionTaskReference = correspondentBankDirectoryEntryRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

