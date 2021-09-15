<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<body>
<h1>All products in Bucket</h1>
<br>
<table aria-describedby="mydesc">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
    </tr>
    <tr th:each="product : ${productservice.bucket}">
        <td th:text="${product.id}"/>
        <td th:text="${product.name}"/>
        <td th:text="${product.price}"/>
    </tr>
</table>
</body>
</html>