<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조2</title>

</head>
<body>
	<div>
		<h1>선택자</h1>
		<h2 id="title">원거리 선택자</h2>
		<ul>
			<li class='myChoiceTag1'>getElementById</li>
			<li class='myChoiceTag1'>getElementsByTagnName</li>
		</ul>
		<h2 id="title2">근거리 선택자</h2>
		<ul id="list">
			<li class='myChoiceTag2'>parentNode</li>
			<li class='myChoiceTag2'>childNodes</li>
			<li class='myChoiceTag2'>children</li>
			<li class='myChoiceTag2'>firstChild</li>
			<li class='myChoiceTag2'>previousSibling</li>
			<li class='myChoiceTag2'>nextSibling</li>
		</ul>
	</div>
</body>

<script type="text/javascript">
	//   서로 다른 ul을 통해 li들을 각각 적용한다
	//   첫번째 ul의 li들은 배경색을 분홍색으로 지정한다
	//   두번째 ul의 li들은 경계선을 모두 서로 다른 값으로 지정한다
	var myList = document.getElementsByTagName('ul');
	var childList1 = myList[0].getElementsByClassName('myChoiceTag1');
	childList1[0].style.backgroundColor='pink';
	childList1[1].style.backgroundColor='pink';
	
	var childList2 = myList[1].getElementsByClassName('myChoiceTag2');
	childList2[0].style.border ='3px solid blue';
	childList2[1].style.border ='3px solid red';
	childList2[2].style.border ='3px solid green';
	childList2[3].style.border ='3px solid orange';
	childList2[4].style.border ='3px solid gray';
	childList2[5].style.border ='3px solid #f88';
	
	
	
	
	
</script>

</html>