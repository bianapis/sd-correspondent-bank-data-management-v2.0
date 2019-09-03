package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceRecord
 */
public class CRCorrespondentBankDirectoryEntryRetrieveOutputModelCorrespondentBankDirectoryEntryInstanceRecord   {
  private String correspondentBankReference = null;

  private String clearingSortCodes = null;

  private String contactAddresses = null;

  private String legalEntityIdentifiers = null;

  private String bankHierarchy = null;

  private String holidayTimezoneSchedule = null;

  private String vostroAccountReference = null;

  private String nostroMirrorAccountReference = null;

  private String correspondentBankAgreementReference = null;

  private String correspondentBankAgreement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the correspondent bank (e.g. BIC Codes) 
   * @return correspondentBankReference
  **/

  public String getCorrespondentBankReference() {
    return correspondentBankReference;
  }

  public void setCorrespondentBankReference(String correspondentBankReference) {
    this.correspondentBankReference = correspondentBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Clearing and sorting code used in payment processing 
   * @return clearingSortCodes
  **/

  public String getClearingSortCodes() {
    return clearingSortCodes;
  }

  public void setClearingSortCodes(String clearingSortCodes) {
    this.clearingSortCodes = clearingSortCodes;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Contact details for key parties at the bank 
   * @return contactAddresses
  **/

  public String getContactAddresses() {
    return contactAddresses;
  }

  public void setContactAddresses(String contactAddresses) {
    this.contactAddresses = contactAddresses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: One or more associated legal entity references associated with the bank 
   * @return legalEntityIdentifiers
  **/

  public String getLegalEntityIdentifiers() {
    return legalEntityIdentifiers;
  }

  public void setLegalEntityIdentifiers(String legalEntityIdentifiers) {
    this.legalEntityIdentifiers = legalEntityIdentifiers;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the legal entity hierarchy at the bank 
   * @return bankHierarchy
  **/

  public String getBankHierarchy() {
    return bankHierarchy;
  }

  public void setBankHierarchy(String bankHierarchy) {
    this.bankHierarchy = bankHierarchy;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A reference to the bank calendar details for payment processing 
   * @return holidayTimezoneSchedule
  **/

  public String getHolidayTimezoneSchedule() {
    return holidayTimezoneSchedule;
  }

  public void setHolidayTimezoneSchedule(String holidayTimezoneSchedule) {
    this.holidayTimezoneSchedule = holidayTimezoneSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated vostro account (your money at our bank) 
   * @return vostroAccountReference
  **/

  public String getVostroAccountReference() {
    return vostroAccountReference;
  }

  public void setVostroAccountReference(String vostroAccountReference) {
    this.vostroAccountReference = vostroAccountReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated nostro account (our money at your bank) 
   * @return nostroMirrorAccountReference
  **/

  public String getNostroMirrorAccountReference() {
    return nostroMirrorAccountReference;
  }

  public void setNostroMirrorAccountReference(String nostroMirrorAccountReference) {
    this.nostroMirrorAccountReference = nostroMirrorAccountReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the bank agreement (that will detail limits, fees, preferred payments mechanism) 
   * @return correspondentBankAgreementReference
  **/

  public String getCorrespondentBankAgreementReference() {
    return correspondentBankAgreementReference;
  }

  public void setCorrespondentBankAgreementReference(String correspondentBankAgreementReference) {
    this.correspondentBankAgreementReference = correspondentBankAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The correspondent bank agreement (details agreed limits, fees, preferred payments mechanism, etc.) 
   * @return correspondentBankAgreement
  **/

  public String getCorrespondentBankAgreement() {
    return correspondentBankAgreement;
  }

  public void setCorrespondentBankAgreement(String correspondentBankAgreement) {
    this.correspondentBankAgreement = correspondentBankAgreement;
  }


}

