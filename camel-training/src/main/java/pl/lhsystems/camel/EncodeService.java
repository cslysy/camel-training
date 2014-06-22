/*
 * $Id$
 *
 * Copyright (C) 2005-2014 Lufthansa Systems AG.  All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Lufthansa Systems AG.
 */

package pl.lhsystems.camel;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.camel.Body;

/**
 * @author  Lufthansa Systems AG
 * @author $Author$
 * @version $Revision$
 *
 */
public class EncodeService {
    
    public String encode(@Body String qoogleRequestRaw) throws UnsupportedEncodingException{
        String encodedRequest = URLEncoder.encode(qoogleRequestRaw, "UTF-8");
        return encodedRequest;
    }
}
