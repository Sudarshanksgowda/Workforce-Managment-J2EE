<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>

    <title>Login</title>
</head>

<body class="min-h-screen flex items-center justify-center bg-gradient-to-br from-black via-slate-900 to-gray-800 p-4">
     		
	    		
	   
	    	
    <div class="w-full max-w-md bg-white/10 backdrop-blur-lg border border-white/20 rounded-3xl shadow-2xl p-8">
  
        <!-- Heading -->
        <h1 class="text-4xl font-bold text-center text-yellow-400 mb-2">
            Welcome Back
        </h1>
        
        <%String sucessMessage=(String)request.getAttribute("sucesslogin"); %>
        <%if(sucessMessage!=null){ %>
        <h1 class="text-4xl font-bold text-center text-green-400 mb-2"> <%=sucessMessage %></h1>
        <%}%>
        
        <%String message=(String)request.getAttribute("sucess"); %>
        <%if(message!=null){ %>
        <h1 class="text-4xl font-bold text-center text-green-400 mb-2"> <%=message %></h1>
        <%}%>
        
        <%String errormessage=(String)request.getAttribute("error"); %>
        <%if(errormessage!=null){ %>
        <h1 class="text-4xl font-bold text-center text-green-400 mb-2"> <%=errormessage %></h1>
        <%}%>

        <p class="text-center text-gray-300 mb-8">
            Login to continue
        </p>

        <!-- Form -->
        <form action="login" method="post" class="space-y-5">

            <!-- Email -->
            <div>
                <label class="block text-yellow-300 mb-2">
                    Email Address
                </label>

                <input 
                    type="email"
                    name="mail"
                    placeholder="Enter your email"
                    class="w-full px-4 py-3 rounded-xl bg-black/30 text-white border border-gray-600 focus:outline-none focus:ring-2 focus:ring-yellow-400"
                >
            </div>

            <!-- Password -->
            <div>
                <label class="block text-yellow-300 mb-2">
                    Password
                </label>

                <input 
                    type="password"
                    name="pass"
                    placeholder="Enter your password"
                    class="w-full px-4 py-3 rounded-xl bg-black/30 text-white border border-gray-600 focus:outline-none focus:ring-2 focus:ring-yellow-400"
                >
            </div>

            <!-- Login Button -->
            <button 
                type="submit"
                class="w-full bg-yellow-400 hover:bg-yellow-300 text-black font-bold py-3 rounded-xl transition duration-300 hover:scale-105 shadow-lg"
            >
                Login
            </button>

            <!-- Forgot Password -->
             <a href="forgetpassword.jsp" class="text-yellow-400 hover:text-yellow-300 font-semibold">
            <button 
                type="button"
                class="w-full border border-yellow-400 text-yellow-400 hover:bg-yellow-400 hover:text-black font-bold py-3 rounded-xl transition duration-300"
            >
        
                Forgot Password
            </button></a>

        </form>

        <!-- Register Link -->
        <p class="text-center text-gray-300 mt-6">
            Don’t have an account?
            <a href="register.jsp" class="text-yellow-400 hover:text-yellow-300 font-semibold">
                Register here
            </a>
            
        </p>

    </div>

</body>
</html>