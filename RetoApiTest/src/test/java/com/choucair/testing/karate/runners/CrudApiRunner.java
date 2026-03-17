package com.choucair.testing.karate.runners;

import com.intuit.karate.junit5.Karate;

public class CrudApiRunner {
    @Karate.Test
    Karate testCrud() {
        return Karate.run("classpath:features")
                .tags("@crud")
                .relativeTo(getClass());
    }
}
