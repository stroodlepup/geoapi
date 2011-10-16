/*
 *    GeoAPI - Java interfaces for OGC/ISO standards
 *    http://www.geoapi.org
 *
 *    Copyright (C) 2009-2011 Open Geospatial Consortium, Inc.
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
package org.opengis.tools.taglet;

import java.util.Map;
import com.sun.javadoc.Tag;
import com.sun.tools.doclets.Taglet;
import com.sun.tools.doclets.formats.html.ConfigurationImpl;


/**
 * The <code>@svnurl</code> tag for inserting a SVN URL in a javadoc comment. This tag shall
 * contains a keyword, for example <code>{@svnurl gigs}</code>.
 * Valid keywords are:
 * <p>
 * <table>
 *   <tr><th>Keyword</th> <th>path</th></tr>
 *   <tr><td>gigs</td> <td>geoapi-conformance/src/main/resources/org/opengis/test/referencing/gigs</td></tr>
 * </table>
 * <p>
 * The URL never contain trailing <code>'/'</code> character.
 *
 * @author  Martin Desruisseaux (Geomatys)
 * @version 3.1
 * @since   3.1
 */
public final class SvnUrl implements Taglet {
    /**
     * Register this taglet.
     *
     * @param tagletMap the map to register this tag to.
     */
    public static void register(final Map<String,Taglet> tagletMap) {
       final SvnUrl tag = new SvnUrl();
       tagletMap.put(tag.getName(), tag);
    }

    /**
     * Constructs a default <code>@svnurl</code> taglet.
     */
    private SvnUrl() {
        super();
    }

    /**
     * Returns the name of this custom tag.
     *
     * @return The tag name.
     */
    @Override
    public String getName() {
        return "svnurl";
    }

    /**
     * Returns {@code true} since <code>@svnurl</code> can be used in overview.
     *
     * @return Always {@code false}.
     */
    @Override
    public boolean inOverview() {
        return true;
    }

    /**
     * Returns {@code true} since <code>@svnurl</code> can be used in package documentation.
     *
     * @return Always {@code true}.
     */
    @Override
    public boolean inPackage() {
        return true;
    }

    /**
     * Returns {@code true} since <code>@svnurl</code> can be used in type documentation
     * (classes or interfaces).
     *
     * @return Always {@code true}.
     */
    @Override
    public boolean inType() {
        return true;
    }

    /**
     * Returns {@code true} since <code>@svnurl</code> can be used in constructor
     *
     * @return Always {@code true}.
     */
    @Override
    public boolean inConstructor() {
        return true;
    }

    /**
     * Returns {@code true} since <code>@svnurl</code> can be used in method documentation.
     *
     * @return Always {@code true}.
     */
    @Override
    public boolean inMethod() {
        return true;
    }

    /**
     * Returns {@code true} since <code>@svnurl</code> can be used in field documentation.
     *
     * @return Always {@code true}.
     */
    @Override
    public boolean inField() {
        return true;
    }

    /**
     * Returns {@code true} since <code>@svnurl</code> is an inline tag.
     *
     * @return Always {@code true}.
     */
    @Override
    public boolean isInlineTag() {
        return true;
    }

    /**
     * Given the <code>Tag</code> representation of this custom tag, return its string representation.
     *
     * @param tag The tag to format.
     * @return A string representation of the given tag.
     */
    @Override
    public String toString(final Tag tag) {
        String url = "https://geoapi.svn.sourceforge.net/svnroot/geoapi/trunk";
        final String keyword = tag.text();
        if (keyword.equals("gigs")) {
            url += "/geoapi-conformance/src/main/resources/org/opengis/test/referencing/gigs";
        } else {
            ConfigurationImpl.getInstance().root.printWarning(tag.position(), "Unknown keyword: " + keyword);
        }
        return url;
    }

    /**
     * Given an array of {@code Tag}s representing this custom tag, return its string
     * representation. This method should not be called since arrays of inline tags do
     * not exist. However we define it as a matter of principle.
     *
     * @param tags The tags to format.
     * @return A string representation of the given tags.
     */
    @Override
    public String toString(final Tag[] tags) {
        final StringBuilder buffer = new StringBuilder();
        for (int i=0; i<tags.length; i++) {
            buffer.append(toString(tags[i]));
        }
        return buffer.toString();
    }
}