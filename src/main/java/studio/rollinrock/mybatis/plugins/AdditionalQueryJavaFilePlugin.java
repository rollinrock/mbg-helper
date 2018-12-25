package studio.rollinrock.mybatis.plugins;

import org.mybatis.generator.api.PluginAdapter;

import java.util.List;

/**
 * @author rollinrock gilbombin
 * @mail caojing9111@outlook.com
 * @create 2018-12-25 19:13
 * @description
 **/
public class AdditionalQueryJavaFilePlugin extends PluginAdapter {
    @Override
    public boolean validate(List<String> warnings) {
        return false;
    }


}
