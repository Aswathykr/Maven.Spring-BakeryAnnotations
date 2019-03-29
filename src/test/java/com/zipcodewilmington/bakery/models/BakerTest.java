package com.zipcodewilmington.bakery.models;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.json.JsonContent;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Entity;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;


@JsonTest
@RunWith(SpringRunner.class)
public class BakerTest {

    @Autowired
    private JacksonTester<Baker> json;

    @Test
    public void testClassSignatureAnnotations() {
        Assert.assertTrue(Baker.class.isAnnotationPresent(Entity.class));
    }
    @Test
    public void testCreateJson() throws IOException {
        //ObjectMapper jsonWriter = new ObjectMapper();
        Baker baker = new Baker();
        //String json = jsonWriter.writeValueAsString(baker);
        JsonContent<Baker> ctx = this.json.write(baker);
        PathMatchingResourcePatternResolver pathResolver = new PathMatchingResourcePatternResolver();
        //assertThat(ctx).isEqualToJson("baker.json");
    }
}
