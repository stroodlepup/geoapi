/*
 *    GeoAPI - Java interfaces for OGC/ISO standards
 *    http://www.geoapi.org
 *
 *    Copyright (C) 2006-2017 Open Geospatial Consortium, Inc.
 *    All Rights Reserved. http://www.opengeospatial.org/ogc/legal
 *
 *    Permission to use, copy, and modify this software and its documentation, with
 *    or without modification, for any purpose and without fee or royalty is hereby
 *    granted, provided that you include the following on ALL copies of the software
 *    and documentation or portions thereof, including modifications, that you make:
 *
 *    1. The full text of this NOTICE in a location viewable to users of the
 *       redistributed or derivative work.
 *    2. Notice of any changes or modifications to the OGC files, including the
 *       date changes were made.
 *
 *    THIS SOFTWARE AND DOCUMENTATION IS PROVIDED "AS IS," AND COPYRIGHT HOLDERS MAKE
 *    NO REPRESENTATIONS OR WARRANTIES, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 *    TO, WARRANTIES OF MERCHANTABILITY OR FITNESS FOR ANY PARTICULAR PURPOSE OR THAT
 *    THE USE OF THE SOFTWARE OR DOCUMENTATION WILL NOT INFRINGE ANY THIRD PARTY
 *    PATENTS, COPYRIGHTS, TRADEMARKS OR OTHER RIGHTS.
 *
 *    COPYRIGHT HOLDERS WILL NOT BE LIABLE FOR ANY DIRECT, INDIRECT, SPECIAL OR
 *    CONSEQUENTIAL DAMAGES ARISING OUT OF ANY USE OF THE SOFTWARE OR DOCUMENTATION.
 *
 *    The name and trademarks of copyright holders may NOT be used in advertising or
 *    publicity pertaining to the software without specific, written prior permission.
 *    Title to copyright in this software and any associated documentation will at all
 *    times remain with copyright holders.
 */
package org.opengis.temporal;

import org.opengis.annotation.UML;

import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;

/**
 * Provides operations for calculating temporal length and distance.
 *
 * @author Stephane Fellah (Image Matters)
 * @author Alexander Petkov
 */
@UML(identifier="TM_Separation", specification=ISO_19108)
public interface Separation {
    /**
     * Returns the distance from this {@linkplain TemporalGeometricPrimitive temporal geometric
     * primitive} to another {@linkplain TemporalGeometricPrimitive temporal geometric primitive}.
     * This is the absolute value of the difference b/n their temporal positions.
     * 
     * @return the distance from this {@linkplain TemporalGeometricPrimitive temporal geometric
     * primitive} to another {@linkplain TemporalGeometricPrimitive temporal geometric primitive}.
     */
    @UML(identifier="distance", obligation=MANDATORY, specification=ISO_19108)
    Duration distance(TemporalGeometricPrimitive other);

    /**
     * Returns the duration of this {@linkplain TemporalGeometricPrimitive temporal geometric
     * primitive}.
     * 
     * @return duration of this {@linkplain TemporalGeometricPrimitive temporal geometric
     * primitive}.
     */
    @UML(identifier="length", obligation=MANDATORY, specification=ISO_19108)
    Duration length();
}
