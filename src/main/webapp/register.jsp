
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>

    <title>Register</title>
</head>

<body class="bg-gradient-to-br from-slate-900 via-black to-slate-800 min-h-screen flex items-center justify-center p-4">

    <div class="bg-white/10 backdrop-blur-lg border border-white/20 shadow-2xl rounded-3xl p-8 w-full max-w-2xl">

        <h1 class="text-4xl font-bold text-center text-yellow-400 mb-2">
            Register
        </h1>

        <p class="text-center text-gray-300 mb-8">
            Create your account
        </p>
        <% String sucessMessages=(String)request.getAttribute("sucess");%>
        <%if(sucessMessages !=null){ %>
        <h1 class="text-4xl font-bold text-center text-yellow-400 mb-2"> <%=sucessMessages%> </h1>
        <%}%>

        <form action="registerpage" method="post">
        

            <table class="w-full border-separate border-spacing-y-4">

                <tr>
                    <td class="text-yellow-300 pr-4">Full Name</td>
                    <td>
                        <input 
                            type="text"
                            name="name"
                            placeholder="Enter your name"
                            class="w-full px-4 py-3 rounded-xl bg-black/30 text-white border border-gray-600 focus:outline-none focus:ring-2 focus:ring-yellow-400"
                        >
                    </td>
                </tr>

                <tr>
                    <td class="text-yellow-300 pr-4">Job Role</td>
                    <td>
                        <select 
                            name="job"
                            class="w-full px-4 py-3 rounded-xl bg-black/30 text-white border border-gray-600 focus:outline-none focus:ring-2 focus:ring-yellow-400"
                        >
                            <option value="Developer">Developer</option>
                            <option value="HR">HR</option>
                            <option value="Manager">Manager</option>
                            <option value="Tester">Tester</option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td class="text-yellow-300 pr-4">Salary</td>
                    <td>
                        <input 
                            type="number"
                            name="salary"
                            placeholder="Enter salary"
                            class="w-full px-4 py-3 rounded-xl bg-black/30 text-white border border-gray-600 focus:outline-none focus:ring-2 focus:ring-yellow-400"
                        >
                    </td>
                </tr>

                <tr>
                    <td class="text-yellow-300 pr-4">Department</td>
                    <td>
                        <select 
                            name="Department"
                            class="w-full px-4 py-3 rounded-xl bg-black/30 text-white border border-gray-600 focus:outline-none focus:ring-2 focus:ring-yellow-400"
                        >
                            <option value="10">HR</option>
                            <option value="20">Sales</option>
                            <option value="30">IT</option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td class="text-yellow-300 pr-4">Email</td>
                    <td>
                        <input 
                            type="email"
                            name="mail"
                            placeholder="Enter email"
                            class="w-full px-4 py-3 rounded-xl bg-black/30 text-white border border-gray-600 focus:outline-none focus:ring-2 focus:ring-yellow-400"
                        >
                    </td>
                </tr>

                <tr>
                    <td class="text-yellow-300 pr-4">Password</td>
                    <td>
                        <input 
                            type="password"
                            name="pass"
                            placeholder="Enter password"
                            class="w-full px-4 py-3 rounded-xl bg-black/30 text-white border border-gray-600 focus:outline-none focus:ring-2 focus:ring-yellow-400"
                        >
                    </td>
                </tr>


                <tr>
                    <td colspan="2" class="pt-4">
                        <button 
                            type="submit"
                            class="w-full bg-yellow-400 hover:bg-yellow-300 text-black font-bold py-3 rounded-xl transition duration-300 shadow-lg hover:scale-105"
                        >
                            Register
                        </button>
                    </td>
                </tr>

            </table>

        </form>
    </div>

</body>
</html>