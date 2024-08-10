package org.amida.licensing_service;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Operation(summary = "Create a new task")
    @ApiResponse(responseCode = "200", description = "Task created successfully")
    @GetMapping("/home")
    public String getHome(){
        return "Hello World";
    }


}
