package org.hl7.fhir.r5.terminologies.validation;

import java.util.List;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r5.model.OperationOutcome.OperationOutcomeIssueComponent;

public class VSCheckerException extends FHIRException {

  private List<OperationOutcomeIssueComponent> issues;

  public VSCheckerException(String message, List<OperationOutcomeIssueComponent> issues) {
    super(message);
    this.issues = issues;
  }

  public List<OperationOutcomeIssueComponent> getIssues() {
    return issues;
  }

  private static final long serialVersionUID = -5889505119633054187L;
  
}