package com.solvd.testingkarina;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import java.io.File;
import java.io.IOException;

public class PatchRepoTest {

    @Test
    public void verifyPatchRepoTest() {

        PatchRepository patchRepository = new PatchRepository();

        File file = new File("src/test/resources/api.users/patch/rq.json");
        try {
            patchRepository.setBodyContent(Files.readFile(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        patchRepository.expectResponseStatus(HttpResponseStatusType.OK_200);
        patchRepository.setHeaders("Authorization=token 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");

        patchRepository.callAPI();
        patchRepository.validateResponse(JSONCompareMode.LENIENT);
    }
}
