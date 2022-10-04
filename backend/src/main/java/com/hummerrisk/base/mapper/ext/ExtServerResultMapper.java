package com.hummerrisk.base.mapper.ext;

import com.hummerrisk.base.domain.HistoryServerTask;
import com.hummerrisk.controller.request.server.ServerResultRequest;
import com.hummerrisk.dto.HistoryServerResultDTO;
import com.hummerrisk.dto.ServerResultDTO;

import java.util.List;
import java.util.Map;

public interface ExtServerResultMapper {

    List<ServerResultDTO> resultList(ServerResultRequest request);

    List<Map<String, Object>> serverChart();

    List<Map<String, Object>> severityChart();

    List<String> serverChartX(Map<String, Object> params);

    List<Integer> serverChartY(Map<String, Object> params);

    List<HistoryServerResultDTO> history(Map<String, Object> params);

}
