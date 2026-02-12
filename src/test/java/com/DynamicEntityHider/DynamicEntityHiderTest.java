package com.DynamicEntityHider;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class DynamicEntityHiderTest
{
    public static void main(String[] args) throws Exception
    {
        ExternalPluginManager.loadBuiltin(new Class[] {DynamicEntityHiderPlugin.class});
        RuneLite.main(args);
    }
}