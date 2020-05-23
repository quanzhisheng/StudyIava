package com.huawei.qis.qa.report.bean;

/**
 * Report POJO
 * @author Administrator
 * @create 2020/5/23
 */
public class Report {

    private int id;

    private String reportName;

    private String reportDesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportDesc() {
        return reportDesc;
    }

    public void setReportDesc(String reportDesc) {
        this.reportDesc = reportDesc;
    }
}
