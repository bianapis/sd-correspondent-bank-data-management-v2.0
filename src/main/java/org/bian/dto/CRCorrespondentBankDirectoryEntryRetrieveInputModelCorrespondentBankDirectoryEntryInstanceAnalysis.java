package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankDirectoryEntryRetrieveInputModelCorrespondentBankDirectoryEntryInstanceAnalysis
 */
public class CRCorrespondentBankDirectoryEntryRetrieveInputModelCorrespondentBankDirectoryEntryInstanceAnalysis   {
  private String correspondentBankDirectoryEntryInstanceAnalysisReference = null;

  private String correspondentBankDirectoryEntryInstanceAnalysisReportType = null;

  private String correspondentBankDirectoryEntryInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return correspondentBankDirectoryEntryInstanceAnalysisReference
  **/

  public String getCorrespondentBankDirectoryEntryInstanceAnalysisReference() {
    return correspondentBankDirectoryEntryInstanceAnalysisReference;
  }

  public void setCorrespondentBankDirectoryEntryInstanceAnalysisReference(String correspondentBankDirectoryEntryInstanceAnalysisReference) {
    this.correspondentBankDirectoryEntryInstanceAnalysisReference = correspondentBankDirectoryEntryInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return correspondentBankDirectoryEntryInstanceAnalysisParameters
  **/

  public String getCorrespondentBankDirectoryEntryInstanceAnalysisParameters() {
    return correspondentBankDirectoryEntryInstanceAnalysisParameters;
  }

  public void setCorrespondentBankDirectoryEntryInstanceAnalysisParameters(String correspondentBankDirectoryEntryInstanceAnalysisParameters) {
    this.correspondentBankDirectoryEntryInstanceAnalysisParameters = correspondentBankDirectoryEntryInstanceAnalysisParameters;
  }


}

