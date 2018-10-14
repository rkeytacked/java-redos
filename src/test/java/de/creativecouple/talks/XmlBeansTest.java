package de.creativecouple.talks;

import static org.junit.Assert.assertTrue;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlObject;
import org.junit.Test;

public class XmlBeansTest {

    @Test
    public void testCpuBurningPatternMatching() throws Exception {
        SchemaTypeLoader schema = XmlBeans.loadXsd(new XmlObject[]{
                XmlObject.Factory.parse(getClass().getResource("/test-pattern.xsd"))});
        SchemaType fooType = schema.findDocumentType(new QName("", "foo"));

        XmlObject data = XmlBeans.getContextTypeLoader()
                .parse(getClass().getResource("/test-data.xml"), fooType, null);

        assertTrue(data.validate());
    }
}
