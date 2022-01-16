<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Synonisms</title>
</head>
<body>
<h1><%= "Synonisms" %></h1>

<form action="/" method="post">

    <div class="grid grid-cols-2 gap-4 my-5 mx-8">

        <label for="userInput" class="text-xl flex items-center">User Input: <span class="text-gray-500 mx-1">$</span></label>
        <input type="text" id="userInput" name="userInput" value=" ${userInput}" class="w-full p-1 border-2 placeholder-blue-800 border-blue-700 appearance-none rounded-lg focus:outline-none focus:ring-2">

    </div>

    <button type="submit" class="bg-blue-300 text-xl font-semibold px-4 py-1 rounded-lg hover:bg-blue-800 hover:text-white">Synomize Me</button><br><br>

    <p class="text-3xl font-mono text-green-600">Result: ${returnString}</p>

</form>


</body>
</html>