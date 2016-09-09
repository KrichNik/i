/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.igov.service.business.place;

import java.util.HashMap;
import java.util.Map;
import org.igov.io.GeneralConfig;
import org.igov.io.web.HttpRequester;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HS
 */
@Service
public class PlaceServiceImpl implements PlaceService {

    private static final Logger LOG = LoggerFactory.getLogger(PlaceServiceImpl.class);
    private final String URI_GET_PLACE_BY_PROCESS = "/wf/service/action/event/getPlaceByProcess";
    @Autowired
    private HttpRequester httpRequester;
    @Autowired
    private GeneralConfig generalConfig;

    @Override
    public String getPlaceByProcess(String nID_Process)
            throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("nID_Process", nID_Process);
        return doRemoteRequest(URI_GET_PLACE_BY_PROCESS, params);
    }

    private String doRemoteRequest(String sURL, Map<String, String> mParam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
