package yz.com.mytestresource.resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import sun.tools.jar.resources.jar;
import yz.com.resource.metas.resource.AreaCodResource;
import yz.com.resource.metas.resourcemodel.resource.AreaInfoModelResource;

@Service
@Primary
public class MyMetaTestResource extends AreaCodResource {

    public MyMetaTestResource(AreaInfoModelResource modelRes) {
        super(modelRes);
    }

}
