<%--@elvariable id="user" type="com.yourname.User"--%>
<!DOCTYPE html>
<html>
    <head>
        <title>${fullName} User Profile</title>
        <style type="text/css">
            .bold {font-weight: bold;}
            .italic {font-style: italic;}
        </style>
    </head>
    <body>
        <p>Letter: ${vowels[1]}</p>
        <h2>User info: ${fullName}</h2>
        <ul>
            <li><span class="bold">User ID:</span> ${user.userId}</li>
            <li><span class="bold">Username:</span> ${user.username} (${user.username.length()} characters)</li>
            <li><span class="bold">Full Name:</span> ${user["lastName"]}, ${user["firstName"]}</li>
            <li><span class="bold">Permissions (${fn:length(user.permissions)})</span>
                <ul>
                    <li><span class="italic">Active User:</span> ${user.permissions.active}</li>
                    <li><span class="italic">Editor</span> ${user.permissions["editor"]}</li>
                    <li><span class="italic">Administrator:</span> ${user["permissions"].admin}</li>
                    <li><span class="italic">Super Admin:</span> ${user["permissions"]["admin"]}</li>
                </ul>
            </li>
        </ul>
        <h2>Array info</h2>
        <p>The first user is ${usersArr[0]}<br> The userid is ${usersArr[0].userId}</p>
        <p>The first user is ${usersArr["0"]}<br> The userid is ${usersArr["0"]["userId"]}</p>

        <h2>ArrayList info</h2>
        <p>The first user is ${usersList[0]}<br> The userid is ${usersList[0].userId}</p>
        <p>The first user is ${usersList["0"]}<br> The userid is ${usersList["0"]["userId"]}</p>
        
        <h2>Parameter info</h2>
        <ul>
            <li><span class="bold">Action Parameter:</span> ${param.action}</li>
            <li><span class="bold">Color Multi-Parameter:</span> ${fn:join(paramValues["color"], ", ")}</li>
        </ul>
        <p>Copyright &copy; ${currentYear}, all rights reserved.</p>
    </body>
</html>