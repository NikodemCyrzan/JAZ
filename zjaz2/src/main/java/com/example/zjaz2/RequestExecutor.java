package com.example.zjaz2;

import org.springframework.stereotype.Service;

@Service
public class RequestExecutor {
    public RequestExecutor(FacadeService facadeService, Config config) {
        facadeService.execute(config.environment);
    }
}
