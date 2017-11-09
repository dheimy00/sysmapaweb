<%@tag language="java"  pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ attribute name="head" fragment="true"  %>
<%@ attribute name="header" fragment="true"  %>
<%@ attribute name="corpo_id" fragment="true" %>
<%@attribute name="title"%>
<!DOCTYPE html> 
<html>
    <head>   
        <title>${title}</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
          <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/resources/css/bootstrap/bootstrap-select.min.css">

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/resources/css/bootstrap/bootstrap.css">

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/resources/css/bootstrap/bootstrapValidator.css"/>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/resources/css/bootstrap/bootstrap.min.css">

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/resources/css/bootstrap/bootstrap-theme.min.css">
       
        <link rel="stylesheet" href="${pageContext.request.contextPath}/views/resources/css/jquery.dataTables.min.css">
                 
        <script src="${pageContext.request.contextPath}/views/resources/resources/js/jquery-1.11.1.js" ></script>

        <script src="${pageContext.request.contextPath}/views/resources/js/jquery-2.1.4.min.js" ></script>
        
        <script src="${pageContext.request.contextPath}/views/resources/js/bootstrap/bootstrap-select.min.js" ></script>

        <script src="${pageContext.request.contextPath}/views/resources/js/bootstrap/bootstrap.min.js" ></script>

        <script src="${pageContext.request.contextPath}/views/resources/js/bootstrap/bootstrapValidator.js"></script>
        
         <script src="${pageContext.request.contextPath}/views/resources/js/bootstrap/bootstrapValidator.min.js"></script>

        <script type="text/javascript" src="${pageContext.request.contextPath}/views/resources/js/jquery.dataTables.min.js"></script>


        <jsp:invoke fragment="head"/>   

    </head> 
    <body>
        <jsp:invoke fragment="corpo_id"/>        
    </body>
</html>