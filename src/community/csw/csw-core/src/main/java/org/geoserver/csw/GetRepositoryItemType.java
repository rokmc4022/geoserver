/* Copyright (c) 2012 TOPP - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */

package org.geoserver.csw;

/**
 * Represents the CSW/ebRIM GetRepositoryItem request
 * 
 * @author Andrea Aime - GeoSolutions
 * */
public class GetRepositoryItemType {

    String service;

    String version;

    String id;

    /**
     * The OGC service (should be "CSW")
     * 
     * @return
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    /**
     * The service version (for example "2.0.2")
     * 
     * @return
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * The repository item id
     * 
     * @return
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
