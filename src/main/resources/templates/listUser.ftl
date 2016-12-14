<html>
<head>
    <meta http-equiv="content-type" content="text/html">
    <title>Show all users</title>
</head>
<body>
<div>
    <table border="1" align="center" style="width: 50%">
        <thead>
            <tr>
                <th>User id</th>
                <th>name</th>
                <th>surname</th>
                <#--<th colspan="2">Action</th>-->
            </tr>
        </thead>
        <tbody>
            <#list users as user>
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.surname}</td>
                    <#--<td><a href=""</td>-->
                </tr>
            </#list>
        </tbody>
    </table>
</div>
</body>
</html>