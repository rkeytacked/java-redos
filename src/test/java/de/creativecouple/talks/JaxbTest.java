package de.creativecouple.talks;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.junit.Test;

public class JaxbTest {

    @Test
    public void testCpuBurningPatternMatching() throws Exception {
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(getClass().getResource("/test-pattern.xsd"));

        JAXBContext jc = JAXBContext.newInstance(String.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        unmarshaller.setSchema(schema);
        String data = (String) unmarshaller.unmarshal(getClass().getResource("/test-data.xml"));
        assertNotNull(data);
    }
}
