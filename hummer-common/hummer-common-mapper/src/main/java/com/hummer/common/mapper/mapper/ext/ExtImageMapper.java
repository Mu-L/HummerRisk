package com.hummer.common.mapper.mapper.ext;


import com.hummer.common.mapper.dto.ImageDTO;
import com.hummer.common.mapper.domain.request.image.ImageRequest;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author harris
 */
public interface ExtImageMapper {

    List<ImageDTO> imageList(@Param("request") ImageRequest request);

    Map<String, Object> topInfo(Map<String, Object> params);

    List<Map<String, Object>> imageRepoChart();

    List<Map<String, Object>> severityChart();
}