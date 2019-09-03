package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankDirectoryEntryRetrieveInputModelCorrespondentBankDirectoryEntryInstanceReportRecord
 */
public class CRCorrespondentBankDirectoryEntryRetrieveInputModelCorrespondentBankDirectoryEntryInstanceReportRecord   {
  private String correspondentBankDirectoryEntryInstanceReportReference = null;

  private String correspondentBankDirectoryEntryInstanceReportType = null;

  private String correspondentBankDirectoryEntryInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return correspondentBankDirectoryEntryInstanceReportReference
  **/

  public String getCorrespondentBankDirectoryEntryInstanceReportReference() {
    return correspondentBankDirectoryEntryInstanceReportReference;
  }

  public void setCorrespondentBankDirectoryEntryInstanceReportReference(String correspondentBankDirectoryEntryInstanceReportReference) {
    this.correspondentBankDirectoryEntryInstanceReportReference = correspondentBankDirectoryEntryInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return correspondentBankDirectoryEntryInstanceReportParameters
  **/

  public String getCorrespondentBankDirectoryEntryInstanceReportParameters() {
    return correspondentBankDirectoryEntryInstanceReportParameters;
  }

  public void setCorrespondentBankDirectoryEntryInstanceReportParameters(String correspondentBankDirectoryEntryInstanceReportParameters) {
    this.correspondentBankDirectoryEntryInstanceReportParameters = correspondentBankDirectoryEntryInstanceReportParameters;
  }


}

