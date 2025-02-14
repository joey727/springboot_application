<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Page</title>
</head>
<body>
    <h1>Product Page</h1>
    <div>
        <form action="addProduct">
            <label>Product ID<input type="text" name="productID"/></label>
            <label>Product Name<input type="text" name="productName"/></label>
            <label>Price<input type="text" name="price"/></label>
            <input type="submit" value="Add Product"/>
        </form>
    </div>
</body>
</html>