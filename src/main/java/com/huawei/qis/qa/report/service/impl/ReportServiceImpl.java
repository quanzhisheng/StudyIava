package com.huawei.qis.qa.report.service.impl;

import com.huawei.qis.qa.report.dao.ReportDaoMapper;
import com.huawei.qis.qa.report.service.ReportService;
import com.huawei.qis.qa.report.vo.ReportVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @create 2020/5/23
 */
@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportDaoMapper reportDao;

    @Override
    public List<ReportVO> getReportList() {
        return reportDao.getReportList();
    }

    @Override
    public ReportVO getReportById(int reportId) {
        return reportDao.getReportById(reportId);
    }
}
