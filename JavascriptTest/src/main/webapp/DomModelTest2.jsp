<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조2</title>

</head>
<body>
	<div id='topTag'>
		<h1>선택자</h1>
		<h2 id="title">원거리 선택자</h2>
		<ul>
			<li class='oddLiTag'>getElementById</li>
			<li>getElementsByTagnName</li>
		</ul>
		<h2 id="title2">근거리 선택자</h2>
		<ul id="list">
			<li class='oddLiTag'>parentNode</li>
			<li>childNodes</li>
			<li class='oddLiTag'>children</li>
			<li>firstChild</li>
			<li class='oddLiTag'>previousSibling</li>
			<li>nextSibling</li>
		</ul>
	</div>
</body>

<script type="text/javascript">
	//	topTag를 활용하여 ul태그들은 경계선을 동일하게
	//	검은색으로 설정한다
	var myList = document.getElementById('topTag');
	var myUl = myList.getElementsByTagName('ul');
	for (var i = 0; i < myUl.length; i++) {
		myUl[i].style.border = '3px solid black';
	}
	//	topTag를 활용하여 전체 li 중 홀수 번째의 태그들에 class를 설정하여
	//	글자들의 크기를 10px로 적용하시오
	var myLi = myList.getElementsByTagName('li');
	for (var i = 0; i < myLi.length; i++) {
		if (i % 2 == 0) {
		myLi[i].style.fontSize='10px';
		}
	}
	alert(myLi[0].style.fontSize);
	
</script>

</html>