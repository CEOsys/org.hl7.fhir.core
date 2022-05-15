package org.hl7.fhir.r5.model;


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, \
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this \
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, \
     this list of conditions and the following disclaimer in the documentation \
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND \
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED \
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. \
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, \
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT \
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR \
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, \
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) \
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE \
  POSSIBILITY OF SUCH DAMAGE.
  */

// Generated on Sun, May 15, 2022 21:38+0200 for FHIR v5.0.0-cibuild

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r5.model.Enumerations.*;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * Representation of a molecular sequence.
 */
@ResourceDef(name="MolecularSequence", profile="http://hl7.org/fhir/StructureDefinition/MolecularSequence")
public class MolecularSequence extends DomainResource {

    public enum OrientationType {
        /**
         * Sense orientation of reference sequence.
         */
        SENSE, 
        /**
         * Antisense orientation of reference sequence.
         */
        ANTISENSE, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static OrientationType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("sense".equals(codeString))
          return SENSE;
        if ("antisense".equals(codeString))
          return ANTISENSE;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown OrientationType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case SENSE: return "sense";
            case ANTISENSE: return "antisense";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case SENSE: return "http://hl7.org/fhir/orientation-type";
            case ANTISENSE: return "http://hl7.org/fhir/orientation-type";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case SENSE: return "Sense orientation of reference sequence.";
            case ANTISENSE: return "Antisense orientation of reference sequence.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case SENSE: return "Sense orientation of referenceSeq";
            case ANTISENSE: return "Antisense orientation of referenceSeq";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class OrientationTypeEnumFactory implements EnumFactory<OrientationType> {
    public OrientationType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("sense".equals(codeString))
          return OrientationType.SENSE;
        if ("antisense".equals(codeString))
          return OrientationType.ANTISENSE;
        throw new IllegalArgumentException("Unknown OrientationType code '"+codeString+"'");
        }
        public Enumeration<OrientationType> fromType(Base code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<OrientationType>(this);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("sense".equals(codeString))
          return new Enumeration<OrientationType>(this, OrientationType.SENSE);
        if ("antisense".equals(codeString))
          return new Enumeration<OrientationType>(this, OrientationType.ANTISENSE);
        throw new FHIRException("Unknown OrientationType code '"+codeString+"'");
        }
    public String toCode(OrientationType code) {
      if (code == OrientationType.SENSE)
        return "sense";
      if (code == OrientationType.ANTISENSE)
        return "antisense";
      return "?";
      }
    public String toSystem(OrientationType code) {
      return code.getSystem();
      }
    }

    public enum SequenceType {
        /**
         * Amino acid sequence.
         */
        AA, 
        /**
         * DNA Sequence.
         */
        DNA, 
        /**
         * RNA Sequence.
         */
        RNA, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static SequenceType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("aa".equals(codeString))
          return AA;
        if ("dna".equals(codeString))
          return DNA;
        if ("rna".equals(codeString))
          return RNA;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown SequenceType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case AA: return "aa";
            case DNA: return "dna";
            case RNA: return "rna";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case AA: return "http://hl7.org/fhir/sequence-type";
            case DNA: return "http://hl7.org/fhir/sequence-type";
            case RNA: return "http://hl7.org/fhir/sequence-type";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case AA: return "Amino acid sequence.";
            case DNA: return "DNA Sequence.";
            case RNA: return "RNA Sequence.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case AA: return "AA Sequence";
            case DNA: return "DNA Sequence";
            case RNA: return "RNA Sequence";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class SequenceTypeEnumFactory implements EnumFactory<SequenceType> {
    public SequenceType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("aa".equals(codeString))
          return SequenceType.AA;
        if ("dna".equals(codeString))
          return SequenceType.DNA;
        if ("rna".equals(codeString))
          return SequenceType.RNA;
        throw new IllegalArgumentException("Unknown SequenceType code '"+codeString+"'");
        }
        public Enumeration<SequenceType> fromType(Base code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<SequenceType>(this);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("aa".equals(codeString))
          return new Enumeration<SequenceType>(this, SequenceType.AA);
        if ("dna".equals(codeString))
          return new Enumeration<SequenceType>(this, SequenceType.DNA);
        if ("rna".equals(codeString))
          return new Enumeration<SequenceType>(this, SequenceType.RNA);
        throw new FHIRException("Unknown SequenceType code '"+codeString+"'");
        }
    public String toCode(SequenceType code) {
      if (code == SequenceType.AA)
        return "aa";
      if (code == SequenceType.DNA)
        return "dna";
      if (code == SequenceType.RNA)
        return "rna";
      return "?";
      }
    public String toSystem(SequenceType code) {
      return code.getSystem();
      }
    }

    public enum StrandType {
        /**
         * Watson strand of reference sequence.
         */
        WATSON, 
        /**
         * Crick strand of reference sequence.
         */
        CRICK, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static StrandType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("watson".equals(codeString))
          return WATSON;
        if ("crick".equals(codeString))
          return CRICK;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown StrandType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case WATSON: return "watson";
            case CRICK: return "crick";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case WATSON: return "http://hl7.org/fhir/strand-type";
            case CRICK: return "http://hl7.org/fhir/strand-type";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case WATSON: return "Watson strand of reference sequence.";
            case CRICK: return "Crick strand of reference sequence.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case WATSON: return "Watson strand of referenceSeq";
            case CRICK: return "Crick strand of referenceSeq";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class StrandTypeEnumFactory implements EnumFactory<StrandType> {
    public StrandType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("watson".equals(codeString))
          return StrandType.WATSON;
        if ("crick".equals(codeString))
          return StrandType.CRICK;
        throw new IllegalArgumentException("Unknown StrandType code '"+codeString+"'");
        }
        public Enumeration<StrandType> fromType(Base code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<StrandType>(this);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("watson".equals(codeString))
          return new Enumeration<StrandType>(this, StrandType.WATSON);
        if ("crick".equals(codeString))
          return new Enumeration<StrandType>(this, StrandType.CRICK);
        throw new FHIRException("Unknown StrandType code '"+codeString+"'");
        }
    public String toCode(StrandType code) {
      if (code == StrandType.WATSON)
        return "watson";
      if (code == StrandType.CRICK)
        return "crick";
      return "?";
      }
    public String toSystem(StrandType code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class MolecularSequenceRelativeComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * These are different ways of identifying nucleotides or amino acids within a sequence. Different databases and file types may use different systems. For detail definitions, see https://loinc.org/92822-6/ for more detail.
         */
        @Child(name = "coordinateSystem", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Ways of identifying nucleotides or amino acids within a sequence", formalDefinition="These are different ways of identifying nucleotides or amino acids within a sequence. Different databases and file types may use different systems. For detail definitions, see https://loinc.org/92822-6/ for more detail." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://loinc.org/LL5323-2/")
        protected CodeableConcept coordinateSystem;

        /**
         * A sequence that is used as a reference to describe variants that are present in a sequence analyzed.
         */
        @Child(name = "reference", type = {}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="A sequence used as reference", formalDefinition="A sequence that is used as a reference to describe variants that are present in a sequence analyzed." )
        protected MolecularSequenceRelativeReferenceComponent reference;

        /**
         * Changes in sequence from the reference.
         */
        @Child(name = "edit", type = {}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Changes in sequence from the reference", formalDefinition="Changes in sequence from the reference." )
        protected List<MolecularSequenceRelativeEditComponent> edit;

        private static final long serialVersionUID = 1575876090L;

    /**
     * Constructor
     */
      public MolecularSequenceRelativeComponent() {
        super();
      }

    /**
     * Constructor
     */
      public MolecularSequenceRelativeComponent(CodeableConcept coordinateSystem) {
        super();
        this.setCoordinateSystem(coordinateSystem);
      }

        /**
         * @return {@link #coordinateSystem} (These are different ways of identifying nucleotides or amino acids within a sequence. Different databases and file types may use different systems. For detail definitions, see https://loinc.org/92822-6/ for more detail.)
         */
        public CodeableConcept getCoordinateSystem() { 
          if (this.coordinateSystem == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeComponent.coordinateSystem");
            else if (Configuration.doAutoCreate())
              this.coordinateSystem = new CodeableConcept(); // cc
          return this.coordinateSystem;
        }

        public boolean hasCoordinateSystem() { 
          return this.coordinateSystem != null && !this.coordinateSystem.isEmpty();
        }

        /**
         * @param value {@link #coordinateSystem} (These are different ways of identifying nucleotides or amino acids within a sequence. Different databases and file types may use different systems. For detail definitions, see https://loinc.org/92822-6/ for more detail.)
         */
        public MolecularSequenceRelativeComponent setCoordinateSystem(CodeableConcept value) { 
          this.coordinateSystem = value;
          return this;
        }

        /**
         * @return {@link #reference} (A sequence that is used as a reference to describe variants that are present in a sequence analyzed.)
         */
        public MolecularSequenceRelativeReferenceComponent getReference() { 
          if (this.reference == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeComponent.reference");
            else if (Configuration.doAutoCreate())
              this.reference = new MolecularSequenceRelativeReferenceComponent(); // cc
          return this.reference;
        }

        public boolean hasReference() { 
          return this.reference != null && !this.reference.isEmpty();
        }

        /**
         * @param value {@link #reference} (A sequence that is used as a reference to describe variants that are present in a sequence analyzed.)
         */
        public MolecularSequenceRelativeComponent setReference(MolecularSequenceRelativeReferenceComponent value) { 
          this.reference = value;
          return this;
        }

        /**
         * @return {@link #edit} (Changes in sequence from the reference.)
         */
        public List<MolecularSequenceRelativeEditComponent> getEdit() { 
          if (this.edit == null)
            this.edit = new ArrayList<MolecularSequenceRelativeEditComponent>();
          return this.edit;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public MolecularSequenceRelativeComponent setEdit(List<MolecularSequenceRelativeEditComponent> theEdit) { 
          this.edit = theEdit;
          return this;
        }

        public boolean hasEdit() { 
          if (this.edit == null)
            return false;
          for (MolecularSequenceRelativeEditComponent item : this.edit)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public MolecularSequenceRelativeEditComponent addEdit() { //3
          MolecularSequenceRelativeEditComponent t = new MolecularSequenceRelativeEditComponent();
          if (this.edit == null)
            this.edit = new ArrayList<MolecularSequenceRelativeEditComponent>();
          this.edit.add(t);
          return t;
        }

        public MolecularSequenceRelativeComponent addEdit(MolecularSequenceRelativeEditComponent t) { //3
          if (t == null)
            return this;
          if (this.edit == null)
            this.edit = new ArrayList<MolecularSequenceRelativeEditComponent>();
          this.edit.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #edit}, creating it if it does not already exist {3}
         */
        public MolecularSequenceRelativeEditComponent getEditFirstRep() { 
          if (getEdit().isEmpty()) {
            addEdit();
          }
          return getEdit().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("coordinateSystem", "CodeableConcept", "These are different ways of identifying nucleotides or amino acids within a sequence. Different databases and file types may use different systems. For detail definitions, see https://loinc.org/92822-6/ for more detail.", 0, 1, coordinateSystem));
          children.add(new Property("reference", "", "A sequence that is used as a reference to describe variants that are present in a sequence analyzed.", 0, 1, reference));
          children.add(new Property("edit", "", "Changes in sequence from the reference.", 0, java.lang.Integer.MAX_VALUE, edit));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 354212295: /*coordinateSystem*/  return new Property("coordinateSystem", "CodeableConcept", "These are different ways of identifying nucleotides or amino acids within a sequence. Different databases and file types may use different systems. For detail definitions, see https://loinc.org/92822-6/ for more detail.", 0, 1, coordinateSystem);
          case -925155509: /*reference*/  return new Property("reference", "", "A sequence that is used as a reference to describe variants that are present in a sequence analyzed.", 0, 1, reference);
          case 3108362: /*edit*/  return new Property("edit", "", "Changes in sequence from the reference.", 0, java.lang.Integer.MAX_VALUE, edit);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 354212295: /*coordinateSystem*/ return this.coordinateSystem == null ? new Base[0] : new Base[] {this.coordinateSystem}; // CodeableConcept
        case -925155509: /*reference*/ return this.reference == null ? new Base[0] : new Base[] {this.reference}; // MolecularSequenceRelativeReferenceComponent
        case 3108362: /*edit*/ return this.edit == null ? new Base[0] : this.edit.toArray(new Base[this.edit.size()]); // MolecularSequenceRelativeEditComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 354212295: // coordinateSystem
          this.coordinateSystem = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -925155509: // reference
          this.reference = (MolecularSequenceRelativeReferenceComponent) value; // MolecularSequenceRelativeReferenceComponent
          return value;
        case 3108362: // edit
          this.getEdit().add((MolecularSequenceRelativeEditComponent) value); // MolecularSequenceRelativeEditComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("coordinateSystem")) {
          this.coordinateSystem = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("reference")) {
          this.reference = (MolecularSequenceRelativeReferenceComponent) value; // MolecularSequenceRelativeReferenceComponent
        } else if (name.equals("edit")) {
          this.getEdit().add((MolecularSequenceRelativeEditComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 354212295:  return getCoordinateSystem();
        case -925155509:  return getReference();
        case 3108362:  return addEdit(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 354212295: /*coordinateSystem*/ return new String[] {"CodeableConcept"};
        case -925155509: /*reference*/ return new String[] {};
        case 3108362: /*edit*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("coordinateSystem")) {
          this.coordinateSystem = new CodeableConcept();
          return this.coordinateSystem;
        }
        else if (name.equals("reference")) {
          this.reference = new MolecularSequenceRelativeReferenceComponent();
          return this.reference;
        }
        else if (name.equals("edit")) {
          return addEdit();
        }
        else
          return super.addChild(name);
      }

      public MolecularSequenceRelativeComponent copy() {
        MolecularSequenceRelativeComponent dst = new MolecularSequenceRelativeComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(MolecularSequenceRelativeComponent dst) {
        super.copyValues(dst);
        dst.coordinateSystem = coordinateSystem == null ? null : coordinateSystem.copy();
        dst.reference = reference == null ? null : reference.copy();
        if (edit != null) {
          dst.edit = new ArrayList<MolecularSequenceRelativeEditComponent>();
          for (MolecularSequenceRelativeEditComponent i : edit)
            dst.edit.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof MolecularSequenceRelativeComponent))
          return false;
        MolecularSequenceRelativeComponent o = (MolecularSequenceRelativeComponent) other_;
        return compareDeep(coordinateSystem, o.coordinateSystem, true) && compareDeep(reference, o.reference, true)
           && compareDeep(edit, o.edit, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof MolecularSequenceRelativeComponent))
          return false;
        MolecularSequenceRelativeComponent o = (MolecularSequenceRelativeComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(coordinateSystem, reference
          , edit);
      }

  public String fhirType() {
    return "MolecularSequence.relative";

  }

  }

    @Block()
    public static class MolecularSequenceRelativeReferenceComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)).
         */
        @Child(name = "chromosome", type = {CodeableConcept.class}, order=1, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Chromosome Identifier", formalDefinition="Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340))." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://loinc.org/LL2938-0/")
        protected CodeableConcept chromosome;

        /**
         * The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used.
         */
        @Child(name = "genomeBuild", type = {StringType.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'", formalDefinition="The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used." )
        protected StringType genomeBuild;

        /**
         * A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the "sense" strand, and the opposite complementary strand is the "antisense" strand.
         */
        @Child(name = "orientation", type = {CodeType.class}, order=3, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="sense | antisense", formalDefinition="A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the \"sense\" strand, and the opposite complementary strand is the \"antisense\" strand." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/orientation-type")
        protected Enumeration<OrientationType> orientation;

        /**
         * This field carries the ID for the reference sequence. For this ID use either the NCBI genomic nucleotide RefSeq IDs with their version number (see: NCBI.NLM.NIH.Gov/RefSeq) or use the LRG identifiers when they become available. (See- Report sponsored by GEN2PHEN at the European Bioinformatics Institute at Hinxton UK April 24-25, 2008).
         */
        @Child(name = "referenceSeqId", type = {CodeableConcept.class}, order=4, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Reference identifier", formalDefinition="This field carries the ID for the reference sequence. For this ID use either the NCBI genomic nucleotide RefSeq IDs with their version number (see: NCBI.NLM.NIH.Gov/RefSeq) or use the LRG identifiers when they become available. (See- Report sponsored by GEN2PHEN at the European Bioinformatics Institute at Hinxton UK April 24-25, 2008)." )
        protected CodeableConcept referenceSeqId;

        /**
         * A pointer to another MolecularSequence entity as reference sequence.
         */
        @Child(name = "referenceSeqPointer", type = {MolecularSequence.class}, order=5, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="A pointer to another MolecularSequence entity as reference sequence", formalDefinition="A pointer to another MolecularSequence entity as reference sequence." )
        protected Reference referenceSeqPointer;

        /**
         * A string like "ACGT".
         */
        @Child(name = "referenceSeqString", type = {StringType.class}, order=6, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="A string to represent reference sequence", formalDefinition="A string like \"ACGT\"." )
        protected StringType referenceSeqString;

        /**
         * An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.
         */
        @Child(name = "strand", type = {CodeType.class}, order=7, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="watson | crick", formalDefinition="An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/strand-type")
        protected Enumeration<StrandType> strand;

        /**
         * Start position of the window on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
         */
        @Child(name = "windowStart", type = {IntegerType.class}, order=8, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Start position of the window on the  reference sequence", formalDefinition="Start position of the window on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive." )
        protected IntegerType windowStart;

        /**
         * End position of the window on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
         */
        @Child(name = "windowEnd", type = {IntegerType.class}, order=9, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="End position of the window on the reference sequence", formalDefinition="End position of the window on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position." )
        protected IntegerType windowEnd;

        private static final long serialVersionUID = -257666326L;

    /**
     * Constructor
     */
      public MolecularSequenceRelativeReferenceComponent() {
        super();
      }

        /**
         * @return {@link #chromosome} (Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)).)
         */
        public CodeableConcept getChromosome() { 
          if (this.chromosome == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeReferenceComponent.chromosome");
            else if (Configuration.doAutoCreate())
              this.chromosome = new CodeableConcept(); // cc
          return this.chromosome;
        }

        public boolean hasChromosome() { 
          return this.chromosome != null && !this.chromosome.isEmpty();
        }

        /**
         * @param value {@link #chromosome} (Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)).)
         */
        public MolecularSequenceRelativeReferenceComponent setChromosome(CodeableConcept value) { 
          this.chromosome = value;
          return this;
        }

        /**
         * @return {@link #genomeBuild} (The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used.). This is the underlying object with id, value and extensions. The accessor "getGenomeBuild" gives direct access to the value
         */
        public StringType getGenomeBuildElement() { 
          if (this.genomeBuild == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeReferenceComponent.genomeBuild");
            else if (Configuration.doAutoCreate())
              this.genomeBuild = new StringType(); // bb
          return this.genomeBuild;
        }

        public boolean hasGenomeBuildElement() { 
          return this.genomeBuild != null && !this.genomeBuild.isEmpty();
        }

        public boolean hasGenomeBuild() { 
          return this.genomeBuild != null && !this.genomeBuild.isEmpty();
        }

        /**
         * @param value {@link #genomeBuild} (The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used.). This is the underlying object with id, value and extensions. The accessor "getGenomeBuild" gives direct access to the value
         */
        public MolecularSequenceRelativeReferenceComponent setGenomeBuildElement(StringType value) { 
          this.genomeBuild = value;
          return this;
        }

        /**
         * @return The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used.
         */
        public String getGenomeBuild() { 
          return this.genomeBuild == null ? null : this.genomeBuild.getValue();
        }

        /**
         * @param value The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used.
         */
        public MolecularSequenceRelativeReferenceComponent setGenomeBuild(String value) { 
          if (Utilities.noString(value))
            this.genomeBuild = null;
          else {
            if (this.genomeBuild == null)
              this.genomeBuild = new StringType();
            this.genomeBuild.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #orientation} (A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the "sense" strand, and the opposite complementary strand is the "antisense" strand.). This is the underlying object with id, value and extensions. The accessor "getOrientation" gives direct access to the value
         */
        public Enumeration<OrientationType> getOrientationElement() { 
          if (this.orientation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeReferenceComponent.orientation");
            else if (Configuration.doAutoCreate())
              this.orientation = new Enumeration<OrientationType>(new OrientationTypeEnumFactory()); // bb
          return this.orientation;
        }

        public boolean hasOrientationElement() { 
          return this.orientation != null && !this.orientation.isEmpty();
        }

        public boolean hasOrientation() { 
          return this.orientation != null && !this.orientation.isEmpty();
        }

        /**
         * @param value {@link #orientation} (A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the "sense" strand, and the opposite complementary strand is the "antisense" strand.). This is the underlying object with id, value and extensions. The accessor "getOrientation" gives direct access to the value
         */
        public MolecularSequenceRelativeReferenceComponent setOrientationElement(Enumeration<OrientationType> value) { 
          this.orientation = value;
          return this;
        }

        /**
         * @return A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the "sense" strand, and the opposite complementary strand is the "antisense" strand.
         */
        public OrientationType getOrientation() { 
          return this.orientation == null ? null : this.orientation.getValue();
        }

        /**
         * @param value A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the "sense" strand, and the opposite complementary strand is the "antisense" strand.
         */
        public MolecularSequenceRelativeReferenceComponent setOrientation(OrientationType value) { 
          if (value == null)
            this.orientation = null;
          else {
            if (this.orientation == null)
              this.orientation = new Enumeration<OrientationType>(new OrientationTypeEnumFactory());
            this.orientation.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #referenceSeqId} (This field carries the ID for the reference sequence. For this ID use either the NCBI genomic nucleotide RefSeq IDs with their version number (see: NCBI.NLM.NIH.Gov/RefSeq) or use the LRG identifiers when they become available. (See- Report sponsored by GEN2PHEN at the European Bioinformatics Institute at Hinxton UK April 24-25, 2008).)
         */
        public CodeableConcept getReferenceSeqId() { 
          if (this.referenceSeqId == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeReferenceComponent.referenceSeqId");
            else if (Configuration.doAutoCreate())
              this.referenceSeqId = new CodeableConcept(); // cc
          return this.referenceSeqId;
        }

        public boolean hasReferenceSeqId() { 
          return this.referenceSeqId != null && !this.referenceSeqId.isEmpty();
        }

        /**
         * @param value {@link #referenceSeqId} (This field carries the ID for the reference sequence. For this ID use either the NCBI genomic nucleotide RefSeq IDs with their version number (see: NCBI.NLM.NIH.Gov/RefSeq) or use the LRG identifiers when they become available. (See- Report sponsored by GEN2PHEN at the European Bioinformatics Institute at Hinxton UK April 24-25, 2008).)
         */
        public MolecularSequenceRelativeReferenceComponent setReferenceSeqId(CodeableConcept value) { 
          this.referenceSeqId = value;
          return this;
        }

        /**
         * @return {@link #referenceSeqPointer} (A pointer to another MolecularSequence entity as reference sequence.)
         */
        public Reference getReferenceSeqPointer() { 
          if (this.referenceSeqPointer == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeReferenceComponent.referenceSeqPointer");
            else if (Configuration.doAutoCreate())
              this.referenceSeqPointer = new Reference(); // cc
          return this.referenceSeqPointer;
        }

        public boolean hasReferenceSeqPointer() { 
          return this.referenceSeqPointer != null && !this.referenceSeqPointer.isEmpty();
        }

        /**
         * @param value {@link #referenceSeqPointer} (A pointer to another MolecularSequence entity as reference sequence.)
         */
        public MolecularSequenceRelativeReferenceComponent setReferenceSeqPointer(Reference value) { 
          this.referenceSeqPointer = value;
          return this;
        }

        /**
         * @return {@link #referenceSeqString} (A string like "ACGT".). This is the underlying object with id, value and extensions. The accessor "getReferenceSeqString" gives direct access to the value
         */
        public StringType getReferenceSeqStringElement() { 
          if (this.referenceSeqString == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeReferenceComponent.referenceSeqString");
            else if (Configuration.doAutoCreate())
              this.referenceSeqString = new StringType(); // bb
          return this.referenceSeqString;
        }

        public boolean hasReferenceSeqStringElement() { 
          return this.referenceSeqString != null && !this.referenceSeqString.isEmpty();
        }

        public boolean hasReferenceSeqString() { 
          return this.referenceSeqString != null && !this.referenceSeqString.isEmpty();
        }

        /**
         * @param value {@link #referenceSeqString} (A string like "ACGT".). This is the underlying object with id, value and extensions. The accessor "getReferenceSeqString" gives direct access to the value
         */
        public MolecularSequenceRelativeReferenceComponent setReferenceSeqStringElement(StringType value) { 
          this.referenceSeqString = value;
          return this;
        }

        /**
         * @return A string like "ACGT".
         */
        public String getReferenceSeqString() { 
          return this.referenceSeqString == null ? null : this.referenceSeqString.getValue();
        }

        /**
         * @param value A string like "ACGT".
         */
        public MolecularSequenceRelativeReferenceComponent setReferenceSeqString(String value) { 
          if (Utilities.noString(value))
            this.referenceSeqString = null;
          else {
            if (this.referenceSeqString == null)
              this.referenceSeqString = new StringType();
            this.referenceSeqString.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #strand} (An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.). This is the underlying object with id, value and extensions. The accessor "getStrand" gives direct access to the value
         */
        public Enumeration<StrandType> getStrandElement() { 
          if (this.strand == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeReferenceComponent.strand");
            else if (Configuration.doAutoCreate())
              this.strand = new Enumeration<StrandType>(new StrandTypeEnumFactory()); // bb
          return this.strand;
        }

        public boolean hasStrandElement() { 
          return this.strand != null && !this.strand.isEmpty();
        }

        public boolean hasStrand() { 
          return this.strand != null && !this.strand.isEmpty();
        }

        /**
         * @param value {@link #strand} (An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.). This is the underlying object with id, value and extensions. The accessor "getStrand" gives direct access to the value
         */
        public MolecularSequenceRelativeReferenceComponent setStrandElement(Enumeration<StrandType> value) { 
          this.strand = value;
          return this;
        }

        /**
         * @return An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.
         */
        public StrandType getStrand() { 
          return this.strand == null ? null : this.strand.getValue();
        }

        /**
         * @param value An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.
         */
        public MolecularSequenceRelativeReferenceComponent setStrand(StrandType value) { 
          if (value == null)
            this.strand = null;
          else {
            if (this.strand == null)
              this.strand = new Enumeration<StrandType>(new StrandTypeEnumFactory());
            this.strand.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #windowStart} (Start position of the window on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.). This is the underlying object with id, value and extensions. The accessor "getWindowStart" gives direct access to the value
         */
        public IntegerType getWindowStartElement() { 
          if (this.windowStart == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeReferenceComponent.windowStart");
            else if (Configuration.doAutoCreate())
              this.windowStart = new IntegerType(); // bb
          return this.windowStart;
        }

        public boolean hasWindowStartElement() { 
          return this.windowStart != null && !this.windowStart.isEmpty();
        }

        public boolean hasWindowStart() { 
          return this.windowStart != null && !this.windowStart.isEmpty();
        }

        /**
         * @param value {@link #windowStart} (Start position of the window on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.). This is the underlying object with id, value and extensions. The accessor "getWindowStart" gives direct access to the value
         */
        public MolecularSequenceRelativeReferenceComponent setWindowStartElement(IntegerType value) { 
          this.windowStart = value;
          return this;
        }

        /**
         * @return Start position of the window on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
         */
        public int getWindowStart() { 
          return this.windowStart == null || this.windowStart.isEmpty() ? 0 : this.windowStart.getValue();
        }

        /**
         * @param value Start position of the window on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
         */
        public MolecularSequenceRelativeReferenceComponent setWindowStart(int value) { 
            if (this.windowStart == null)
              this.windowStart = new IntegerType();
            this.windowStart.setValue(value);
          return this;
        }

        /**
         * @return {@link #windowEnd} (End position of the window on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.). This is the underlying object with id, value and extensions. The accessor "getWindowEnd" gives direct access to the value
         */
        public IntegerType getWindowEndElement() { 
          if (this.windowEnd == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeReferenceComponent.windowEnd");
            else if (Configuration.doAutoCreate())
              this.windowEnd = new IntegerType(); // bb
          return this.windowEnd;
        }

        public boolean hasWindowEndElement() { 
          return this.windowEnd != null && !this.windowEnd.isEmpty();
        }

        public boolean hasWindowEnd() { 
          return this.windowEnd != null && !this.windowEnd.isEmpty();
        }

        /**
         * @param value {@link #windowEnd} (End position of the window on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.). This is the underlying object with id, value and extensions. The accessor "getWindowEnd" gives direct access to the value
         */
        public MolecularSequenceRelativeReferenceComponent setWindowEndElement(IntegerType value) { 
          this.windowEnd = value;
          return this;
        }

        /**
         * @return End position of the window on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
         */
        public int getWindowEnd() { 
          return this.windowEnd == null || this.windowEnd.isEmpty() ? 0 : this.windowEnd.getValue();
        }

        /**
         * @param value End position of the window on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
         */
        public MolecularSequenceRelativeReferenceComponent setWindowEnd(int value) { 
            if (this.windowEnd == null)
              this.windowEnd = new IntegerType();
            this.windowEnd.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("chromosome", "CodeableConcept", "Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)).", 0, 1, chromosome));
          children.add(new Property("genomeBuild", "string", "The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used.", 0, 1, genomeBuild));
          children.add(new Property("orientation", "code", "A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the \"sense\" strand, and the opposite complementary strand is the \"antisense\" strand.", 0, 1, orientation));
          children.add(new Property("referenceSeqId", "CodeableConcept", "This field carries the ID for the reference sequence. For this ID use either the NCBI genomic nucleotide RefSeq IDs with their version number (see: NCBI.NLM.NIH.Gov/RefSeq) or use the LRG identifiers when they become available. (See- Report sponsored by GEN2PHEN at the European Bioinformatics Institute at Hinxton UK April 24-25, 2008).", 0, 1, referenceSeqId));
          children.add(new Property("referenceSeqPointer", "Reference(MolecularSequence)", "A pointer to another MolecularSequence entity as reference sequence.", 0, 1, referenceSeqPointer));
          children.add(new Property("referenceSeqString", "string", "A string like \"ACGT\".", 0, 1, referenceSeqString));
          children.add(new Property("strand", "code", "An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.", 0, 1, strand));
          children.add(new Property("windowStart", "integer", "Start position of the window on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.", 0, 1, windowStart));
          children.add(new Property("windowEnd", "integer", "End position of the window on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.", 0, 1, windowEnd));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1499470472: /*chromosome*/  return new Property("chromosome", "CodeableConcept", "Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)).", 0, 1, chromosome);
          case 1061239735: /*genomeBuild*/  return new Property("genomeBuild", "string", "The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used.", 0, 1, genomeBuild);
          case -1439500848: /*orientation*/  return new Property("orientation", "code", "A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the \"sense\" strand, and the opposite complementary strand is the \"antisense\" strand.", 0, 1, orientation);
          case -1911500465: /*referenceSeqId*/  return new Property("referenceSeqId", "CodeableConcept", "This field carries the ID for the reference sequence. For this ID use either the NCBI genomic nucleotide RefSeq IDs with their version number (see: NCBI.NLM.NIH.Gov/RefSeq) or use the LRG identifiers when they become available. (See- Report sponsored by GEN2PHEN at the European Bioinformatics Institute at Hinxton UK April 24-25, 2008).", 0, 1, referenceSeqId);
          case 1923414665: /*referenceSeqPointer*/  return new Property("referenceSeqPointer", "Reference(MolecularSequence)", "A pointer to another MolecularSequence entity as reference sequence.", 0, 1, referenceSeqPointer);
          case -1648301499: /*referenceSeqString*/  return new Property("referenceSeqString", "string", "A string like \"ACGT\".", 0, 1, referenceSeqString);
          case -891993594: /*strand*/  return new Property("strand", "code", "An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.", 0, 1, strand);
          case 1903685202: /*windowStart*/  return new Property("windowStart", "integer", "Start position of the window on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.", 0, 1, windowStart);
          case -217026869: /*windowEnd*/  return new Property("windowEnd", "integer", "End position of the window on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.", 0, 1, windowEnd);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1499470472: /*chromosome*/ return this.chromosome == null ? new Base[0] : new Base[] {this.chromosome}; // CodeableConcept
        case 1061239735: /*genomeBuild*/ return this.genomeBuild == null ? new Base[0] : new Base[] {this.genomeBuild}; // StringType
        case -1439500848: /*orientation*/ return this.orientation == null ? new Base[0] : new Base[] {this.orientation}; // Enumeration<OrientationType>
        case -1911500465: /*referenceSeqId*/ return this.referenceSeqId == null ? new Base[0] : new Base[] {this.referenceSeqId}; // CodeableConcept
        case 1923414665: /*referenceSeqPointer*/ return this.referenceSeqPointer == null ? new Base[0] : new Base[] {this.referenceSeqPointer}; // Reference
        case -1648301499: /*referenceSeqString*/ return this.referenceSeqString == null ? new Base[0] : new Base[] {this.referenceSeqString}; // StringType
        case -891993594: /*strand*/ return this.strand == null ? new Base[0] : new Base[] {this.strand}; // Enumeration<StrandType>
        case 1903685202: /*windowStart*/ return this.windowStart == null ? new Base[0] : new Base[] {this.windowStart}; // IntegerType
        case -217026869: /*windowEnd*/ return this.windowEnd == null ? new Base[0] : new Base[] {this.windowEnd}; // IntegerType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1499470472: // chromosome
          this.chromosome = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 1061239735: // genomeBuild
          this.genomeBuild = TypeConvertor.castToString(value); // StringType
          return value;
        case -1439500848: // orientation
          value = new OrientationTypeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.orientation = (Enumeration) value; // Enumeration<OrientationType>
          return value;
        case -1911500465: // referenceSeqId
          this.referenceSeqId = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 1923414665: // referenceSeqPointer
          this.referenceSeqPointer = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1648301499: // referenceSeqString
          this.referenceSeqString = TypeConvertor.castToString(value); // StringType
          return value;
        case -891993594: // strand
          value = new StrandTypeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.strand = (Enumeration) value; // Enumeration<StrandType>
          return value;
        case 1903685202: // windowStart
          this.windowStart = TypeConvertor.castToInteger(value); // IntegerType
          return value;
        case -217026869: // windowEnd
          this.windowEnd = TypeConvertor.castToInteger(value); // IntegerType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("chromosome")) {
          this.chromosome = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("genomeBuild")) {
          this.genomeBuild = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("orientation")) {
          value = new OrientationTypeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.orientation = (Enumeration) value; // Enumeration<OrientationType>
        } else if (name.equals("referenceSeqId")) {
          this.referenceSeqId = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("referenceSeqPointer")) {
          this.referenceSeqPointer = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("referenceSeqString")) {
          this.referenceSeqString = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("strand")) {
          value = new StrandTypeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.strand = (Enumeration) value; // Enumeration<StrandType>
        } else if (name.equals("windowStart")) {
          this.windowStart = TypeConvertor.castToInteger(value); // IntegerType
        } else if (name.equals("windowEnd")) {
          this.windowEnd = TypeConvertor.castToInteger(value); // IntegerType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1499470472:  return getChromosome();
        case 1061239735:  return getGenomeBuildElement();
        case -1439500848:  return getOrientationElement();
        case -1911500465:  return getReferenceSeqId();
        case 1923414665:  return getReferenceSeqPointer();
        case -1648301499:  return getReferenceSeqStringElement();
        case -891993594:  return getStrandElement();
        case 1903685202:  return getWindowStartElement();
        case -217026869:  return getWindowEndElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1499470472: /*chromosome*/ return new String[] {"CodeableConcept"};
        case 1061239735: /*genomeBuild*/ return new String[] {"string"};
        case -1439500848: /*orientation*/ return new String[] {"code"};
        case -1911500465: /*referenceSeqId*/ return new String[] {"CodeableConcept"};
        case 1923414665: /*referenceSeqPointer*/ return new String[] {"Reference"};
        case -1648301499: /*referenceSeqString*/ return new String[] {"string"};
        case -891993594: /*strand*/ return new String[] {"code"};
        case 1903685202: /*windowStart*/ return new String[] {"integer"};
        case -217026869: /*windowEnd*/ return new String[] {"integer"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("chromosome")) {
          this.chromosome = new CodeableConcept();
          return this.chromosome;
        }
        else if (name.equals("genomeBuild")) {
          throw new FHIRException("Cannot call addChild on a primitive type MolecularSequence.relative.reference.genomeBuild");
        }
        else if (name.equals("orientation")) {
          throw new FHIRException("Cannot call addChild on a primitive type MolecularSequence.relative.reference.orientation");
        }
        else if (name.equals("referenceSeqId")) {
          this.referenceSeqId = new CodeableConcept();
          return this.referenceSeqId;
        }
        else if (name.equals("referenceSeqPointer")) {
          this.referenceSeqPointer = new Reference();
          return this.referenceSeqPointer;
        }
        else if (name.equals("referenceSeqString")) {
          throw new FHIRException("Cannot call addChild on a primitive type MolecularSequence.relative.reference.referenceSeqString");
        }
        else if (name.equals("strand")) {
          throw new FHIRException("Cannot call addChild on a primitive type MolecularSequence.relative.reference.strand");
        }
        else if (name.equals("windowStart")) {
          throw new FHIRException("Cannot call addChild on a primitive type MolecularSequence.relative.reference.windowStart");
        }
        else if (name.equals("windowEnd")) {
          throw new FHIRException("Cannot call addChild on a primitive type MolecularSequence.relative.reference.windowEnd");
        }
        else
          return super.addChild(name);
      }

      public MolecularSequenceRelativeReferenceComponent copy() {
        MolecularSequenceRelativeReferenceComponent dst = new MolecularSequenceRelativeReferenceComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(MolecularSequenceRelativeReferenceComponent dst) {
        super.copyValues(dst);
        dst.chromosome = chromosome == null ? null : chromosome.copy();
        dst.genomeBuild = genomeBuild == null ? null : genomeBuild.copy();
        dst.orientation = orientation == null ? null : orientation.copy();
        dst.referenceSeqId = referenceSeqId == null ? null : referenceSeqId.copy();
        dst.referenceSeqPointer = referenceSeqPointer == null ? null : referenceSeqPointer.copy();
        dst.referenceSeqString = referenceSeqString == null ? null : referenceSeqString.copy();
        dst.strand = strand == null ? null : strand.copy();
        dst.windowStart = windowStart == null ? null : windowStart.copy();
        dst.windowEnd = windowEnd == null ? null : windowEnd.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof MolecularSequenceRelativeReferenceComponent))
          return false;
        MolecularSequenceRelativeReferenceComponent o = (MolecularSequenceRelativeReferenceComponent) other_;
        return compareDeep(chromosome, o.chromosome, true) && compareDeep(genomeBuild, o.genomeBuild, true)
           && compareDeep(orientation, o.orientation, true) && compareDeep(referenceSeqId, o.referenceSeqId, true)
           && compareDeep(referenceSeqPointer, o.referenceSeqPointer, true) && compareDeep(referenceSeqString, o.referenceSeqString, true)
           && compareDeep(strand, o.strand, true) && compareDeep(windowStart, o.windowStart, true) && compareDeep(windowEnd, o.windowEnd, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof MolecularSequenceRelativeReferenceComponent))
          return false;
        MolecularSequenceRelativeReferenceComponent o = (MolecularSequenceRelativeReferenceComponent) other_;
        return compareValues(genomeBuild, o.genomeBuild, true) && compareValues(orientation, o.orientation, true)
           && compareValues(referenceSeqString, o.referenceSeqString, true) && compareValues(strand, o.strand, true)
           && compareValues(windowStart, o.windowStart, true) && compareValues(windowEnd, o.windowEnd, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(chromosome, genomeBuild, orientation
          , referenceSeqId, referenceSeqPointer, referenceSeqString, strand, windowStart, windowEnd
          );
      }

  public String fhirType() {
    return "MolecularSequence.relative.reference";

  }

  }

    @Block()
    public static class MolecularSequenceRelativeEditComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Start position of the edit on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
         */
        @Child(name = "start", type = {IntegerType.class}, order=1, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Start position of the edit on the reference sequence", formalDefinition="Start position of the edit on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive." )
        protected IntegerType start;

        /**
         * End position of the edit on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
         */
        @Child(name = "end", type = {IntegerType.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="End position of the edit on the reference sequence", formalDefinition="End position of the edit on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position." )
        protected IntegerType end;

        /**
         * Allele that was observed. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed  sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
         */
        @Child(name = "observedAllele", type = {StringType.class}, order=3, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Allele that was observed", formalDefinition="Allele that was observed. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed  sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end." )
        protected StringType observedAllele;

        /**
         * Allele in the reference sequence. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the reference sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
         */
        @Child(name = "referenceAllele", type = {StringType.class}, order=4, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Allele in the reference sequence", formalDefinition="Allele in the reference sequence. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the reference sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end." )
        protected StringType referenceAllele;

        /**
         * Extended CIGAR string for aligning the sequence with reference bases. See documentation [here](https://samtools.github.io/hts-specs/SAMv1.pdf) and search for CIGAR.
         */
        @Child(name = "cigar", type = {StringType.class}, order=5, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Extended CIGAR string for aligning the sequence with reference bases", formalDefinition="Extended CIGAR string for aligning the sequence with reference bases. See documentation [here](https://samtools.github.io/hts-specs/SAMv1.pdf) and search for CIGAR." )
        protected StringType cigar;

        private static final long serialVersionUID = 913298829L;

    /**
     * Constructor
     */
      public MolecularSequenceRelativeEditComponent() {
        super();
      }

        /**
         * @return {@link #start} (Start position of the edit on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.). This is the underlying object with id, value and extensions. The accessor "getStart" gives direct access to the value
         */
        public IntegerType getStartElement() { 
          if (this.start == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeEditComponent.start");
            else if (Configuration.doAutoCreate())
              this.start = new IntegerType(); // bb
          return this.start;
        }

        public boolean hasStartElement() { 
          return this.start != null && !this.start.isEmpty();
        }

        public boolean hasStart() { 
          return this.start != null && !this.start.isEmpty();
        }

        /**
         * @param value {@link #start} (Start position of the edit on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.). This is the underlying object with id, value and extensions. The accessor "getStart" gives direct access to the value
         */
        public MolecularSequenceRelativeEditComponent setStartElement(IntegerType value) { 
          this.start = value;
          return this;
        }

        /**
         * @return Start position of the edit on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
         */
        public int getStart() { 
          return this.start == null || this.start.isEmpty() ? 0 : this.start.getValue();
        }

        /**
         * @param value Start position of the edit on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
         */
        public MolecularSequenceRelativeEditComponent setStart(int value) { 
            if (this.start == null)
              this.start = new IntegerType();
            this.start.setValue(value);
          return this;
        }

        /**
         * @return {@link #end} (End position of the edit on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.). This is the underlying object with id, value and extensions. The accessor "getEnd" gives direct access to the value
         */
        public IntegerType getEndElement() { 
          if (this.end == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeEditComponent.end");
            else if (Configuration.doAutoCreate())
              this.end = new IntegerType(); // bb
          return this.end;
        }

        public boolean hasEndElement() { 
          return this.end != null && !this.end.isEmpty();
        }

        public boolean hasEnd() { 
          return this.end != null && !this.end.isEmpty();
        }

        /**
         * @param value {@link #end} (End position of the edit on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.). This is the underlying object with id, value and extensions. The accessor "getEnd" gives direct access to the value
         */
        public MolecularSequenceRelativeEditComponent setEndElement(IntegerType value) { 
          this.end = value;
          return this;
        }

        /**
         * @return End position of the edit on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
         */
        public int getEnd() { 
          return this.end == null || this.end.isEmpty() ? 0 : this.end.getValue();
        }

        /**
         * @param value End position of the edit on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
         */
        public MolecularSequenceRelativeEditComponent setEnd(int value) { 
            if (this.end == null)
              this.end = new IntegerType();
            this.end.setValue(value);
          return this;
        }

        /**
         * @return {@link #observedAllele} (Allele that was observed. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed  sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.). This is the underlying object with id, value and extensions. The accessor "getObservedAllele" gives direct access to the value
         */
        public StringType getObservedAlleleElement() { 
          if (this.observedAllele == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeEditComponent.observedAllele");
            else if (Configuration.doAutoCreate())
              this.observedAllele = new StringType(); // bb
          return this.observedAllele;
        }

        public boolean hasObservedAlleleElement() { 
          return this.observedAllele != null && !this.observedAllele.isEmpty();
        }

        public boolean hasObservedAllele() { 
          return this.observedAllele != null && !this.observedAllele.isEmpty();
        }

        /**
         * @param value {@link #observedAllele} (Allele that was observed. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed  sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.). This is the underlying object with id, value and extensions. The accessor "getObservedAllele" gives direct access to the value
         */
        public MolecularSequenceRelativeEditComponent setObservedAlleleElement(StringType value) { 
          this.observedAllele = value;
          return this;
        }

        /**
         * @return Allele that was observed. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed  sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
         */
        public String getObservedAllele() { 
          return this.observedAllele == null ? null : this.observedAllele.getValue();
        }

        /**
         * @param value Allele that was observed. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed  sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
         */
        public MolecularSequenceRelativeEditComponent setObservedAllele(String value) { 
          if (Utilities.noString(value))
            this.observedAllele = null;
          else {
            if (this.observedAllele == null)
              this.observedAllele = new StringType();
            this.observedAllele.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #referenceAllele} (Allele in the reference sequence. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the reference sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.). This is the underlying object with id, value and extensions. The accessor "getReferenceAllele" gives direct access to the value
         */
        public StringType getReferenceAlleleElement() { 
          if (this.referenceAllele == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeEditComponent.referenceAllele");
            else if (Configuration.doAutoCreate())
              this.referenceAllele = new StringType(); // bb
          return this.referenceAllele;
        }

        public boolean hasReferenceAlleleElement() { 
          return this.referenceAllele != null && !this.referenceAllele.isEmpty();
        }

        public boolean hasReferenceAllele() { 
          return this.referenceAllele != null && !this.referenceAllele.isEmpty();
        }

        /**
         * @param value {@link #referenceAllele} (Allele in the reference sequence. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the reference sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.). This is the underlying object with id, value and extensions. The accessor "getReferenceAllele" gives direct access to the value
         */
        public MolecularSequenceRelativeEditComponent setReferenceAlleleElement(StringType value) { 
          this.referenceAllele = value;
          return this;
        }

        /**
         * @return Allele in the reference sequence. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the reference sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
         */
        public String getReferenceAllele() { 
          return this.referenceAllele == null ? null : this.referenceAllele.getValue();
        }

        /**
         * @param value Allele in the reference sequence. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the reference sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
         */
        public MolecularSequenceRelativeEditComponent setReferenceAllele(String value) { 
          if (Utilities.noString(value))
            this.referenceAllele = null;
          else {
            if (this.referenceAllele == null)
              this.referenceAllele = new StringType();
            this.referenceAllele.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #cigar} (Extended CIGAR string for aligning the sequence with reference bases. See documentation [here](https://samtools.github.io/hts-specs/SAMv1.pdf) and search for CIGAR.). This is the underlying object with id, value and extensions. The accessor "getCigar" gives direct access to the value
         */
        public StringType getCigarElement() { 
          if (this.cigar == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MolecularSequenceRelativeEditComponent.cigar");
            else if (Configuration.doAutoCreate())
              this.cigar = new StringType(); // bb
          return this.cigar;
        }

        public boolean hasCigarElement() { 
          return this.cigar != null && !this.cigar.isEmpty();
        }

        public boolean hasCigar() { 
          return this.cigar != null && !this.cigar.isEmpty();
        }

        /**
         * @param value {@link #cigar} (Extended CIGAR string for aligning the sequence with reference bases. See documentation [here](https://samtools.github.io/hts-specs/SAMv1.pdf) and search for CIGAR.). This is the underlying object with id, value and extensions. The accessor "getCigar" gives direct access to the value
         */
        public MolecularSequenceRelativeEditComponent setCigarElement(StringType value) { 
          this.cigar = value;
          return this;
        }

        /**
         * @return Extended CIGAR string for aligning the sequence with reference bases. See documentation [here](https://samtools.github.io/hts-specs/SAMv1.pdf) and search for CIGAR.
         */
        public String getCigar() { 
          return this.cigar == null ? null : this.cigar.getValue();
        }

        /**
         * @param value Extended CIGAR string for aligning the sequence with reference bases. See documentation [here](https://samtools.github.io/hts-specs/SAMv1.pdf) and search for CIGAR.
         */
        public MolecularSequenceRelativeEditComponent setCigar(String value) { 
          if (Utilities.noString(value))
            this.cigar = null;
          else {
            if (this.cigar == null)
              this.cigar = new StringType();
            this.cigar.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("start", "integer", "Start position of the edit on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.", 0, 1, start));
          children.add(new Property("end", "integer", "End position of the edit on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.", 0, 1, end));
          children.add(new Property("observedAllele", "string", "Allele that was observed. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed  sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.", 0, 1, observedAllele));
          children.add(new Property("referenceAllele", "string", "Allele in the reference sequence. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the reference sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.", 0, 1, referenceAllele));
          children.add(new Property("cigar", "string", "Extended CIGAR string for aligning the sequence with reference bases. See documentation [here](https://samtools.github.io/hts-specs/SAMv1.pdf) and search for CIGAR.", 0, 1, cigar));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 109757538: /*start*/  return new Property("start", "integer", "Start position of the edit on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.", 0, 1, start);
          case 100571: /*end*/  return new Property("end", "integer", "End position of the edit on the reference sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.", 0, 1, end);
          case -1418745787: /*observedAllele*/  return new Property("observedAllele", "string", "Allele that was observed. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed  sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.", 0, 1, observedAllele);
          case 364045960: /*referenceAllele*/  return new Property("referenceAllele", "string", "Allele in the reference sequence. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the reference sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.", 0, 1, referenceAllele);
          case 94658738: /*cigar*/  return new Property("cigar", "string", "Extended CIGAR string for aligning the sequence with reference bases. See documentation [here](https://samtools.github.io/hts-specs/SAMv1.pdf) and search for CIGAR.", 0, 1, cigar);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 109757538: /*start*/ return this.start == null ? new Base[0] : new Base[] {this.start}; // IntegerType
        case 100571: /*end*/ return this.end == null ? new Base[0] : new Base[] {this.end}; // IntegerType
        case -1418745787: /*observedAllele*/ return this.observedAllele == null ? new Base[0] : new Base[] {this.observedAllele}; // StringType
        case 364045960: /*referenceAllele*/ return this.referenceAllele == null ? new Base[0] : new Base[] {this.referenceAllele}; // StringType
        case 94658738: /*cigar*/ return this.cigar == null ? new Base[0] : new Base[] {this.cigar}; // StringType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 109757538: // start
          this.start = TypeConvertor.castToInteger(value); // IntegerType
          return value;
        case 100571: // end
          this.end = TypeConvertor.castToInteger(value); // IntegerType
          return value;
        case -1418745787: // observedAllele
          this.observedAllele = TypeConvertor.castToString(value); // StringType
          return value;
        case 364045960: // referenceAllele
          this.referenceAllele = TypeConvertor.castToString(value); // StringType
          return value;
        case 94658738: // cigar
          this.cigar = TypeConvertor.castToString(value); // StringType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("start")) {
          this.start = TypeConvertor.castToInteger(value); // IntegerType
        } else if (name.equals("end")) {
          this.end = TypeConvertor.castToInteger(value); // IntegerType
        } else if (name.equals("observedAllele")) {
          this.observedAllele = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("referenceAllele")) {
          this.referenceAllele = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("cigar")) {
          this.cigar = TypeConvertor.castToString(value); // StringType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 109757538:  return getStartElement();
        case 100571:  return getEndElement();
        case -1418745787:  return getObservedAlleleElement();
        case 364045960:  return getReferenceAlleleElement();
        case 94658738:  return getCigarElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 109757538: /*start*/ return new String[] {"integer"};
        case 100571: /*end*/ return new String[] {"integer"};
        case -1418745787: /*observedAllele*/ return new String[] {"string"};
        case 364045960: /*referenceAllele*/ return new String[] {"string"};
        case 94658738: /*cigar*/ return new String[] {"string"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("start")) {
          throw new FHIRException("Cannot call addChild on a primitive type MolecularSequence.relative.edit.start");
        }
        else if (name.equals("end")) {
          throw new FHIRException("Cannot call addChild on a primitive type MolecularSequence.relative.edit.end");
        }
        else if (name.equals("observedAllele")) {
          throw new FHIRException("Cannot call addChild on a primitive type MolecularSequence.relative.edit.observedAllele");
        }
        else if (name.equals("referenceAllele")) {
          throw new FHIRException("Cannot call addChild on a primitive type MolecularSequence.relative.edit.referenceAllele");
        }
        else if (name.equals("cigar")) {
          throw new FHIRException("Cannot call addChild on a primitive type MolecularSequence.relative.edit.cigar");
        }
        else
          return super.addChild(name);
      }

      public MolecularSequenceRelativeEditComponent copy() {
        MolecularSequenceRelativeEditComponent dst = new MolecularSequenceRelativeEditComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(MolecularSequenceRelativeEditComponent dst) {
        super.copyValues(dst);
        dst.start = start == null ? null : start.copy();
        dst.end = end == null ? null : end.copy();
        dst.observedAllele = observedAllele == null ? null : observedAllele.copy();
        dst.referenceAllele = referenceAllele == null ? null : referenceAllele.copy();
        dst.cigar = cigar == null ? null : cigar.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof MolecularSequenceRelativeEditComponent))
          return false;
        MolecularSequenceRelativeEditComponent o = (MolecularSequenceRelativeEditComponent) other_;
        return compareDeep(start, o.start, true) && compareDeep(end, o.end, true) && compareDeep(observedAllele, o.observedAllele, true)
           && compareDeep(referenceAllele, o.referenceAllele, true) && compareDeep(cigar, o.cigar, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof MolecularSequenceRelativeEditComponent))
          return false;
        MolecularSequenceRelativeEditComponent o = (MolecularSequenceRelativeEditComponent) other_;
        return compareValues(start, o.start, true) && compareValues(end, o.end, true) && compareValues(observedAllele, o.observedAllele, true)
           && compareValues(referenceAllele, o.referenceAllele, true) && compareValues(cigar, o.cigar, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(start, end, observedAllele
          , referenceAllele, cigar);
      }

  public String fhirType() {
    return "MolecularSequence.relative.edit";

  }

  }

    /**
     * A unique identifier for this particular sequence instance.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Unique ID for this particular sequence", formalDefinition="A unique identifier for this particular sequence instance." )
    protected List<Identifier> identifier;

    /**
     * Amino Acid Sequence/ DNA Sequence / RNA Sequence.
     */
    @Child(name = "type", type = {CodeType.class}, order=1, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="aa | dna | rna", formalDefinition="Amino Acid Sequence/ DNA Sequence / RNA Sequence." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/sequence-type")
    protected Enumeration<SequenceType> type;

    /**
     * Indicates the patient this sequence is associated too.
     */
    @Child(name = "patient", type = {Patient.class}, order=2, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Patient this sequence is associated too", formalDefinition="Indicates the patient this sequence is associated too." )
    protected Reference patient;

    /**
     * Specimen used for sequencing.
     */
    @Child(name = "specimen", type = {Specimen.class}, order=3, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Specimen used for sequencing", formalDefinition="Specimen used for sequencing." )
    protected Reference specimen;

    /**
     * The method for sequencing, for example, chip information.
     */
    @Child(name = "device", type = {Device.class}, order=4, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The method for sequencing", formalDefinition="The method for sequencing, for example, chip information." )
    protected Reference device;

    /**
     * The organization or lab that should be responsible for this result.
     */
    @Child(name = "performer", type = {Organization.class}, order=5, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Who should be responsible for test result", formalDefinition="The organization or lab that should be responsible for this result." )
    protected Reference performer;

    /**
     * Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall start from referenceSeq.windowStart and end by referenceSeq.windowEnd.
     */
    @Child(name = "literal", type = {StringType.class}, order=6, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Sequence that was observed", formalDefinition="Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall start from referenceSeq.windowStart and end by referenceSeq.windowEnd." )
    protected StringType literal;

    /**
     * Sequence that was observed as file content. Can be an actual file contents, or referenced by a URL to an external system.
     */
    @Child(name = "formatted", type = {Attachment.class}, order=7, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Embedded file or a link (URL) which contains content to represent the sequence", formalDefinition="Sequence that was observed as file content. Can be an actual file contents, or referenced by a URL to an external system." )
    protected Attachment formatted;

    /**
     * A sequence defined relative to another sequence.
     */
    @Child(name = "relative", type = {}, order=8, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="A sequence defined relative to another sequence", formalDefinition="A sequence defined relative to another sequence." )
    protected MolecularSequenceRelativeComponent relative;

    /**
     * Pointer to next atomic sequence which at most contains one variant.
     */
    @Child(name = "pointer", type = {MolecularSequence.class}, order=9, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Pointer to next atomic sequence", formalDefinition="Pointer to next atomic sequence which at most contains one variant." )
    protected List<Reference> pointer;

    private static final long serialVersionUID = 378268436L;

  /**
   * Constructor
   */
    public MolecularSequence() {
      super();
    }

    /**
     * @return {@link #identifier} (A unique identifier for this particular sequence instance.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MolecularSequence setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public MolecularSequence addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #type} (Amino Acid Sequence/ DNA Sequence / RNA Sequence.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public Enumeration<SequenceType> getTypeElement() { 
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MolecularSequence.type");
        else if (Configuration.doAutoCreate())
          this.type = new Enumeration<SequenceType>(new SequenceTypeEnumFactory()); // bb
      return this.type;
    }

    public boolean hasTypeElement() { 
      return this.type != null && !this.type.isEmpty();
    }

    public boolean hasType() { 
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Amino Acid Sequence/ DNA Sequence / RNA Sequence.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
     */
    public MolecularSequence setTypeElement(Enumeration<SequenceType> value) { 
      this.type = value;
      return this;
    }

    /**
     * @return Amino Acid Sequence/ DNA Sequence / RNA Sequence.
     */
    public SequenceType getType() { 
      return this.type == null ? null : this.type.getValue();
    }

    /**
     * @param value Amino Acid Sequence/ DNA Sequence / RNA Sequence.
     */
    public MolecularSequence setType(SequenceType value) { 
      if (value == null)
        this.type = null;
      else {
        if (this.type == null)
          this.type = new Enumeration<SequenceType>(new SequenceTypeEnumFactory());
        this.type.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #patient} (Indicates the patient this sequence is associated too.)
     */
    public Reference getPatient() { 
      if (this.patient == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MolecularSequence.patient");
        else if (Configuration.doAutoCreate())
          this.patient = new Reference(); // cc
      return this.patient;
    }

    public boolean hasPatient() { 
      return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (Indicates the patient this sequence is associated too.)
     */
    public MolecularSequence setPatient(Reference value) { 
      this.patient = value;
      return this;
    }

    /**
     * @return {@link #specimen} (Specimen used for sequencing.)
     */
    public Reference getSpecimen() { 
      if (this.specimen == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MolecularSequence.specimen");
        else if (Configuration.doAutoCreate())
          this.specimen = new Reference(); // cc
      return this.specimen;
    }

    public boolean hasSpecimen() { 
      return this.specimen != null && !this.specimen.isEmpty();
    }

    /**
     * @param value {@link #specimen} (Specimen used for sequencing.)
     */
    public MolecularSequence setSpecimen(Reference value) { 
      this.specimen = value;
      return this;
    }

    /**
     * @return {@link #device} (The method for sequencing, for example, chip information.)
     */
    public Reference getDevice() { 
      if (this.device == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MolecularSequence.device");
        else if (Configuration.doAutoCreate())
          this.device = new Reference(); // cc
      return this.device;
    }

    public boolean hasDevice() { 
      return this.device != null && !this.device.isEmpty();
    }

    /**
     * @param value {@link #device} (The method for sequencing, for example, chip information.)
     */
    public MolecularSequence setDevice(Reference value) { 
      this.device = value;
      return this;
    }

    /**
     * @return {@link #performer} (The organization or lab that should be responsible for this result.)
     */
    public Reference getPerformer() { 
      if (this.performer == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MolecularSequence.performer");
        else if (Configuration.doAutoCreate())
          this.performer = new Reference(); // cc
      return this.performer;
    }

    public boolean hasPerformer() { 
      return this.performer != null && !this.performer.isEmpty();
    }

    /**
     * @param value {@link #performer} (The organization or lab that should be responsible for this result.)
     */
    public MolecularSequence setPerformer(Reference value) { 
      this.performer = value;
      return this;
    }

    /**
     * @return {@link #literal} (Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall start from referenceSeq.windowStart and end by referenceSeq.windowEnd.). This is the underlying object with id, value and extensions. The accessor "getLiteral" gives direct access to the value
     */
    public StringType getLiteralElement() { 
      if (this.literal == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MolecularSequence.literal");
        else if (Configuration.doAutoCreate())
          this.literal = new StringType(); // bb
      return this.literal;
    }

    public boolean hasLiteralElement() { 
      return this.literal != null && !this.literal.isEmpty();
    }

    public boolean hasLiteral() { 
      return this.literal != null && !this.literal.isEmpty();
    }

    /**
     * @param value {@link #literal} (Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall start from referenceSeq.windowStart and end by referenceSeq.windowEnd.). This is the underlying object with id, value and extensions. The accessor "getLiteral" gives direct access to the value
     */
    public MolecularSequence setLiteralElement(StringType value) { 
      this.literal = value;
      return this;
    }

    /**
     * @return Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall start from referenceSeq.windowStart and end by referenceSeq.windowEnd.
     */
    public String getLiteral() { 
      return this.literal == null ? null : this.literal.getValue();
    }

    /**
     * @param value Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall start from referenceSeq.windowStart and end by referenceSeq.windowEnd.
     */
    public MolecularSequence setLiteral(String value) { 
      if (Utilities.noString(value))
        this.literal = null;
      else {
        if (this.literal == null)
          this.literal = new StringType();
        this.literal.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #formatted} (Sequence that was observed as file content. Can be an actual file contents, or referenced by a URL to an external system.)
     */
    public Attachment getFormatted() { 
      if (this.formatted == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MolecularSequence.formatted");
        else if (Configuration.doAutoCreate())
          this.formatted = new Attachment(); // cc
      return this.formatted;
    }

    public boolean hasFormatted() { 
      return this.formatted != null && !this.formatted.isEmpty();
    }

    /**
     * @param value {@link #formatted} (Sequence that was observed as file content. Can be an actual file contents, or referenced by a URL to an external system.)
     */
    public MolecularSequence setFormatted(Attachment value) { 
      this.formatted = value;
      return this;
    }

    /**
     * @return {@link #relative} (A sequence defined relative to another sequence.)
     */
    public MolecularSequenceRelativeComponent getRelative() { 
      if (this.relative == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MolecularSequence.relative");
        else if (Configuration.doAutoCreate())
          this.relative = new MolecularSequenceRelativeComponent(); // cc
      return this.relative;
    }

    public boolean hasRelative() { 
      return this.relative != null && !this.relative.isEmpty();
    }

    /**
     * @param value {@link #relative} (A sequence defined relative to another sequence.)
     */
    public MolecularSequence setRelative(MolecularSequenceRelativeComponent value) { 
      this.relative = value;
      return this;
    }

    /**
     * @return {@link #pointer} (Pointer to next atomic sequence which at most contains one variant.)
     */
    public List<Reference> getPointer() { 
      if (this.pointer == null)
        this.pointer = new ArrayList<Reference>();
      return this.pointer;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MolecularSequence setPointer(List<Reference> thePointer) { 
      this.pointer = thePointer;
      return this;
    }

    public boolean hasPointer() { 
      if (this.pointer == null)
        return false;
      for (Reference item : this.pointer)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addPointer() { //3
      Reference t = new Reference();
      if (this.pointer == null)
        this.pointer = new ArrayList<Reference>();
      this.pointer.add(t);
      return t;
    }

    public MolecularSequence addPointer(Reference t) { //3
      if (t == null)
        return this;
      if (this.pointer == null)
        this.pointer = new ArrayList<Reference>();
      this.pointer.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #pointer}, creating it if it does not already exist {3}
     */
    public Reference getPointerFirstRep() { 
      if (getPointer().isEmpty()) {
        addPointer();
      }
      return getPointer().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "A unique identifier for this particular sequence instance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("type", "code", "Amino Acid Sequence/ DNA Sequence / RNA Sequence.", 0, 1, type));
        children.add(new Property("patient", "Reference(Patient)", "Indicates the patient this sequence is associated too.", 0, 1, patient));
        children.add(new Property("specimen", "Reference(Specimen)", "Specimen used for sequencing.", 0, 1, specimen));
        children.add(new Property("device", "Reference(Device)", "The method for sequencing, for example, chip information.", 0, 1, device));
        children.add(new Property("performer", "Reference(Organization)", "The organization or lab that should be responsible for this result.", 0, 1, performer));
        children.add(new Property("literal", "string", "Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall start from referenceSeq.windowStart and end by referenceSeq.windowEnd.", 0, 1, literal));
        children.add(new Property("formatted", "Attachment", "Sequence that was observed as file content. Can be an actual file contents, or referenced by a URL to an external system.", 0, 1, formatted));
        children.add(new Property("relative", "", "A sequence defined relative to another sequence.", 0, 1, relative));
        children.add(new Property("pointer", "Reference(MolecularSequence)", "Pointer to next atomic sequence which at most contains one variant.", 0, java.lang.Integer.MAX_VALUE, pointer));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "A unique identifier for this particular sequence instance.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case 3575610: /*type*/  return new Property("type", "code", "Amino Acid Sequence/ DNA Sequence / RNA Sequence.", 0, 1, type);
        case -791418107: /*patient*/  return new Property("patient", "Reference(Patient)", "Indicates the patient this sequence is associated too.", 0, 1, patient);
        case -2132868344: /*specimen*/  return new Property("specimen", "Reference(Specimen)", "Specimen used for sequencing.", 0, 1, specimen);
        case -1335157162: /*device*/  return new Property("device", "Reference(Device)", "The method for sequencing, for example, chip information.", 0, 1, device);
        case 481140686: /*performer*/  return new Property("performer", "Reference(Organization)", "The organization or lab that should be responsible for this result.", 0, 1, performer);
        case 182460591: /*literal*/  return new Property("literal", "string", "Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall start from referenceSeq.windowStart and end by referenceSeq.windowEnd.", 0, 1, literal);
        case 1811591356: /*formatted*/  return new Property("formatted", "Attachment", "Sequence that was observed as file content. Can be an actual file contents, or referenced by a URL to an external system.", 0, 1, formatted);
        case -554435892: /*relative*/  return new Property("relative", "", "A sequence defined relative to another sequence.", 0, 1, relative);
        case -400605635: /*pointer*/  return new Property("pointer", "Reference(MolecularSequence)", "Pointer to next atomic sequence which at most contains one variant.", 0, java.lang.Integer.MAX_VALUE, pointer);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // Enumeration<SequenceType>
        case -791418107: /*patient*/ return this.patient == null ? new Base[0] : new Base[] {this.patient}; // Reference
        case -2132868344: /*specimen*/ return this.specimen == null ? new Base[0] : new Base[] {this.specimen}; // Reference
        case -1335157162: /*device*/ return this.device == null ? new Base[0] : new Base[] {this.device}; // Reference
        case 481140686: /*performer*/ return this.performer == null ? new Base[0] : new Base[] {this.performer}; // Reference
        case 182460591: /*literal*/ return this.literal == null ? new Base[0] : new Base[] {this.literal}; // StringType
        case 1811591356: /*formatted*/ return this.formatted == null ? new Base[0] : new Base[] {this.formatted}; // Attachment
        case -554435892: /*relative*/ return this.relative == null ? new Base[0] : new Base[] {this.relative}; // MolecularSequenceRelativeComponent
        case -400605635: /*pointer*/ return this.pointer == null ? new Base[0] : this.pointer.toArray(new Base[this.pointer.size()]); // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case 3575610: // type
          value = new SequenceTypeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.type = (Enumeration) value; // Enumeration<SequenceType>
          return value;
        case -791418107: // patient
          this.patient = TypeConvertor.castToReference(value); // Reference
          return value;
        case -2132868344: // specimen
          this.specimen = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1335157162: // device
          this.device = TypeConvertor.castToReference(value); // Reference
          return value;
        case 481140686: // performer
          this.performer = TypeConvertor.castToReference(value); // Reference
          return value;
        case 182460591: // literal
          this.literal = TypeConvertor.castToString(value); // StringType
          return value;
        case 1811591356: // formatted
          this.formatted = TypeConvertor.castToAttachment(value); // Attachment
          return value;
        case -554435892: // relative
          this.relative = (MolecularSequenceRelativeComponent) value; // MolecularSequenceRelativeComponent
          return value;
        case -400605635: // pointer
          this.getPointer().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("type")) {
          value = new SequenceTypeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.type = (Enumeration) value; // Enumeration<SequenceType>
        } else if (name.equals("patient")) {
          this.patient = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("specimen")) {
          this.specimen = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("device")) {
          this.device = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("performer")) {
          this.performer = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("literal")) {
          this.literal = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("formatted")) {
          this.formatted = TypeConvertor.castToAttachment(value); // Attachment
        } else if (name.equals("relative")) {
          this.relative = (MolecularSequenceRelativeComponent) value; // MolecularSequenceRelativeComponent
        } else if (name.equals("pointer")) {
          this.getPointer().add(TypeConvertor.castToReference(value));
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case 3575610:  return getTypeElement();
        case -791418107:  return getPatient();
        case -2132868344:  return getSpecimen();
        case -1335157162:  return getDevice();
        case 481140686:  return getPerformer();
        case 182460591:  return getLiteralElement();
        case 1811591356:  return getFormatted();
        case -554435892:  return getRelative();
        case -400605635:  return addPointer(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 3575610: /*type*/ return new String[] {"code"};
        case -791418107: /*patient*/ return new String[] {"Reference"};
        case -2132868344: /*specimen*/ return new String[] {"Reference"};
        case -1335157162: /*device*/ return new String[] {"Reference"};
        case 481140686: /*performer*/ return new String[] {"Reference"};
        case 182460591: /*literal*/ return new String[] {"string"};
        case 1811591356: /*formatted*/ return new String[] {"Attachment"};
        case -554435892: /*relative*/ return new String[] {};
        case -400605635: /*pointer*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("type")) {
          throw new FHIRException("Cannot call addChild on a primitive type MolecularSequence.type");
        }
        else if (name.equals("patient")) {
          this.patient = new Reference();
          return this.patient;
        }
        else if (name.equals("specimen")) {
          this.specimen = new Reference();
          return this.specimen;
        }
        else if (name.equals("device")) {
          this.device = new Reference();
          return this.device;
        }
        else if (name.equals("performer")) {
          this.performer = new Reference();
          return this.performer;
        }
        else if (name.equals("literal")) {
          throw new FHIRException("Cannot call addChild on a primitive type MolecularSequence.literal");
        }
        else if (name.equals("formatted")) {
          this.formatted = new Attachment();
          return this.formatted;
        }
        else if (name.equals("relative")) {
          this.relative = new MolecularSequenceRelativeComponent();
          return this.relative;
        }
        else if (name.equals("pointer")) {
          return addPointer();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "MolecularSequence";

  }

      public MolecularSequence copy() {
        MolecularSequence dst = new MolecularSequence();
        copyValues(dst);
        return dst;
      }

      public void copyValues(MolecularSequence dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.type = type == null ? null : type.copy();
        dst.patient = patient == null ? null : patient.copy();
        dst.specimen = specimen == null ? null : specimen.copy();
        dst.device = device == null ? null : device.copy();
        dst.performer = performer == null ? null : performer.copy();
        dst.literal = literal == null ? null : literal.copy();
        dst.formatted = formatted == null ? null : formatted.copy();
        dst.relative = relative == null ? null : relative.copy();
        if (pointer != null) {
          dst.pointer = new ArrayList<Reference>();
          for (Reference i : pointer)
            dst.pointer.add(i.copy());
        };
      }

      protected MolecularSequence typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof MolecularSequence))
          return false;
        MolecularSequence o = (MolecularSequence) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(type, o.type, true) && compareDeep(patient, o.patient, true)
           && compareDeep(specimen, o.specimen, true) && compareDeep(device, o.device, true) && compareDeep(performer, o.performer, true)
           && compareDeep(literal, o.literal, true) && compareDeep(formatted, o.formatted, true) && compareDeep(relative, o.relative, true)
           && compareDeep(pointer, o.pointer, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof MolecularSequence))
          return false;
        MolecularSequence o = (MolecularSequence) other_;
        return compareValues(type, o.type, true) && compareValues(literal, o.literal, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, type, patient
          , specimen, device, performer, literal, formatted, relative, pointer);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.MolecularSequence;
   }

 /**
   * Search parameter: <b>chromosome-edit-coordinate</b>
   * <p>
   * Description: <b>Search parameter by chromosome and edit coordinate. This will refer to part of a locus or part of a gene where search region will be represented in different coordinate systems, so please review.</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>MolecularSequence.relative.edit</b><br>
   * </p>
   */
  @SearchParamDefinition(name="chromosome-edit-coordinate", path="MolecularSequence.relative.edit", description="Search parameter by chromosome and edit coordinate. This will refer to part of a locus or part of a gene where search region will be represented in different coordinate systems, so please review.", type="composite", compositeOf={"chromosome", "edit-start"} )
  public static final String SP_CHROMOSOME_EDIT_COORDINATE = "chromosome-edit-coordinate";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>chromosome-edit-coordinate</b>
   * <p>
   * Description: <b>Search parameter by chromosome and edit coordinate. This will refer to part of a locus or part of a gene where search region will be represented in different coordinate systems, so please review.</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>MolecularSequence.relative.edit</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.NumberClientParam> CHROMOSOME_EDIT_COORDINATE = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.NumberClientParam>(SP_CHROMOSOME_EDIT_COORDINATE);

 /**
   * Search parameter: <b>chromosome-window-coordinate</b>
   * <p>
   * Description: <b>Search parameter by chromosome and window. This will refer to part of a locus or part of a gene where search region will be represented in different coordinate systems, so please review.</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>MolecularSequence.relative.reference</b><br>
   * </p>
   */
  @SearchParamDefinition(name="chromosome-window-coordinate", path="MolecularSequence.relative.reference", description="Search parameter by chromosome and window. This will refer to part of a locus or part of a gene where search region will be represented in different coordinate systems, so please review.", type="composite", compositeOf={"chromosome", "window-start"} )
  public static final String SP_CHROMOSOME_WINDOW_COORDINATE = "chromosome-window-coordinate";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>chromosome-window-coordinate</b>
   * <p>
   * Description: <b>Search parameter by chromosome and window. This will refer to part of a locus or part of a gene where search region will be represented in different coordinate systems, so please review.</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>MolecularSequence.relative.reference</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.NumberClientParam> CHROMOSOME_WINDOW_COORDINATE = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.NumberClientParam>(SP_CHROMOSOME_WINDOW_COORDINATE);

 /**
   * Search parameter: <b>chromosome</b>
   * <p>
   * Description: <b>Chromosome number of the reference sequence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MolecularSequence.relative.reference.chromosome</b><br>
   * </p>
   */
  @SearchParamDefinition(name="chromosome", path="MolecularSequence.relative.reference.chromosome", description="Chromosome number of the reference sequence", type="token" )
  public static final String SP_CHROMOSOME = "chromosome";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>chromosome</b>
   * <p>
   * Description: <b>Chromosome number of the reference sequence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MolecularSequence.relative.reference.chromosome</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CHROMOSOME = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CHROMOSOME);

 /**
   * Search parameter: <b>edit-end</b>
   * <p>
   * Description: <b>End position (0-based exclusive, which menas the acid at this position will not be included, 1-based inclusive, which means the acid at this position will be included) of the change.</b><br>
   * Type: <b>number</b><br>
   * Path: <b>MolecularSequence.relative.edit.end</b><br>
   * </p>
   */
  @SearchParamDefinition(name="edit-end", path="MolecularSequence.relative.edit.end", description="End position (0-based exclusive, which menas the acid at this position will not be included, 1-based inclusive, which means the acid at this position will be included) of the change.", type="number" )
  public static final String SP_EDIT_END = "edit-end";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>edit-end</b>
   * <p>
   * Description: <b>End position (0-based exclusive, which menas the acid at this position will not be included, 1-based inclusive, which means the acid at this position will be included) of the change.</b><br>
   * Type: <b>number</b><br>
   * Path: <b>MolecularSequence.relative.edit.end</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.NumberClientParam EDIT_END = new ca.uhn.fhir.rest.gclient.NumberClientParam(SP_EDIT_END);

 /**
   * Search parameter: <b>edit-start</b>
   * <p>
   * Description: <b>Start position (0-based inclusive, 1-based inclusive, that means the nucleic acid or amino acid at this position will be included) of the change.</b><br>
   * Type: <b>number</b><br>
   * Path: <b>MolecularSequence.relative.edit.start</b><br>
   * </p>
   */
  @SearchParamDefinition(name="edit-start", path="MolecularSequence.relative.edit.start", description="Start position (0-based inclusive, 1-based inclusive, that means the nucleic acid or amino acid at this position will be included) of the change.", type="number" )
  public static final String SP_EDIT_START = "edit-start";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>edit-start</b>
   * <p>
   * Description: <b>Start position (0-based inclusive, 1-based inclusive, that means the nucleic acid or amino acid at this position will be included) of the change.</b><br>
   * Type: <b>number</b><br>
   * Path: <b>MolecularSequence.relative.edit.start</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.NumberClientParam EDIT_START = new ca.uhn.fhir.rest.gclient.NumberClientParam(SP_EDIT_START);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>The unique identity for a particular sequence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MolecularSequence.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="MolecularSequence.identifier", description="The unique identity for a particular sequence", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>The unique identity for a particular sequence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MolecularSequence.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>The subject that the observation is about</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MolecularSequence.patient</b><br>
   * </p>
   */
  @SearchParamDefinition(name="patient", path="MolecularSequence.patient", description="The subject that the observation is about", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient") }, target={Patient.class } )
  public static final String SP_PATIENT = "patient";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>The subject that the observation is about</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>MolecularSequence.patient</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PATIENT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>MolecularSequence:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include("MolecularSequence:patient").toLocked();

 /**
   * Search parameter: <b>referenceseqid-edit-coordinate</b>
   * <p>
   * Description: <b>Search parameter by reference sequence and edit coordinate. This will refer to part of a locus or part of a gene where search region will be represented in different coordinate systems, so please review.</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>MolecularSequence.relative.edit</b><br>
   * </p>
   */
  @SearchParamDefinition(name="referenceseqid-edit-coordinate", path="MolecularSequence.relative.edit", description="Search parameter by reference sequence and edit coordinate. This will refer to part of a locus or part of a gene where search region will be represented in different coordinate systems, so please review.", type="composite", compositeOf={"referenceseqid", "edit-start"} )
  public static final String SP_REFERENCESEQID_EDIT_COORDINATE = "referenceseqid-edit-coordinate";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>referenceseqid-edit-coordinate</b>
   * <p>
   * Description: <b>Search parameter by reference sequence and edit coordinate. This will refer to part of a locus or part of a gene where search region will be represented in different coordinate systems, so please review.</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>MolecularSequence.relative.edit</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.NumberClientParam> REFERENCESEQID_EDIT_COORDINATE = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.NumberClientParam>(SP_REFERENCESEQID_EDIT_COORDINATE);

 /**
   * Search parameter: <b>referenceseqid-window-coordinate</b>
   * <p>
   * Description: <b>Search parameter by reference sequence and window. This will refer to part of a locus or part of a gene where search region will be represented in different coordinate systems, so please review.</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>MolecularSequence.relative.reference</b><br>
   * </p>
   */
  @SearchParamDefinition(name="referenceseqid-window-coordinate", path="MolecularSequence.relative.reference", description="Search parameter by reference sequence and window. This will refer to part of a locus or part of a gene where search region will be represented in different coordinate systems, so please review.", type="composite", compositeOf={"referenceseqid", "window-start"} )
  public static final String SP_REFERENCESEQID_WINDOW_COORDINATE = "referenceseqid-window-coordinate";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>referenceseqid-window-coordinate</b>
   * <p>
   * Description: <b>Search parameter by reference sequence and window. This will refer to part of a locus or part of a gene where search region will be represented in different coordinate systems, so please review.</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>MolecularSequence.relative.reference</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.NumberClientParam> REFERENCESEQID_WINDOW_COORDINATE = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.NumberClientParam>(SP_REFERENCESEQID_WINDOW_COORDINATE);

 /**
   * Search parameter: <b>referenceseqid</b>
   * <p>
   * Description: <b>Reference Sequence of the sequence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MolecularSequence.relative.reference.referenceSeqId</b><br>
   * </p>
   */
  @SearchParamDefinition(name="referenceseqid", path="MolecularSequence.relative.reference.referenceSeqId", description="Reference Sequence of the sequence", type="token" )
  public static final String SP_REFERENCESEQID = "referenceseqid";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>referenceseqid</b>
   * <p>
   * Description: <b>Reference Sequence of the sequence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MolecularSequence.relative.reference.referenceSeqId</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam REFERENCESEQID = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_REFERENCESEQID);

 /**
   * Search parameter: <b>type</b>
   * <p>
   * Description: <b>Amino Acid Sequence/ DNA Sequence / RNA Sequence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MolecularSequence.type</b><br>
   * </p>
   */
  @SearchParamDefinition(name="type", path="MolecularSequence.type", description="Amino Acid Sequence/ DNA Sequence / RNA Sequence", type="token" )
  public static final String SP_TYPE = "type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>type</b>
   * <p>
   * Description: <b>Amino Acid Sequence/ DNA Sequence / RNA Sequence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MolecularSequence.type</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_TYPE);

 /**
   * Search parameter: <b>window-end</b>
   * <p>
   * Description: <b>End position (0-based exclusive, which menas the acid at this position will not be included, 1-based inclusive, which means the acid at this position will be included) of the reference sequence.</b><br>
   * Type: <b>number</b><br>
   * Path: <b>MolecularSequence.relative.reference.windowEnd</b><br>
   * </p>
   */
  @SearchParamDefinition(name="window-end", path="MolecularSequence.relative.reference.windowEnd", description="End position (0-based exclusive, which menas the acid at this position will not be included, 1-based inclusive, which means the acid at this position will be included) of the reference sequence.", type="number" )
  public static final String SP_WINDOW_END = "window-end";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>window-end</b>
   * <p>
   * Description: <b>End position (0-based exclusive, which menas the acid at this position will not be included, 1-based inclusive, which means the acid at this position will be included) of the reference sequence.</b><br>
   * Type: <b>number</b><br>
   * Path: <b>MolecularSequence.relative.reference.windowEnd</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.NumberClientParam WINDOW_END = new ca.uhn.fhir.rest.gclient.NumberClientParam(SP_WINDOW_END);

 /**
   * Search parameter: <b>window-start</b>
   * <p>
   * Description: <b>Start position (0-based inclusive, 1-based inclusive, that means the nucleic acid or amino acid at this position will be included) of the reference sequence.</b><br>
   * Type: <b>number</b><br>
   * Path: <b>MolecularSequence.relative.reference.windowStart</b><br>
   * </p>
   */
  @SearchParamDefinition(name="window-start", path="MolecularSequence.relative.reference.windowStart", description="Start position (0-based inclusive, 1-based inclusive, that means the nucleic acid or amino acid at this position will be included) of the reference sequence.", type="number" )
  public static final String SP_WINDOW_START = "window-start";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>window-start</b>
   * <p>
   * Description: <b>Start position (0-based inclusive, 1-based inclusive, that means the nucleic acid or amino acid at this position will be included) of the reference sequence.</b><br>
   * Type: <b>number</b><br>
   * Path: <b>MolecularSequence.relative.reference.windowStart</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.NumberClientParam WINDOW_START = new ca.uhn.fhir.rest.gclient.NumberClientParam(SP_WINDOW_START);


}

