package studio.rollinrock.mybatis.plugins;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2018-12-18 16:31
 * @description
 **/
public class RepositoryAnnotationPlugin extends PluginAdapter {
    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean clientGenerated(Interface interfaze,
                                   TopLevelClass topLevelClass,
                                   IntrospectedTable introspectedTable) {

        interfaze.addImportedType(
                new FullyQualifiedJavaType("org.springframework.stereotype.Repository")); //$NON-NLS-1$
        interfaze.addAnnotation("@Repository"); //$NON-NLS-1$

        return true;
    }



}
