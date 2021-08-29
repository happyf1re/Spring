<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<body>
<form:form action="form" modelAttribute="product">
    ID: <form:input path="id" />
    <br>
    Title: <form:input path="title" />
    <br>
    Cost: <form:input path="cost" />
    <input type="submit" value="Save" />
</form:form>
<form:form action="showall" modelAttribute="product">
    <input type="submit" value="showall" />
</form:form>
</body>
</html>
