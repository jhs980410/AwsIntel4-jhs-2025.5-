<%@ page language="java" contentType="text/html; charset=UTF-8
	"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POSITION</title>
<style type="text/css">
body, div, p {
	margin: 0;
	padding: 0;
}

body {
	margin: 20px;
	background: url("img/bg_grid.gif");
}

.box {
	position: relative;
	width: 650px;
	background: rgba(0, 0, 0, 0.3);
}

p {
	width: 250px;
	height: 100px;
	box-sizing: border-box;
	padding: 10px;
	font-weight: bold;
}

.red {
	background: crimson;
}

.green {
	background: lime;
	position: absolute;
	left: 100px;
	top: 50px;
	z-index: 1;
}

.blue {
	background: dodgerblue;
	position: relative;
	left: 100px;
	top: 60px;
}
</style>
</head>
<body>
	<div class="box">
		<p class="red">박스의 크기와 위치를 잘 살펴보아야 합니다.</p>
		<p class="green">박스의 포지션 속성을 바꿔가며 테스트해 보아야 합니다.</p>
		<p class="blue">포지션을 이해하기 위해서는 시험해보고 관찰해 보는 것이 절대적으로 필요합니다.</p>
	</div>
</body>
</html>