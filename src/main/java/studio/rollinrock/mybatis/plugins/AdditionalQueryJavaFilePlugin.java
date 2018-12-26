package studio.rollinrock.mybatis.plugins;

import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * @author rollinrock gilbombin
 * @mail caojing9111@outlook.com
 * @create 2018-12-25 19:13
 * @description
 **/
public class AdditionalQueryJavaFilePlugin extends PluginAdapter {

    private String targetProject;
//    private String targetPackage;
    private String queryFileNameSuffix;
    private boolean preferExtensionOverGenerics = true;

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        targetProject = properties.getProperty("targetProject",
                context.getJavaClientGeneratorConfiguration().getTargetProject()); //$NON-NLS-1$
//        targetPackage = properties.getProperty("targetPackage"); //$NON-NLS-1$
        queryFileNameSuffix = properties.getProperty("queryFileNameSuffix", "Query");
    }

    @Override
    public boolean validate(List<String> warnings) {
//        if (!StringUtility.stringHasValue(targetProject)
//                /*|| !StringUtility.stringHasValue(targetPackage)*/)
//            return false;
        return true;
    }

    @Override
    public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(
            IntrospectedTable introspectedTable) {
        if (!preferExtensionOverGenerics) return null;

        FullyQualifiedJavaType queryType =
                new FullyQualifiedJavaType(introspectedTable.getBaseRecordType().concat(queryFileNameSuffix));
        TopLevelClass topLevelClass = new TopLevelClass(queryType);
        topLevelClass.setVisibility(JavaVisibility.PUBLIC);

        topLevelClass.setSuperClass(introspectedTable.getBaseRecordType());
        topLevelClass.addImportedType(introspectedTable.getBaseRecordType());

        topLevelClass.addImportedType(
                new FullyQualifiedJavaType("lombok.Data")); //$NON-NLS-1$
        topLevelClass.addAnnotation("@Data"); //$NON-NLS-1$

        Field pageIndexField = new Field();
        pageIndexField.setVisibility(JavaVisibility.PRIVATE);
        pageIndexField.setType(new FullyQualifiedJavaType("java.lang.Integer"));
        pageIndexField.setName("pageIndex"); //$NON-NLS-1$
        topLevelClass.addField(pageIndexField);

        Field pageSizeField = new Field();
        pageSizeField.setVisibility(JavaVisibility.PRIVATE);
        pageSizeField.setType(new FullyQualifiedJavaType("java.lang.Integer"));
        pageSizeField.setName("pageSize"); //$NON-NLS-1$
        topLevelClass.addField(pageSizeField);

        GeneratedJavaFile queryFile = new GeneratedJavaFile(topLevelClass, targetProject,
                context.getProperty(PropertyRegistry.CONTEXT_JAVA_FILE_ENCODING),
                context.getJavaFormatter());
        return Arrays.asList(queryFile);
    }




}
