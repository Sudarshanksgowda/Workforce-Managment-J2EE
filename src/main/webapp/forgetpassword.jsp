<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>

<body class="bg-gray-100 min-h-screen flex items-center justify-center p-4">

    <div class="bg-white rounded-lg shadow-md w-full max-w-md p-6">
       
        <h2 class="text-2xl font-bold text-gray-800 text-center mb-6">Forgot Password</h2>
        <%String error=(String)request.getAttribute("error");%>
        <%if(error!=null){%>
        	<h6 style="color:red;"><%=error%></h6>
        <%}%>
        
        <form action="forgotPassword" method="POST">
            
            <div class="mb-4">
                <label class="block text-gray-700 font-medium mb-2">Mail Id</label>
                <input type="email" name="mail" required
                       class="w-full px-3 py-2 border border-gray-300 rounded-md focus:outline-none focus:border-blue-500">
            </div>
            
            <div class="mb-4">
                <label class="block text-gray-700 font-medium mb-2">Set a new Password</label>
                <input type="password" name="pass" required
                       class="w-full px-3 py-2 border border-gray-300 rounded-md focus:outline-none focus:border-blue-500">
            </div>
            
             <div class="mb-4">
                <label class="block text-gray-700 font-medium mb-2">Confirm the Password</label>
                <input type="password" name="confirm" required
                       class="w-full px-3 py-2 border border-gray-300 rounded-md focus:outline-none focus:border-blue-500">
            </div>

            <div class="flex gap-3">
                <button type="submit"
                        class="flex-1 bg-orange-600 text-white py-2 rounded-md hover:bg-blue-700 transition">
                    Update Password
                </button>
                <a href="login.jsp" class="text-orange-500 underline hover:text-orange-700">
	Back
</a>
            </div>
        </form>
    </div>

</body>
</html>