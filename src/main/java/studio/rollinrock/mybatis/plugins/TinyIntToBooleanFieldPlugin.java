package studio.rollinrock.mybatis.plugins;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2018-12-24 19:24
 * @description
 **/
public class TinyIntToBooleanFieldPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> list) {
        return true;
    }

    @Override
    public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass,
                                IntrospectedColumn introspectedColumn,
                                IntrospectedTable introspectedTable, ModelClassType modelClassType) {


        return true;
    }
}
