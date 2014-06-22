/*
 * $Id$
 *
 * Copyright (C) 2005-2014 Lufthansa Systems AG.  All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Lufthansa Systems AG.
 */

package pl.lhsystems.camel;

import java.net.URL;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * @author  Lufthansa Systems AG
 * @author $Author$
 * @version $Revision$
 *
 */
public class UrlProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        String stringUrl = exchange.getIn().getBody(String.class);
        URL url = new URL(stringUrl);
        String host = url.getHost();//example.com
        int lastDot = host.lastIndexOf(".");
        String domain = host.substring(lastDot);
        exchange.setProperty("domain", domain);
    }
}
