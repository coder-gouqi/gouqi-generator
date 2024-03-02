package com.gouqi.make.template;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;
import com.gouqi.make.model.TemplateMakerConfig;
import org.junit.Test;

public class TemplateMakerTest {

    /**
     * 测试同配置多次生成时，强制变为静态生成
     */
//    @Test
//    public void testMakeTemplateBug1() {
//        Meta meta = new Meta();
//        meta.setName("acm-template");
//        meta.setDescription("ACM 模板生成器");
//
//        String projectPath = System.getProperty("user.dir");
//        String originProjectPath = new File(projectPath).getParent() + File.separator + "springboot";
//        // 输入文件
//        String inputFilePath1 = "src/main/java/com/gouqi/common";
//
//        // 模型配置
//        TemplateMakerModelConfig.ModelInfoConfig modelInfoConfig1 = new TemplateMakerModelConfig.ModelInfoConfig();
//        modelInfoConfig1.setFieldName("className");
//        modelInfoConfig1.setType("String");
//        modelInfoConfig1.setReplaceText("BaseResponse");
//        // 文件参数配置
////        String inputFilePath1 = "src/main/resources/application.yml";
//        TemplateMakerFileConfig templateMakerFileConfig = new TemplateMakerFileConfig();
//        TemplateMakerFileConfig.FileInfoConfig fileInfoConfig1 = new TemplateMakerFileConfig.FileInfoConfig();
//        fileInfoConfig1.setPath(inputFilePath1);
//        templateMakerFileConfig.setFiles(Arrays.asList(fileInfoConfig1));
//
//        // 模型参数配置
//        TemplateMakerModelConfig templateMakerModelConfig = new TemplateMakerModelConfig();
////        TemplateMakerModelConfig.ModelInfoConfig modelInfoConfig1 = new TemplateMakerModelConfig.ModelInfoConfig();
////        modelInfoConfig1.setFieldName("url");
////        modelInfoConfig1.setType("String");
////        modelInfoConfig1.setDefaultValue("jdbc:mysql://localhost:3306/my_db");
////        modelInfoConfig1.setReplaceText("jdbc:mysql://localhost:3306/my_db");
//        List<TemplateMakerModelConfig.ModelInfoConfig> modelInfoConfigList = Arrays.asList(modelInfoConfig1);
//        templateMakerModelConfig.setModels(modelInfoConfigList);
//
//        long id = TemplateMaker.makeTemplate(meta, originProjectPath, templateMakerFileConfig, templateMakerModelConfig, 1762815324237357056L);
//        System.out.println(id);
//    }

    /**
     * 同文件目录多次生成时，会扫描新的 FTL 文件
     */
//    @Test
//    public void testMakeTemplateBug2() {
//        Meta meta = new Meta();
//        meta.setName("acm-template");
//        meta.setDescription("ACM 模板生成器");
//
//        String projectPath = System.getProperty("user.dir");
//        String originProjectPath = new File(projectPath).getParent() + File.separator + "springboot";
//
//        // 文件参数配置，扫描目录
//        String inputFilePath1 = "./";
//        TemplateMakerFileConfig templateMakerFileConfig = new TemplateMakerFileConfig();
//        TemplateMakerFileConfig.FileInfoConfig fileInfoConfig1 = new TemplateMakerFileConfig.FileInfoConfig();
//        fileInfoConfig1.setPath(inputFilePath1);
//        templateMakerFileConfig.setFiles(Arrays.asList(fileInfoConfig1));
//
//        // 模型参数配置
//        TemplateMakerModelConfig templateMakerModelConfig = new TemplateMakerModelConfig();
//        TemplateMakerModelConfig.ModelInfoConfig modelInfoConfig1 = new TemplateMakerModelConfig.ModelInfoConfig();
//        modelInfoConfig1.setFieldName("className");
//        modelInfoConfig1.setType("String");
//        modelInfoConfig1.setReplaceText("BaseResponse");
//        List<TemplateMakerModelConfig.ModelInfoConfig> modelInfoConfigList = Arrays.asList(modelInfoConfig1);
//        templateMakerModelConfig.setModels(modelInfoConfigList);
//
//        long id = TemplateMaker.makeTemplate(meta, originProjectPath, templateMakerFileConfig, templateMakerModelConfig, 1762815324237357056L);
//        System.out.println(id);
//    }

    /**
     * 使用 JSON 制作模板
     */
    @Test
    public void testMakeTemplateWithJSON() {
        String configStr = ResourceUtil.readUtf8Str("templateMaker.json");
        TemplateMakerConfig templateMakerConfig = JSONUtil.toBean(configStr, TemplateMakerConfig.class);
        long id = TemplateMaker.makeTemplate(templateMakerConfig);
        System.out.println(id);
    }

    /**
     * 制作 SpringBoot 模板
     */
    @Test
    public void makeSpringBootTemplate() {
        String rootPath = "examples/springboot/";
        String configStr = ResourceUtil.readUtf8Str(rootPath + "templateMaker.json");
        TemplateMakerConfig templateMakerConfig = JSONUtil.toBean(configStr, TemplateMakerConfig.class);
        long id = TemplateMaker.makeTemplate(templateMakerConfig);

        configStr = ResourceUtil.readUtf8Str(rootPath + "templateMaker1.json");
        templateMakerConfig = JSONUtil.toBean(configStr, TemplateMakerConfig.class);
        TemplateMaker.makeTemplate(templateMakerConfig);

        configStr = ResourceUtil.readUtf8Str(rootPath + "templateMaker2.json");
        templateMakerConfig = JSONUtil.toBean(configStr, TemplateMakerConfig.class);
        TemplateMaker.makeTemplate(templateMakerConfig);

        configStr = ResourceUtil.readUtf8Str(rootPath + "templateMaker3.json");
        templateMakerConfig = JSONUtil.toBean(configStr, TemplateMakerConfig.class);
        TemplateMaker.makeTemplate(templateMakerConfig);

        configStr = ResourceUtil.readUtf8Str(rootPath + "templateMaker4.json");
        templateMakerConfig = JSONUtil.toBean(configStr, TemplateMakerConfig.class);
        TemplateMaker.makeTemplate(templateMakerConfig);

        configStr = ResourceUtil.readUtf8Str(rootPath + "templateMaker5.json");
        templateMakerConfig = JSONUtil.toBean(configStr, TemplateMakerConfig.class);
        TemplateMaker.makeTemplate(templateMakerConfig);

        configStr = ResourceUtil.readUtf8Str(rootPath + "templateMaker6.json");
        templateMakerConfig = JSONUtil.toBean(configStr, TemplateMakerConfig.class);
        TemplateMaker.makeTemplate(templateMakerConfig);

        configStr = ResourceUtil.readUtf8Str(rootPath + "templateMaker7.json");
        templateMakerConfig = JSONUtil.toBean(configStr, TemplateMakerConfig.class);
        TemplateMaker.makeTemplate(templateMakerConfig);

        configStr = ResourceUtil.readUtf8Str(rootPath + "templateMaker8.json");
        templateMakerConfig = JSONUtil.toBean(configStr, TemplateMakerConfig.class);
        TemplateMaker.makeTemplate(templateMakerConfig);
        System.out.println(id);
    }
}