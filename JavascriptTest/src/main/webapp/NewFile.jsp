<%@ page language="java" contentType="text/html; charset=UTF-8
	"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title</title>

<style type="text/css">
</style>

</head>

<body>
	<div id='parentDiv'>
		<h1 id = 'qwwa'>DOM</h1>
		<p id='childContent'>문서의 각 요소(객체)들을 구조화한 것입니다.</p>
	</div>

</body>

<script type="text/javascript">
	var parentDivObj = document.getElementById('parentDiv');
	parentDivObj.style.border = '5px solid black';
	parentDivObj.style.borderTop ='5px solid red';
	parentDivObj.style.borderBottom ='5px solid blue';
	parentDivObj.style.borderLeft ='5px solid green';
	parentDivObj.style.borderRight ='5px solid black';
	
//	var childH1 = document.getElementsByTagName('h1');

	var childH1 = document.getElementById('qwwa');
	childH1.style.backgroundColor = 'green';
	
	parentDivObj.classList.add('jhsjhs');
	alert(parentDivObj.className);
	
	
	
	
</script>
</html>