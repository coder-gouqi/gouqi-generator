package com.gouqi.make.model;

import lombok.Data;

/**
 * 动态模版配置
 */
@Data
public class DataModel {

    /**
     * 是否生成循环
     */
    private boolean loop;

    /**
     * 核心模板
     */
    public MainTemplate mainTemplate = new MainTemplate();

    /**
     * 用于生成核心模板文件
     */
    @Data
    public static class MainTemplate {
        /**
         * 作者注释
         */
        public String author = "gouqi";

        /**
         * 输出信息
         */
        public String outputText = "Hello World!";
    }
}