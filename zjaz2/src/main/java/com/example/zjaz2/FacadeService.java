package com.example.zjaz2;

import com.example.zjaz2.env.DevService;
import com.example.zjaz2.env.ProdService;
import com.example.zjaz2.env.QaService;
import com.example.zjaz2.env.StagingService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FacadeService {
    public HashMap<String, HandlerServiceInterface> envServices;

    public FacadeService(DevService devService, QaService qaService, ProdService prodService, StagingService stagingService) {
        envServices = new HashMap<>();
        envServices.put("dev", devService);
        envServices.put("qa", qaService);
        envServices.put("prod", prodService);
        envServices.put("staging", stagingService);
    }

    public String execute(String environment) {
        String message = this.envServices.get(environment).printMessage();
        System.out.println(message);
        return message;
    }
}
