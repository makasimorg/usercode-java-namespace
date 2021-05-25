package com.corezoid.usercode;

import com.corezoid.gitcall.runner.api.UsercodeHandler;
import java.util.Map;

public class Usercode implements UsercodeHandler<Map<String, Integer>, Map<String, Integer>> {
    @Override
    public Map<String, Integer> handle(Map<String, Integer> data) throws Exception {
        return data;
    }
}