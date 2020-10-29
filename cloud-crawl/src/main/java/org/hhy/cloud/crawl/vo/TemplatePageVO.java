package org.hhy.cloud.crawl.vo;


import lombok.Data;
import org.hhy.cloud.crawl.entity.TemplateField;
import org.hhy.cloud.crawl.entity.TemplatePage;
import org.lht.boot.web.domain.vo.AbstractVO;

import java.util.List;

/**
 * @description: 模板页VO
 * @author: LiHaitao
 * @date: 2020/9/22 17:35
 */
@Data
public class TemplatePageVO extends AbstractVO<TemplatePage, String> {


    /**
     * 任务id
     */
    private String jobId;
    /**
     * 页面名称
     * eg: 列表页，详情页
     */
    private String name;

    /**
     * url 正则
     */
    private String urlRegex;

    /**
     * xpath,用来获取列表页的列表长度和获取列表页的key
     * 详情页的key为page.getRequest().getUrl();
     */
    private String keyXpath;

    /**
     * ,用来获取列表页的列表长度和获取列表页的key
     * 详情页的key为page.getRequest().getUrl();
     */
    private String keyRegex;

    /**
     * 列表页动态字段
     */
    private List<TemplateFieldVO> listFields;
    /**
     * 详情页动态字段
     */
    private List<TemplateFieldVO> detailFields;
}