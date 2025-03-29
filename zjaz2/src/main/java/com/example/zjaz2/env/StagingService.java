package com.example.zjaz2.env;

import com.example.zjaz2.HandlerServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class StagingService implements HandlerServiceInterface {
    @Override
    public String printMessage() {
        return "Hello from Staging";
    }
}
