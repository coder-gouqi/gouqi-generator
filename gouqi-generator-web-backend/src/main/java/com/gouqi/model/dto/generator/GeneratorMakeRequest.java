package com.gouqi.model.dto.generator;

import com.gouqi.make.meta.Meta;
import lombok.Data;

import java.io.Serializable;

/**
 * 制作代码生成器请求
 *
 * @author <a href="https://github.com/ligouqi">程序员鱼皮</a>
 * @from <a href="https://gouqi.icu">编程导航知识星球</a>
 */
@Data
public class GeneratorMakeRequest implements Serializable {

    /**
     * 压缩文件路径
     */
    private String zipFilePath;

    /**
     * 元信息
     */
    private Meta meta;

    private static final long serialVersionUID = 1L;
}