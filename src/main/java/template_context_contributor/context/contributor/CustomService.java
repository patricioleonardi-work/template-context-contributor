package template_context_contributor.context.contributor;

import com.liferay.asset.kernel.model.AssetCategory;
import com.liferay.asset.kernel.service.AssetCategoryLocalServiceUtil;
import org.osgi.service.component.annotations.Component;

import java.util.List;

@Component(service = CustomService.class, immediate = true)
public class CustomService {

    public CustomService(){};

    public List<AssetCategory> getCategories(){
        return AssetCategoryLocalServiceUtil.getCategories();
    }

}
