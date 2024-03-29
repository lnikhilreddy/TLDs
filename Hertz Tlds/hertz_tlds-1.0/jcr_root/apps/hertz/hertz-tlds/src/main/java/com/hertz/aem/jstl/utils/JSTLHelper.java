package com.hertz.aem.jstl.utils;

import javax.jcr.Node;
import javax.jcr.Property;
import javax.jcr.Value;
import javax.jcr.RepositoryException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;

/**
 * Static helper functions, mostly designed at simplifying JSTL EL expressions.
 * These are all referenced in the jstlHelper.tld tag lib descriptor. This helps
 * avoid the common exception cases where null defaults are acceptable.
 * Repository exceptions will still be thrown if fatal errors occur.
 *
 * @author brobert
 */
public class JSTLHelper {

    /**
     * Slightly more convenient than the sling resource resolver function since
     * you don't have to turn around and adapt the result to a node
     *
     * @param resourceResolver
     * @param childName
     * @return
     */
    public static Node getNodeByPath(ResourceResolver resourceResolver, String childName) {
        Resource result = resourceResolver.getResource(childName);
        if (result == null) {
            return null;
        }
        return result.adaptTo(Node.class);
    }

    public static boolean hasNode(Node node, String childName) throws RepositoryException {
        if (node != null) {
            return node.hasNode(childName);
        }
        return false;
    }

    public static Node getNode(Node node, String childName) throws RepositoryException {
        if (node != null && node.hasNode(childName)) {
            return node.getNode(childName);
        }
        return null;
    }

    public static String getPropertyString(Node node, String propertyName) throws RepositoryException {
        if (node == null || !node.hasProperty(propertyName)) {
            return null;
        }
        Property p = node.getProperty(propertyName);
        return p.getString();
    }

    public static Value[] getPropertyStringArray(Node node, String propertyName) throws RepositoryException {
        if (node == null || !node.hasProperty(propertyName)) {
            return null;
        }
        Property p = node.getProperty(propertyName);
        return p.getValues();
    }

    public static int generateId() {
        return (int) Math.round(Math.random() * Integer.MAX_VALUE);
    }
}
