package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceAnalysis
 */
public class CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceAnalysis   {
  private String correspondentBankDirectoryEntryInstanceAnalysisData = null;

  private String correspondentBankDirectoryEntryInstanceAnalysisReportType = null;

  private Object correspondentBankDirectoryEntryInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return correspondentBankDirectoryEntryInstanceAnalysisData
  **/

  public String getCorrespondentBankDirectoryEntryInstanceAnalysisData() {
    return correspondentBankDirectoryEntryInstanceAnalysisData;
  }

  public void setCorrespondentBankDirectoryEntryInstanceAnalysisData(String correspondentBankDirectoryEntryInstanceAnalysisData) {
    this.correspondentBankDirectoryEntryInstanceAnalysisData = correspondentBankDirectoryEntryInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return correspondentBankDirectoryEntryInstanceAnalysisReportType
  **/

  public String getCorrespondentBankDirectoryEntryInstanceAnalysisReportType() {
    return correspondentBankDirectoryEntryInstanceAnalysisReportType;
  }

  public void setCorrespondentBankDirectoryEntryInstanceAnalysisReportType(String correspondentBankDirectoryEntryInstanceAnalysisReportType) {
    this.correspondentBankDirectoryEntryInstanceAnalysisReportType = correspondentBankDirectoryEntryInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return correspondentBankDirectoryEntryInstanceAnalysisReport
  **/

  public Object getCorrespondentBankDirectoryEntryInstanceAnalysisReport() {
    return correspondentBankDirectoryEntryInstanceAnalysisReport;
  }

  public void setCorrespondentBankDirectoryEntryInstanceAnalysisReport(Object correspondentBankDirectoryEntryInstanceAnalysisReport) {
    this.correspondentBankDirectoryEntryInstanceAnalysisReport = correspondentBankDirectoryEntryInstanceAnalysisReport;
  }


}

