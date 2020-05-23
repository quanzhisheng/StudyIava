package com.huawei.qis.qa.report.vo;

import com.huawei.qis.qa.report.bean.Report;

import java.util.List;

/**
 * @author Administrator
 * @create 2020/5/23
 */
public class ReportVO extends Report {

    private List<ReportTabVO> reportTabVO;


    public List<ReportTabVO> getReportTabVO() {
        return reportTabVO;
    }

    public void setReportTabVO(List<ReportTabVO> reportTabVO) {
        this.reportTabVO = reportTabVO;
    }
}
