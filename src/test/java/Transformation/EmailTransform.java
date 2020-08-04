package Transformation;

import javax.xml.transform.*;
import cucumber.api.Transformer;
import java.util.Properties;

public class EmailTransform extends Transformer<String> {

    @Override
    public String transform(String userName){
        return userName.concat("ea.com");
    }
}
