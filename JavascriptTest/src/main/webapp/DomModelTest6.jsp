<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>new document</title>
<style type="text/css">
#parentDiv, #parentDiv2 {
	border: 1px solid black;
}
</style>

</head>

<body>
	<hr>
	<div id="parentDiv">
		<h1>DOM</h1>
		<p id='childContent'>문서의 각 요소(객체)들을 구조화 한것입니다.1</p>
		<div>문서의 각 요소(객체)들을 구조화 한것입니다.2</div>
	</div>

</body>

<script type="text/javascript">
	/* 	var parentDiv2 = document.createElement('div');
	 parentDiv2.setAttribute('id', 'parentDiv2');
	
	 var childTag1 = document.createElement('p');
	 childTag1.setAttribute('class', 'childTag');
	 childTag1.textContent = "문서의 각 요소(객체)들을 구조화한 것입니다.1";
	
	 var childTag2 = document.createElement('div');
	 childTag2.setAttribute('class', 'childTag');
	 childTag2.textContent = "문서의 각 요소(객체)들을 구조화한 것입니다.2";
	
	 var childTag3 = document.createElement('div');
	 childTag3.setAttribute('class', 'childTag');
	 childTag3.textContent = "문서의 각 요소(객체)들을 구조화한 것입니다.3";
	
	 parentDiv2.appendChild(childTag1);
	 parentDiv2.appendChild(childTag2);
	 parentDiv2.appendChild(childTag3);
	
	 var bodyChild = document.getElementById('parentDiv');
	
	 var childTag4 = document.createElement('hr');
	
	 document.body.appendChild(parentDiv2);
	 document.body.appendChild(childTag4);
	 document.body.appendChild(bodyChild); */

	var parentDiv = document.getElementById('parentDiv');

	var copyDiv = parentDiv.cloneNode(true);

	var h1Tag = copyDiv.getElementsByTagName("h1");

	copyDiv.removeChild(h1Tag[0]);

	var childTag3 = document.createElement('div');
	childTag3.setAttribute('class', 'childTag');
	childTag3.textContent = "문서의 각 요소(객체)들을 구조화한 것입니다.3";

	copyDiv.appendChild(childTag3);
	copyDiv.setAttribute('id', 'parentDiv2');
	for (var i = 0; i < copyDiv.children.length; i++) {
		copyDiv.children[i].setAttribute('class', 'childTag');
	}
	copyDiv.children[0].removeAttribute('id');

	document.body.insertBefore(copyDiv, document.body.children[0]);

	
</script>
</html>