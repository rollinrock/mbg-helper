package studio.rollinrock.mybatis.plugins;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.Plugin;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2018-12-24 19:43
 * @description
 **/
public class SwaggerModelAnnotationPlugin extends PluginAdapter {
    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass,
                                                 IntrospectedTable introspectedTable) {
        topLevelClass.addImportedType(
                new FullyQualifiedJavaType("io.swagger.annotations.ApiModel"));
        topLevelClass.addImportedType(
                new FullyQualifiedJavaType("io.swagger.annotations.ApiModelProperty")); //$NON-NLS-1$
        if(null == introspectedTable.getRemarks() || "".equals(introspectedTable.getRemarks()))
            topLevelClass.addAnnotation("@ApiModel");
        else
            topLevelClass.addAnnotation(String.format("@ApiModel(description=\"%s\")", introspectedTable.getRemarks()));
        return true;
    }

    @Override
    public boolean modelFieldGenerated(Field field,
                                       TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
                                       IntrospectedTable introspectedTable,
                                       Plugin.ModelClassType modelClassType) {
        field.addAnnotation(String.format("@ApiModelProperty(name=\"%s\",notes=\"%s\")", introspectedColumn.getJavaProperty(), introspectedColumn.getRemarks()));
        return true;
    }


}
