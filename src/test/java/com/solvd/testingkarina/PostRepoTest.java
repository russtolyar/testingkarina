package com.solvd.testingkarina;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import java.io.File;
import java.io.IOException;

public class PostRepoTest {

    @Test
    public void verifyCreateRepoTest() {
        PostNewRepository postNewRepository = new PostNewRepository();

        File file = new File("src/test/resources/api.users/post/rq.json");
        try {
            postNewRepository.setBodyContent(Files.readFile(file));
        } catch (IOException e) {
            throw new RuntimeException("Cannot Post repo " + e);
        }
        postNewRepository.setHeaders("Authorization=token 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");
        postNewRepository.expectResponseStatus(HttpResponseStatusType.CREATED_201);

        postNewRepository.callAPI();
        postNewRepository.validateResponse(JSONCompareMode.LENIENT);
    }
}
