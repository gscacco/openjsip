/*
 *
 *  * This file is part of OpenJSIP project.
 *  *
 *  * OpenJSIP is free software; you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation; either version 2 of the License, or
 *  * (at your option) any later version
 *  * OpenJSIP is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with this program; if not, write to the Free Software
 *  * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *  *
 *  * Copyright (c) 2013 - Ievgen Krapyva
 *
 */

package openjsip.locationservice


class LocationServiceKey(private val key: String) {

  override def equals(other: Any): Boolean = {
    other match {
      case that: LocationServiceKey => this.key == that.key
      case _ => false
    }
  }

  override def hashCode(): Int = key.hashCode

  override def toString: String = key
}