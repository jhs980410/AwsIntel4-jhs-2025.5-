<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조</title>

</head>
<body>

	<div>
		<h1>DOM</h1>
		<p>문서의 각 요소(객체)들을 구조화한 것입니다.</p>
		<p id='imChild'>나를 찾고 부모의 태그를 찾아서 경계선을 적용하시오</p>
		<p>문서의 각 요소(객체)들을 구조화한 것입니다.</p>
		<p>문서의 각 요소(객체)들을 구조화한 것입니다.</p>
	</div>
	
</body>

<script type="text/javascript">
	var pTagId = document.getElementById('imChild').parentNode;
	
	pTagId.style.border = '3px solid red';
</script>

</html>