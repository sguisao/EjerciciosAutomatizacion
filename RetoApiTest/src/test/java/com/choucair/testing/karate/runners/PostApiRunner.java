package com.choucair.testing.karate.runners;

import com.intuit.karate.junit5.Karate;

public class PostApiRunner {

    @Karate.Test
    Karate testPost() {
        return Karate.run("classpath:features")
                .tags("@post")
                .relativeTo(getClass());
    }
}
