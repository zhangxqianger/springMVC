<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/11/8
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>async</title>
</head>
<script type="text/javascript" src="jquery-3.1.1.js"></script>

<body>
<div>

</div>
</body>
<script type="text/javascript">
    function deferred() {
        $.ajax("/defer", {
            success: function (data) {
                $("div").appendData(data);
            },
            error: function () {
                alert("error");
            }
        });
        setTimeout(deferred, 3000);
    }
    deferred();
</script>
</html>
