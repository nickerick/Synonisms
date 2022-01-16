<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Synonisms</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>

    <div>

        <img src="synlogo3.png" class="center resize">

    </div>

    <div class="divider">

        <form action="/" method="post">

            <div class="" id="searchbox">
                
                <input type="text" id="userInput" name="userInput" value=" ${userInput}" placeholder="Enter text here...">
                <button type="submit">Synomize Me</button>

            </div>

            <div class="divider">

                <p class="response">${returnString}</p>

            </div>

        </form>

    </div>

<script src="assets/js/bootstrap.bundle-5.0.0.alpha-min.js"></script></body>
</html>