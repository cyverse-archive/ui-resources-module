package org.iplantc.core.resources.client;

import com.google.gwt.resources.client.CssResource;

public interface DiskResourceNameCellStyle extends CssResource {

    String drFile();

    String drFolder();

    String nameStyle();

    String nameStyleNoPointer();
    
    String nameDisabledStyle();

}
