package com.example.demo.controller;

import com.example.demo.model.dto.RegistCardDto;
import com.example.demo.service.FlowService;
import lombok.Data;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.runtime.ProcessInstance;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api/v1/flow")
@Data
public class WorkflowController {

    private final FlowService flowService;


    @PostMapping(value = "/initialFlow")
    public String create(@RequestBody RegistCardDto registCardDto) {
        ProcessInstance registCardProcess = flowService.initiateFlow(registCardDto);

        return "create";
    }
}
