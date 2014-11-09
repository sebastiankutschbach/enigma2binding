/**
 * Copyright (c) 2010-2014, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.enigma2;

import org.openhab.binding.enigma2.internal.Enigma2BindingConfig;
import org.openhab.core.binding.BindingProvider;
import org.openhab.core.items.Item;

/**
 * @author Sebastian Kutschbach
 * @since 1.6.0
 */
public interface Enigma2BindingProvider extends BindingProvider {

	public Enigma2BindingConfig getBindingConfigFor(String itemName);

	public Class<? extends Item> getItemType(String name);

}
