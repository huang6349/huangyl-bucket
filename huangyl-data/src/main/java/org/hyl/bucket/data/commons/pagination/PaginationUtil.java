package org.hyl.bucket.data.commons.pagination;

import com.google.common.collect.Maps;
import org.hyl.bucket.commons.result.domain.Message;
import org.hyl.bucket.commons.result.enums.NetworkEnum;
import org.hyl.bucket.commons.result.service.dto.MessageDTO;
import org.springframework.data.domain.Page;

import java.util.Map;

public interface PaginationUtil {

    String MESSAGE = "请求分页数据成功";

    static Message execute(Page page) {
        Map<String, Object> map = Maps.newHashMap();
        map.put("page", page.getNumber() + 1);
        map.put("size", page.getSize());
        map.put("total", page.getTotalElements());
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.SUCCESS, null, MESSAGE, page.getContent(), map));
    }
}
