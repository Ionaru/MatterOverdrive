/*
 * This file is part of Matter Overdrive
 * Copyright (c) 2015., Simeon Radivoev, All rights reserved.
 *
 * Matter Overdrive is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Matter Overdrive is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Matter Overdrive.  If not, see <http://www.gnu.org/licenses>.
 */

package matteroverdrive.entity.android_player;

import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;

/**
 * Created by Simeon on 9/8/2015.
 */
public class AndroidAttributes
{
    public static final IAttribute attributeGlitchTime = new RangedAttribute(null,"android.glitchTime",1,0,1).setDescription("Glitch Time Percent");
    public static final IAttribute attributeBatteryUse = new RangedAttribute(null,"android.batteryUse",1,0,Double.MAX_VALUE).setDescription("Battery Use Percent");
}