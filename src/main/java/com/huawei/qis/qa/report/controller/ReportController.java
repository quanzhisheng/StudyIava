package com.huawei.qis.qa.report.controller;

import com.huawei.qis.qa.report.bean.Report;
import com.huawei.qis.qa.report.resp.CommonResponse;
import com.huawei.qis.qa.report.service.ReportService;
import com.huawei.qis.qa.report.vo.ReportVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * @author Administrator
 * @create 2020/5/23
 */

@RestController
@RequestMapping("/api/qis/qa")
public class ReportController {

    private final ReportService reportService;

    @Autowired
    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }


    @GetMapping("/report/getReportList")
    public CommonResponse  getReportList(){

        List<ReportVO> report=reportService.getReportList();

        CommonResponse resp=new CommonResponse();

        resp.setCode(200);
        resp.setMsg("success");
        resp.setData(report);

        return resp;

    }

    @GetMapping("/report/getReportById/{reportId}")
    public CommonResponse  getReportById(@PathVariable int reportId){

        ReportVO report=reportService.getReportById(reportId);

        CommonResponse resp=new CommonResponse();

        resp.setCode(200);
        resp.setMsg("success");
        resp.setData(report);

        return resp;

    }
}
