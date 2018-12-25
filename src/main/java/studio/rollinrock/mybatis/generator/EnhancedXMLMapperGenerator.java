package studio.rollinrock.mybatis.generator;

import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.XMLMapperGenerator;
import org.mybatis.generator.internal.util.StringUtility;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2018-12-25 13:21
 * @description
 **/
public class EnhancedXMLMapperGenerator
        extends XMLMapperGenerator implements IntrospectedColumnAware{

    @Override
    public XmlElement getSqlMapElement() {
        XmlElement rootElement = super.getSqlMapElement();
        addEnhancedElements(rootElement);

        return rootElement;
    }

    private void addSelectLatestCreatedByExampleWithoutBLOBsElement(XmlElement parentElement){
        if (introspectedTable.getRules().generateBaseResultMap()
                && hasExactColumnByName("gmt_create")) {
            SelectLatestCreatedByExampleWithoutBLOBsElementGenerator elementGenerator = new SelectLatestCreatedByExampleWithoutBLOBsElementGenerator();
            initializeAndExecuteGenerator(elementGenerator, parentElement);
        }
    }

    protected void addEnhancedElements(XmlElement rootElement){
        addSelectLatestCreatedByExampleWithoutBLOBsElement(rootElement);
    }

    @Override
    public boolean hasExactColumnByName(String columnName) {
        if(!StringUtility.stringHasValue(columnName)) return false;
        if(null == introspectedTable) return false;
        return introspectedTable.getBaseColumns().stream()
                .anyMatch(column -> column.getActualColumnName().equalsIgnoreCase(columnName));

    }
}
