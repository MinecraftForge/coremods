/*
 * Copyright (c) Forge Development LLC
 * SPDX-License-Identifier: LGPL-2.1-only
 */
module net.minecraftforge.coremod.api {
    // ASMAPI
    exports net.minecraftforge.coremod.api;

    requires cpw.mods.modlauncher;

    requires static org.jetbrains.annotations;
	requires org.objectweb.asm.util;

	// JavaScript specific helpers.
	requires static net.minecraftforge.coremod;
}
