package com.huawei.qis.qa.report.vo;

import com.huawei.qis.qa.report.bean.ReportTab;
import com.huawei.qis.qa.report.bean.ReportTabLayout;

import java.util.List;

/**
 * @author Administrator
 * @create 2020/5/23
 */
public class ReportTabVO extends ReportTab {

    private List<ReportTabLayoutVO>  reportTabLayoutVO;

    public List<ReportTabLayoutVO> getReportTabLayoutVO() {
        return reportTabLayoutVO;
    }

    public void setReportTabLayoutVO(List<ReportTabLayoutVO> reportTabLayoutVO) {
        this.reportTabLayoutVO = reportTabLayoutVO;
    }
}
