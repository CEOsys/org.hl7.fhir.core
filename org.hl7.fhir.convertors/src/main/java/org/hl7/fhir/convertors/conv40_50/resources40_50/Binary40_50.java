package org.hl7.fhir.convertors.conv40_50.resources40_50;

import org.hl7.fhir.convertors.context.ConversionContext40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.primitive40_50.Base64Binary40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.primitive40_50.Code40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.special40_50.Reference40_50;
import org.hl7.fhir.exceptions.FHIRException;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/
// Generated on Sun, Feb 24, 2019 11:37+1100 for FHIR v4.0.0
public class Binary40_50 {

  public static org.hl7.fhir.r5.model.Binary convertBinary(org.hl7.fhir.r4.model.Binary src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r5.model.Binary tgt = new org.hl7.fhir.r5.model.Binary();
    ConversionContext40_50.INSTANCE.getVersionConvertor_40_50().copyResource(src, tgt);
    if (src.hasContentType())
      tgt.setContentTypeElement(Code40_50.convertCode(src.getContentTypeElement()));
    if (src.hasSecurityContext())
      tgt.setSecurityContext(Reference40_50.convertReference(src.getSecurityContext()));
    if (src.hasData())
      tgt.setDataElement(Base64Binary40_50.convertBase64Binary(src.getDataElement()));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.Binary convertBinary(org.hl7.fhir.r5.model.Binary src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.Binary tgt = new org.hl7.fhir.r4.model.Binary();
    ConversionContext40_50.INSTANCE.getVersionConvertor_40_50().copyResource(src, tgt);
    if (src.hasContentType())
      tgt.setContentTypeElement(Code40_50.convertCode(src.getContentTypeElement()));
    if (src.hasSecurityContext())
      tgt.setSecurityContext(Reference40_50.convertReference(src.getSecurityContext()));
    if (src.hasData())
      tgt.setDataElement(Base64Binary40_50.convertBase64Binary(src.getDataElement()));
    return tgt;
  }
}