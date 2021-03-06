/*
 * Copyright 2015 52°North Initiative for Geospatial Open Source Software GmbH.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.iceland.skeleton.handler.impl;

import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.n52.iceland.skeleton.handler.DemoHandler;
import org.n52.iceland.skeleton.request.DemoRequest;
import org.n52.iceland.skeleton.response.DemoResponse;

/**
 *
 * @author <a href="mailto:d.nuest@52north.org">Daniel Nüst</a>
 */
public class DemoHandlerImplTest {

    @Test
    public void testDemo() throws Exception {
        DemoHandler handler = new DemoHandlerImpl();
        DemoRequest request = new DemoRequest("testservice");
        request.setVersion("23");
        request.setOne("skcor htroN");
        request.setTwo(25);
        DemoResponse response = handler.demo(request);

        assertThat(response.getService(), is("testservice"));
        assertThat(response.getVersion(), is("23"));
        assertThat(response.getThree(), CoreMatchers.hasItems("52", "North rocks"));
    }

}
