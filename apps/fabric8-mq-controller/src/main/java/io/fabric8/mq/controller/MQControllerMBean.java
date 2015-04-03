/*
 *
 *  * Copyright 2005-2015 Red Hat, Inc.
 *  * Red Hat licenses this file to you under the Apache License, version
 *  * 2.0 (the "License"); you may not use this file except in compliance
 *  * with the License.  You may obtain a copy of the License at
 *  *    http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  * implied.  See the License for the specific language governing
 *  * permissions and limitations under the License.
 *
 */
package io.fabric8.mq.controller;

/**
 * This interface defines the attributes/operations that are exposed
 * for JMX management by the detecting gateway.
 */
public interface MQControllerMBean {

    long getReceivedConnectionAttempts();

    long getSuccessfulConnectionAttempts();

    long getFailedConnectionAttempts();

    String[] getConnectingClients();

    String[] getConnectedClients();

    long getConnectionTimeout();

    void setConnectionTimeout(long connectionTimeout);

    String getCamelRoutes();

    void setCamelRoutes(String camelRoutes);

    int getNumberOfServers();
}
