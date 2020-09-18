/*
    GriefPreventionPlus Server Plugin for Minecraft
    Copyright (C) 2015 Antonino Kai Pocorobba
    (forked from GriefPrevention by Ryan Hamshire)

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.kaikk.mc.gpp;

//lower value = higher permissions
public enum ClaimPermission {
	MANAGE(1),		// 0 0 0 0 1
	BUILD(2),		// 0 0 0 1 0
	CONTAINER(4),	// 0 0 1 0 0
	ACCESS(8),		// 0 1 0 0 0
	ENTRY(16);		// 1 0 0 0 0

	public final int perm; //bintaryForm

	ClaimPermission(int perm) {
		this.perm = perm;
	}
}
