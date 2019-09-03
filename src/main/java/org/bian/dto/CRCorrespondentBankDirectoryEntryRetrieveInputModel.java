package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankDirectoryEntryRetrieveInputModelCorrespondentBankDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRCorrespondentBankDirectoryEntryRetrieveInputModelCorrespondentBankDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankDirectoryEntryRetrieveInputModel
 */
public class CRCorrespondentBankDirectoryEntryRetrieveInputModel   {
  private Object correspondentBankDirectoryEntryRetrieveActionTaskRecord = null;

  private String correspondentBankDirectoryEntryRetrieveActionRequest = null;

  private CRCorrespondentBankDirectoryEntryRetrieveInputModelCorrespondentBankDirectoryEntryInstanceReportRecord correspondentBankDirectoryEntryInstanceReportRecord = null;

  private CRCorrespondentBankDirectoryEntryRetrieveInputModelCorrespondentBankDirectoryEntryInstanceAnalysis correspondentBankDirectoryEntryInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return correspondentBankDirectoryEntryRetrieveActionRequest
  **/

  public String getCorrespondentBankDirectoryEntryRetrieveActionRequest() {
    return correspondentBankDirectoryEntryRetrieveActionRequest;
  }

  public void setCorrespondentBankDirectoryEntryRetrieveActionRequest(String correspondentBankDirectoryEntryRetrieveActionRequest) {
    this.correspondentBankDirectoryEntryRetrieveActionRequest = correspondentBankDirectoryEntryRetrieveActionRequest;
  }


  /**
   * Get correspondentBankDirectoryEntryInstanceReportRecord
   * @return correspondentBankDirectoryEntryInstanceReportRecord
  **/

  public CRCorrespondentBankDirectoryEntryRetrieveInputModelCorrespondentBankDirectoryEntryInstanceReportRecord getCorrespondentBankDirectoryEntryInstanceReportRecord() {
    return correspondentBankDirectoryEntryInstanceReportRecord;
  }

  public void setCorrespondentBankDirectoryEntryInstanceReportRecord(CRCorrespondentBankDirectoryEntryRetrieveInputModelCorrespondentBankDirectoryEntryInstanceReportRecord correspondentBankDirectoryEntryInstanceReportRecord) {
    this.correspondentBankDirectoryEntryInstanceReportRecord = correspondentBankDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get correspondentBankDirectoryEntryInstanceAnalysis
   * @return correspondentBankDirectoryEntryInstanceAnalysis
  **/

  public CRCorrespondentBankDirectoryEntryRetrieveInputModelCorrespondentBankDirectoryEntryInstanceAnalysis getCorrespondentBankDirectoryEntryInstanceAnalysis() {
    return correspondentBankDirectoryEntryInstanceAnalysis;
  }

  public void setCorrespondentBankDirectoryEntryInstanceAnalysis(CRCorrespondentBankDirectoryEntryRetrieveInputModelCorrespondentBankDirectoryEntryInstanceAnalysis correspondentBankDirectoryEntryInstanceAnalysis) {
    this.correspondentBankDirectoryEntryInstanceAnalysis = correspondentBankDirectoryEntryInstanceAnalysis;
  }


}

