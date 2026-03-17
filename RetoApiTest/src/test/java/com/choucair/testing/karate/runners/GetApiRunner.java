package com.choucair.testing.karate.runners;

import com.intuit.karate.junit5.Karate;

public class GetApiRunner {

        @Karate.Test
        Karate testGet() {
            return Karate.run("classpath:features")
                    .tags("@put")
                    .relativeTo(getClass());
        }
    }
