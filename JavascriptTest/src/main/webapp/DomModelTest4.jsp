<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조 CRUD</title>

<style type="text/css">
</style>

</head>
<body>
	<div id="theBox">
		<h1>요소 생성 연습</h1>

	</div>
</body>

<script type="text/javascript">
	var boxTag = document.getElementById('theBox');
	boxTag.style.backgroundColor = '#ddd';
	boxTag.style.border = '1px solid black';
	//태그만들기 // 
	var newDivTag = document.createElement("div");
	var newPtag = document.createElement("p");
	var newSpantag1 = document.createElement("Span");
	var newSpantag2 = document.createElement("Span");

	//자식관계설정//
	boxTag.appendChild(newDivTag);
	newDivTag.appendChild(newPtag);
	newDivTag.appendChild(newSpantag1);
	newDivTag.appendChild(newSpantag2);
	//텍스트생성 // 
	var pTagTxt1 = document.createTextNode('안녕');
	var spanTagTxt1 = document.createTextNode('1');
	var spanTagTxt2 = document.createTextNode('2');
	//텍스트입력// 
	newPtag.appendChild(pTagTxt1);
	newSpantag1.appendChild(spanTagTxt1);
	newSpantag2.appendChild(spanTagTxt2);
	//속성부여 
	var spanTaglist = document.getElementsByClassName('spanGroup');
	newDivTag.setAttribute("id", "crudDiv");
	newSpantag1.setAttribute('class', 'spanGroup');
	newSpantag2.setAttribute('class', 'spanGroup');
	boxTag.setAttribute('style',
			'border: 1px solid black; background-color: #ddd');
	newPtag.setAttribute('style', 'border: 1px solid black');
	for (var i = 0; i < spanTaglist.length; i++) {

		spanTaglist[i].setAttribute('style',
				'border: 1px solid black; color: red');

	}
	

</script>

</html>