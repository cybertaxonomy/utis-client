// $Id$
/**
* Copyright (C) 2015 EDIT
* European Distributed Institute of Taxonomy
* http://www.e-taxonomy.eu
*
* The contents of this file are subject to the Mozilla Public License Version 1.1
* See LICENSE.TXT at the top of this package for the full license terms.
*/
package org.cybertaxonomy;

import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.ServiceProviderInfo;

import java.util.List;

import org.cybertaxonomy.utis.client.ApiClient;
import org.cybertaxonomy.utis.client.ApiException;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author a.kohlbecker
 * @date Nov 2, 2015
 *
 */
public class UtisClientTest {

    @Test
    public void simpleTest() throws ApiException {
        DefaultApi defaultApi = new DefaultApi();
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://cybertaxonomy.eu/eu-bon/utis/");
        defaultApi.setApiClient(apiClient);
        List<ServiceProviderInfo> capabilities = defaultApi.capabilities();
        Assert.assertTrue(capabilities.size() > 0);
    }
}
