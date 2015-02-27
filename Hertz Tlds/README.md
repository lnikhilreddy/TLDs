Sample JSTL TLD Functions
==============

Path
--------------

/apps/hertz/hertz-tlds

Description
--------------

This is a sample tld package which contains the JSTL functions that can be used globally accross the website. 

Below are the function signatures included in this package.

 <function>
        <name>generateId</name>
        <function-class>com.hertz.aem.jstl.utils.JSTLHelper</function-class>
        <function-signature>int generateId()</function-signature>
    </function>
    <function>
        <name>hasNode</name>
        <function-class>com.hertz.aem.jstl.utils.JSTLHelper</function-class>
        <function-signature>boolean hasNode(javax.jcr.Node, java.lang.String)</function-signature>
    </function>
    <function>
        <name>getNode</name>
        <function-class>com.hertz.aem.jstl.utils.JSTLHelper</function-class>
        <function-signature>javax.jcr.Node getNode(javax.jcr.Node, java.lang.String)</function-signature>
    </function>
    <function>
        <name>getNodeByPath</name>
        <function-class>com.hertz.aem.jstl.utils.JSTLHelper</function-class>
        <function-signature>javax.jcr.Node getNodeByPath(org.apache.sling.api.resource.ResourceResolver, java.lang.String)</function-signature>
    </function>
    <function>
        <name>getPropertyString</name>
        <function-class>com.hertz.aem.jstl.utils.JSTLHelper</function-class>
        <function-signature>java.lang.String getPropertyString(javax.jcr.Node, java.lang.String)</function-signature>
    </function>
	 <function>
        <name>getPropertyStringArray</name>
        <function-class>com.hertz.aem.jstl.utils.JSTLHelper</function-class>
        <function-signature>java.lang.String getPropertyStringArray(javax.jcr.Node, java.lang.String)</function-signature>
    </function>    