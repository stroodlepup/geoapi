/*
 * Copyright (C) 2003 Open GIS Consortium, Inc. All Rights Reserved. http://www.opengis.org/Legal/
 */
package org.opengis.crs.crs;

// OpenGIS direct dependencies
import org.opengis.crs.cs.CoordinateSystem;
import org.opengis.crs.datum.EngineeringDatum;


/**
 * A contextually local coordinate reference system. It can be divided into two broad categories:
 * <ul>
 *   <li>earth-fixed systems applied to engineering activities on or near the surface of the
 *       earth;</li>
 *   <li>CRSs on moving platforms such as road vehicles, vessels, aircraft, or spacecraft.</li>
 * </ul>
 *
 * <TABLE CELLPADDING='6' BORDER='1'>
 * <TR BGCOLOR="#EEEEFF"><TH NOWRAP>Used with CS type(s)</TH></TR>
 * <TR><TD>
 *   {@link org.opengis.crs.cs.CartesianCS        Cartesian},
 *   {@link org.opengis.crs.cs.ObliqueCartesianCS ObliqueCartesian},
 *   {@link org.opengis.crs.cs.EllipsoidalCS      Ellipsoidal},
 *   {@link org.opengis.crs.cs.SphericalCS        Spherical},
 *   {@link org.opengis.crs.cs.CylindricalCS      Cylindrical},
 *   {@link org.opengis.crs.cs.PolarCS            Polar},
 *   {@link org.opengis.crs.cs.VerticalCS         Vertical},
 *   {@link org.opengis.crs.cs.LinearCS           Linear}
 * </TD></TR></TABLE>
 *
 * @UML abstract SC_EngineeringCRS
 * @author ISO 19111
 * @author <A HREF="http://www.opengis.org">OpenGIS&reg; consortium</A>
 * @version 2.0
 */
public interface EngineeringCRS extends CoordinateReferenceSystem {
    /**
     * Returns the datum, which must be an engineering one.
     *
     * @return The datum.
     * @UML association usesDatum
     */
    public EngineeringDatum getDatum();
}
