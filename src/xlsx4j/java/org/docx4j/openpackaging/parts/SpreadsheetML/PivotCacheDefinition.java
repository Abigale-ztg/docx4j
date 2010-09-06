package org.docx4j.openpackaging.parts.SpreadsheetML;

import javax.xml.bind.JAXBElement;

import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.parts.JaxbXmlPart;
import org.docx4j.openpackaging.parts.PartName;
import org.docx4j.openpackaging.parts.relationships.Namespaces;
import org.xlsx4j.jaxb.Context;
import org.xlsx4j.sml.CTPivotCacheDefinition;
import org.xlsx4j.sml.CTStylesheet;

public class PivotCacheDefinition  extends JaxbSmlPart<JAXBElement<CTPivotCacheDefinition>> {
	
	public PivotCacheDefinition(PartName partName) throws InvalidFormatException {
		super(partName);
		init();
	}

	public PivotCacheDefinition() throws InvalidFormatException {
		super(new PartName("/xl/pivotCache/pivotCacheDefinition1.xml"));
		init();
	}
	
	public void init() {
				
		// Used if this Part is added to [Content_Types].xml 
		setContentType(new  org.docx4j.openpackaging.contenttype.ContentType( 
				org.docx4j.openpackaging.contenttype.ContentTypes.SPREADSHEETML_PIVOT_CACHE_DEFINITION));

		// Used when this Part is added to a rels 
		setRelationshipType(Namespaces.SPREADSHEETML_PIVOT_CACHE_DEFINITION);
		
	}

}