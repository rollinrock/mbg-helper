package studio.rollinrock.mybatis.generator;

/**
 * @author rollinrock
 * @mail caojing9111@outlook.com
 * @create 2018-12-25 14:28
 * @description
 **/
public interface IntrospectedColumnAware {
    boolean hasExactColumnByName(String columnName);
}
