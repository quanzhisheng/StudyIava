package com.huawei.qis.qa.report.service;

import com.huawei.qis.qa.report.bean.Report;
import com.huawei.qis.qa.report.vo.ReportVO;

import java.util.List;

/**
 * @author Administrator
 * @create 2020/5/23
 */
public interface ReportService {

    List<ReportVO> getReportList();

    ReportVO getReportById(int reportId);
}
