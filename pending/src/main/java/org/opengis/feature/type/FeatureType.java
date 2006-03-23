package org.opengis.feature.type;


/**
 * Describes a Feature, this is a step in the chain towards FeatureCollectionType.
 * <p>
 * This class provides no additional modeling power beyond ComplexType, it does however
 * come with additional restrictions that may be described at the Java level.
 * </p>
 * @author Jody Garnett
 *
 */
public interface FeatureType extends ComplexType {
	
	/** I am under the impression this should return Boolean.FALSE? */
	Boolean isNillable();
	
	/** Must always return true */
	boolean isIdentified();
	
	/**
	 * Indicates which AttributeType is to be considered the default
	 * geometry.
	 * @return AttributeType used to locate the default Geometry
	 */
	GeometryType getDefaultGeometry();
	
	/**
	 * Super may be a normal ComplexType.
	 */
///	ComplexType getSuper();
}