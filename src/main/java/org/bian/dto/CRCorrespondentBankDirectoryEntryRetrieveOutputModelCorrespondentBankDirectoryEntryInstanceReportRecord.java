package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceReportRecord
 */
public class CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceReportRecord   {
  private String correspondentBankDirectoryEntryInstanceReportData = null;

  private String correspondentBankDirectoryEntryInstanceReportType = null;

  private Object correspondentBankDirectoryEntryInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return correspondentBankDirectoryEntryInstanceReportData
  **/

  public String getCorrespondentBankDirectoryEntryInstanceReportData() {
    return correspondentBankDirectoryEntryInstanceReportData;
  }

  public void setCorrespondentBankDirectoryEntryInstanceReportData(String correspondentBankDirectoryEntryInstanceReportData) {
    this.correspondentBankDirectoryEntryInstanceReportData = correspondentBankDirectoryEntryInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return correspondentBankDirectoryEntryInstanceReportType
  **/

  public String getCorrespondentBankDirectoryEntryInstanceReportType() {
    return correspondentBankDirectoryEntryInstanceReportType;
  }

  public void setCorrespondentBankDirectoryEntryInstanceReportType(String correspondentBankDirectoryEntryInstanceReportType) {
    this.correspondentBankDirectoryEntryInstanceReportType = correspondentBankDirectoryEntryInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return correspondentBankDirectoryEntryInstanceReport
  **/

  public Object getCorrespondentBankDirectoryEntryInstanceReport() {
    return correspondentBankDirectoryEntryInstanceReport;
  }

  public void setCorrespondentBankDirectoryEntryInstanceReport(Object correspondentBankDirectoryEntryInstanceReport) {
    this.correspondentBankDirectoryEntryInstanceReport = correspondentBankDirectoryEntryInstanceReport;
  }


}

