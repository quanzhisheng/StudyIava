package com.huawei.qis.qa.report.dao;

import com.huawei.qis.qa.report.vo.ReportVO;

import java.util.List;

/**
 * @author Administrator
 * @create 2020/5/23
 */
public interface ReportDaoMapper {

    List<ReportVO> getReportList();

    ReportVO getReportById(int reportId);
}
