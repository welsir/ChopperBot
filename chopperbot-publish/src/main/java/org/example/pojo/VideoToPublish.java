package org.example.pojo;

import lombok.Builder;
import lombok.Data;

/**
 * @Description
 * @Author welsir
 * @Date 2023/10/13 19:02
 */

@Data
@Builder
public class VideoToPublish {

    private String videoPath;
    private String cookies;
    private PlatformType platform;
    private String coverPath;
    private String devicePath;
    private String tag;
    private String title;
    private String type;

}
