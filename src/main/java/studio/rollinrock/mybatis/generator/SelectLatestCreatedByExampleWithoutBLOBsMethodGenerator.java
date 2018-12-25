package studio.rollinrock.mybatis.generator;

import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.AbstractJavaMapperMethodGenerator;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2018-12-25 10:22
 * @description
 **/
public class SelectLatestCreatedByExampleWithoutBLOBsMethodGenerator
                                        extends AbstractJavaMapperMethodGenerator {

    public SelectLatestCreatedByExampleWithoutBLOBsMethodGenerator() {
        super();
    }

    @Override
    public void addInterfaceElements(Interface interfaze) {
        FullyQualifiedJavaType type = new FullyQualifiedJavaType(
                introspectedTable.getExampleType());

        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);

        FullyQualifiedJavaType returnType = new FullyQualifiedJavaType(introspectedTable
                .getBaseRecordType());
        method.setReturnType(returnType);

        method.setName("selectLatestCreatedByExample");
        method.addParameter(new Parameter(type, "example")); //$NON-NLS-1$

        context.getCommentGenerator().addGeneralMethodComment(method,
                introspectedTable);

        interfaze.addMethod(method);
    }
}
