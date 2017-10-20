/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.registry.client;

import java.io.Closeable;

/**
 * A client for interacting with the REST API of a NiFi registry instance.
 */
public interface NiFiRegistryClient extends Closeable {

    /**
     * @return the client for interacting with buckets
     */
    BucketClient getBucketClient();

    /**
     * @return the client for interacting with flows
     */
    FlowClient getFlowClient();

    /**
     * @return the client for interacting with flows/snapshots
     */
    FlowSnapshotClient getFlowSnapshotClient();

    /**
     * @return the client for interacting with bucket items
     */
    ItemsClient getItemsClient();

    /**
     * The builder interface that implementations should provide for obtaining the client.
     */
    interface Builder {

        Builder config(NiFiRegistryClientConfig clientConfig);

        NiFiRegistryClientConfig getConfig();

        NiFiRegistryClient build();

    }

}