import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.solvd.farmapp.dao.FarmDAOImpl;

import java.io.File;
import java.io.IOException;

public class XMLValidation {

	private static final Logger LOGGER = LogManager.getLogger(XMLValidation.class);
    public static void main(String[] args) {
        String xmlFilePath = "Farm.xml";
        String xsdFilePath = "Farm.xsd";

        try {
            // Create a DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);

            // Enable validation against the XSD schema
            factory.setValidating(true);
            factory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaLanguage", "http://www.w3.org/2001/XMLSchema");
            factory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaSource", new File(xsdFilePath));

            // Create a DocumentBuilder using the DOM parser
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse the XML file
            Document document = builder.parse(new File(xmlFilePath));

            // If the parsing completes without exceptions, the XML is valid
            LOGGER.info("Validation successful. The XML file is valid.");
        } catch (ParserConfigurationException | SAXException e) {
            // Exception occurred during parsing or validation
            LOGGER.error("Validation failed. The XML file is not valid.");
        
        } catch (IOException e) {
            // Exception occurred while reading the XML or XSD file
            LOGGER.error("Error reading the XML or XSD file.");
          
        }
    }
}
