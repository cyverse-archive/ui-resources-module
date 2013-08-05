package org.iplantc.core.resources.client.theme.window;

import com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance;
import com.sencha.gxt.theme.gray.client.panel.GrayContentPanelAppearance;

public class IPlantGrayContentPanelAppearance extends GrayContentPanelAppearance {

    @Override
    public HeaderDefaultAppearance getHeaderAppearance() {
        return new IPlantGrayCpHeaderAppearance();
    }
}
