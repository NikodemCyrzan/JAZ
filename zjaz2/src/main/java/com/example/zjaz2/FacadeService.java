package com.example.zjaz2;

import com.example.zjaz2.env.DevService;
import com.example.zjaz2.env.ProdService;
import com.example.zjaz2.env.QaService;
import org.springframework.stereotype.Service;

@Service
public class FacadeService {
    public DevService devService;
    public QaService qaService;
    public ProdService prodService;

    public FacadeService(DevService devService, QaService qaService, ProdService prodService) {
        this.devService = devService;
        this.qaService = qaService;
        this.prodService = prodService;
    }

    public void execute(String environment) {
        switch (environment) {
            case "dev":
                this.devService.printMessage();
                break;
            case "qa":
                this.qaService.printMessage();
                break;
            case "prod":
                this.prodService.printMessage();
                break;
        }
    }
}
