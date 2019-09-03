package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceRecord;
import org.bian.dto.CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankDirectoryEntryRetrieveOutputModel
 */
public class CRCorrespondentBankDirectoryEntryRetrieveOutputModel   {
  private CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceRecord correspondentBankDirectoryEntryInstanceRecord = null;

  private String correspondentBankDirectoryEntryRetrieveActionTaskReference = null;

  private Object correspondentBankDirectoryEntryRetrieveActionTaskRecord = null;

  private String correspondentBankDirectoryEntryRetrieveActionResponse = null;

  private CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceReportRecord correspondentBankDirectoryEntryInstanceReportRecord = null;

  private CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceAnalysis correspondentBankDirectoryEntryInstanceAnalysis = null;


  /**
   * Get correspondentBankDirectoryEntryInstanceRecord
   * @return correspondentBankDirectoryEntryInstanceRecord
  **/

  public CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceRecord getCorrespondentBankDirectoryEntryInstanceRecord() {
    return correspondentBankDirectoryEntryInstanceRecord;
  }

  public void setCorrespondentBankDirectoryEntryInstanceRecord(CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceRecord correspondentBankDirectoryEntryInstanceRecord) {
    this.correspondentBankDirectoryEntryInstanceRecord = correspondentBankDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Correspondent Bank Directory Entry instance retrieve service call 
   * @return correspondentBankDirectoryEntryRetrieveActionTaskReference
  **/

  public String getCorrespondentBankDirectoryEntryRetrieveActionTaskReference() {
    return correspondentBankDirectoryEntryRetrieveActionTaskReference;
  }

  public void setCorrespondentBankDirectoryEntryRetrieveActionTaskReference(String correspondentBankDirectoryEntryRetrieveActionTaskReference) {
    this.correspondentBankDirectoryEntryRetrieveActionTaskReference = correspondentBankDirectoryEntryRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return correspondentBankDirectoryEntryRetrieveActionTaskRecord
  **/

  public Object getCorrespondentBankDirectoryEntryRetrieveActionTaskRecord() {
    return correspondentBankDirectoryEntryRetrieveActionTaskRecord;
  }

  public void setCorrespondentBankDirectoryEntryRetrieveActionTaskRecord(Object correspondentBankDirectoryEntryRetrieveActionTaskRecord) {
    this.correspondentBankDirectoryEntryRetrieveActionTaskRecord = correspondentBankDirectoryEntryRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return correspondentBankDirectoryEntryRetrieveActionResponse
  **/

  public String getCorrespondentBankDirectoryEntryRetrieveActionResponse() {
    return correspondentBankDirectoryEntryRetrieveActionResponse;
  }

  public void setCorrespondentBankDirectoryEntryRetrieveActionResponse(String correspondentBankDirectoryEntryRetrieveActionResponse) {
    this.correspondentBankDirectoryEntryRetrieveActionResponse = correspondentBankDirectoryEntryRetrieveActionResponse;
  }


  /**
   * Get correspondentBankDirectoryEntryInstanceReportRecord
   * @return correspondentBankDirectoryEntryInstanceReportRecord
  **/

  public CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceReportRecord getCorrespondentBankDirectoryEntryInstanceReportRecord() {
    return correspondentBankDirectoryEntryInstanceReportRecord;
  }

  public void setCorrespondentBankDirectoryEntryInstanceReportRecord(CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceReportRecord correspondentBankDirectoryEntryInstanceReportRecord) {
    this.correspondentBankDirectoryEntryInstanceReportRecord = correspondentBankDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get correspondentBankDirectoryEntryInstanceAnalysis
   * @return correspondentBankDirectoryEntryInstanceAnalysis
  **/

  public CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceAnalysis getCorrespondentBankDirectoryEntryInstanceAnalysis() {
    return correspondentBankDirectoryEntryInstanceAnalysis;
  }

  public void setCorrespondentBankDirectoryEntryInstanceAnalysis(CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceAnalysis correspondentBankDirectoryEntryInstanceAnalysis) {
    this.correspondentBankDirectoryEntryInstanceAnalysis = correspondentBankDirectoryEntryInstanceAnalysis;
  }


}

