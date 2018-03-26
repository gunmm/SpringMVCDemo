<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
</head>


<body>
	<input id="username" type="text" />
	<input type="button" id="subBtn" value="提交" />
	<hr>
	<input id="userId" type="text" />
	<input id="userName" type="text" />
	<input id="uid" type="text" />
	<input type="button" id="subBtn2" value="提交" />
</body>

<script type="text/javascript">
	$("#subBtn").click(function() {
		console.log(111);
		var username = $("#username").val();
		if (!username || username.length == 0) {
			alert("请输入用户名");
		} else {
			$.post("user/ajaxUser.do", {
				"username" : username
			}, function(data) {
				console.log(data);
				//console.log(JSON.stringify(data.result));
			});
		}
	});

	$("#subBtn2").click(function() {
		console.log(222);
		var userId = $("#userId").val();
		var userName = $("#userName").val();
		var uid = $("#uid").val();

		$.post("zhaobiao/addZhaoBiao", {
			"userId" : userId,
			"userName" : userName,
			"uid" : uid
		}, function(data) {
			console.log(data);
			//console.log(JSON.stringify(data.result));
		},"json");

	});
</script>
</html>