/*
 * Copyright 2000-2016 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.shared.ui.dnd;

import java.util.List;
import java.util.Map;

import com.vaadin.shared.communication.ServerRpc;

/**
 * RPC for firing server side drop event when client side drop event happens on
 * drop target.
 *
 * @author Vaadin Ltd
 * @since 8.1
 */
public interface DropTargetRpc extends ServerRpc {

    /**
     * Called when drop event happens on client side.
     *
     * @param types
     *         Data types that are present in {@code data} map in the same order
     *         as found in {@code DataTransfer.types}.
     * @param data
     *         Contains data from {@code DataTransfer} object.
     * @param dropEffect
     *         Drop effect set for the drop target where drop happened.
     * @param dragSourceId
     *         Drag source component connector's ID.
     */
    public void drop(List<String> types, Map<String, String> data,
            DropEffect dropEffect, String dragSourceId);
}
