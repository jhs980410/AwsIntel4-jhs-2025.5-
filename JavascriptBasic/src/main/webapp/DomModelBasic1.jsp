<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조</title>

</head>
<body>

	<div id='parentDiv'>
		<h1>DOM</h1>
		<p id='childContent'>문서의 각 요소(객체)들을 구조화한 것입니다.</p>
	</div>

</body>


<script type="text/javascript">
// 원거리 선택자
// id선택자: 태그에 지정한 id 
	var mtObj = document.getElementById('parentDiv');
	myObj.style.border = '1px solid black';

	var childContentObj = document.getElementById('childContent');
	
	alert(childContentObj.id);
	childContent.style.color = '#f00';
</script>
</html>