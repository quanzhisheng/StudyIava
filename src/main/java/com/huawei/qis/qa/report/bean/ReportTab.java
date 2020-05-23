package com.huawei.qis.qa.report.bean;

/**
 * @author Administrator
 * @create 2020/5/23
 */
public class ReportTab {

    private int id;

    private int reportId;

    private String reportTabName;

    private int reportTabOrder;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getReportTabName() {
        return reportTabName;
    }

    public void setReportTabName(String reportTabName) {
        this.reportTabName = reportTabName;
    }

    public int getReportTabOrder() {
        return reportTabOrder;
    }

    public void setReportTabOrder(int reportTabOrder) {
        this.reportTabOrder = reportTabOrder;
    }
}
