<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Employee Form</title>
<style type="text/css">@import url("<c:url value='/css/main.css'/>");</style>
</head>
<body>
	<div id="global">
		<form:form commandName="employee" action="employee_save" method="post">
			<fieldset>
				<legend>Add a Employee</legend>
				<p>
					<label for="firstName">First Name: </label>
					<form:input path="firstName" id="firstName" tabindex="1"/>
				</p>
				<p>
					<label for="lastName">Last Name: </label>
					<form:input path="lastName" id="lastName" tabindex="2"/>
				</p>
				<p>
					<form:errors path="birthDate" cssClass="error"/>
				</p>
				<p>
					<label for="birthDate">Date of Birth: </label>
					<form:input path="birthDate" id="birthDate" tabindex="3"/>
				</p>
				<p id="buttons">
					<input type="reset" id="reset" tabindex="4"/>
					<input type="submit" id="submit" tabindex="5" value="Add Employee"/>
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>