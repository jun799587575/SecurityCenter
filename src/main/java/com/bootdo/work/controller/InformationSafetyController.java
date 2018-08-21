package com.bootdo.work.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/information/safety")
public class InformationSafetyController {


    @GetMapping("/Identification")
    @RequiresPermissions("information:information:Identification")
    public String Identification(){
        return "work/list/identification";
    }

    @GetMapping("/Assessment")
    @RequiresPermissions("information:information:Assessment")
    public String Assessment(){
        return "work/list/assessment";
    }

    @GetMapping("/Management")
    @RequiresPermissions("information:information:Management")
    public String Management(){
        return "work/list/management";
    }

    @GetMapping("/Confirm")
    @RequiresPermissions("information:information:Confirm")
    public String Confirm(){
        return "work/list/confirm";
    }

    @GetMapping("/AssessmentOpinion")
    String AssessmentOpinion(){
        return "work/list/assessmentOpinion";
    }

    @GetMapping("/ManagementOpinion")
    String ManagementOpinion(){
        return "work/list/managementOpinion";
    }
    @GetMapping("/InformationAdd")
    String InformationAdd(){
        return "work/list/informationAdd";
    }

    @GetMapping("/InformationEdit")
    String InformationEdit(){
        return "work/list/informationEdit";
    }
    @GetMapping("/EditAssessment")
    String EditAssessment(){
        return "work/list/editAssessment";
    }
}
