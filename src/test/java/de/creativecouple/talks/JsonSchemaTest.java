package de.creativecouple.talks;

import static junit.framework.Assert.assertNotNull;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.everit.json.schema.regexp.RE2JRegexpFactory;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Test;

public class JsonSchemaTest {

    @Test
    public void testCpuBurningPatternMatching() throws Exception {
        JSONObject jsonSchema = new JSONObject(new JSONTokener(getClass().getResourceAsStream("/test-schema.json")));
        Schema schema = SchemaLoader.load(jsonSchema);

        JSONObject jsonData = new JSONObject(new JSONTokener(getClass().getResourceAsStream("/test-data.json")));

        schema.validate(jsonData);
        assertNotNull(jsonData);
    }

    @Test
    public void testLinearPatternMatching() throws Exception {
        SchemaLoader loader = SchemaLoader.builder()
                .regexpFactory(new RE2JRegexpFactory())
                .schemaJson(new JSONObject(new JSONTokener(getClass().getResourceAsStream("/test-schema.json"))))
                .build();
        Schema schema = loader.load().build();

        JSONObject jsonData = new JSONObject(new JSONTokener(getClass().getResourceAsStream("/test-data.json")));

        schema.validate(jsonData);
        assertNotNull(jsonData);

    }
}
