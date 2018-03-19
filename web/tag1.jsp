<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/16
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- 遍历标签 iterator -->
<!-- ------------------------------------- -->
<s:iterator value="#list">
    <s:property/><br/>
</s:iterator>
<!-- ------------------------------------- -->
<s:iterator value="#list" var="name">
    <s:property value="#name"/><br/>
</s:iterator>
<!-- ------------------------------------- -->
<s:iterator begin="1" end="100" step="1">
    <s:property />|
</s:iterator>

<!-- ------------------if else elseif------------------- --><hr>

<s:if test="#list.size()==4">
    list长度为4!
</s:if>
<s:elseif test="#list.size()==3">
    list长度为3!
</s:elseif>
<s:else>
    list不3不4!
</s:else>

<!-- ------------------property 配合ognl表达式页面取值 ------------------- --><hr>

<s:property value="#list.size()" />
<s:property value="#session.user.name" />

</body>
</html>
