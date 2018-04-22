package org.hyl.bucket.data.auditing.level;

import org.apache.commons.lang3.StringUtils;
import org.hyl.bucket.data.auditing.level.service.dto.LevelDTO;

import java.util.List;

public interface LevelUtil<T extends LevelDTO<T>> {

    String SEPARATOR = ".";

    String ROOT = "0";

    static String calculateLevel() {
        return ROOT;
    }

    static String calculateLevel(String parentLevel, long parentId) {
        if (StringUtils.isBlank(parentLevel)) {
            return calculateLevel();
        }
        return StringUtils.join(parentLevel, SEPARATOR, parentId);
    }

    List<T> listToTree(List<T> list);

    List<T> listToTree(List<T> list, String level);
}
